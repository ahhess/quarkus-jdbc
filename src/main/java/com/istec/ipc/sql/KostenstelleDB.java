package com.istec.ipc.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.istec.ipc.IPCKonstanten;
import com.istec.ipc.entities.Kostenstelle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.agroal.api.AgroalDataSource;

/**
 * Diese Klasse kapselt die Datenbankzugriffe der Klasse KostenstelleBean.
 * 
 * @author jk
 */
@Dependent
public class KostenstelleDB {
	private static Logger LOGGER = LoggerFactory.getLogger(KostenstelleDB.class);

	@Inject
	AgroalDataSource objConnPool;

	/**
	 * Ermitteln aller Kostenstellen
	 */
	public ArrayList<Kostenstelle> getAlleKostenstellen() throws SQLException {
		String strSelect = "SELECT kostenstelleID, kostenstelle, bezeichnung, standort FROM kostenstelle ORDER BY kostenstelle";
		return getKostenstellen("KostenstelleDB.getAlleKostenstellen()", strSelect);
	}

	/**
	 * Ermitteln aller Kostenstellen, zu denen es aktive Mitarbeiter gibt
	 */
	public ArrayList<Kostenstelle> getMAKostenstellen() throws SQLException {
		String strSelect = "SELECT DISTINCT kostenstelle.kostenstelleID, kostenstelle.kostenstelle, kostenstelle.bezeichnung, kostenstelle.standort"
				+ " FROM kostenstelle"
				+ " INNER JOIN mitarbeiter ON mitarbeiter.kostenstelleid = kostenstelle.kostenstelleid"
				+ " WHERE mitarbeiter.mitarbeiterstatusid = " + IPCKonstanten.MITARBEITER_AKTIV
				+ " ORDER BY kostenstelle.kostenstelle";
		return getKostenstellen("KostenstelleDB.getMAKostenstellen()", strSelect);
	}

	public Kostenstelle getKostenstelle(int id) throws SQLException {
		String strSelect = "SELECT kostenstelleID, kostenstelle, bezeichnung, standort FROM kostenstelle where kostenstelleID="
				+ id;
		ArrayList<Kostenstelle> list = getKostenstellen("KostenstelleDB.getKostenstelle(" + id + ")", strSelect);
		return list.isEmpty() ? null : list.get(0);
	}

	public Kostenstelle getKostenstelle(String kostenstelle) throws SQLException {
		String strSelect = "SELECT kostenstelleID, kostenstelle, bezeichnung, standort FROM kostenstelle where kostenstelle="
				+ kostenstelle;
		ArrayList<Kostenstelle> list = getKostenstellen("KostenstelleDB.getKostenstelle(" + kostenstelle + ")",
				strSelect);
		return list.isEmpty() ? null : list.get(0);
	}

	/**
	 * interne eigentlilche DB-Zugriffsmethode
	 */
	private ArrayList<Kostenstelle> getKostenstellen(String method, String strSelect) throws SQLException {
		ArrayList<Kostenstelle> ksts = new ArrayList<Kostenstelle>();
		Connection objConn = null;
		Statement stmnt = null;
		ResultSet rSet = null;

		LOGGER.debug("%s: %s", method, strSelect);

		try {
			objConn = objConnPool.getConnection();
			stmnt = objConn.createStatement();
			rSet = stmnt.executeQuery(strSelect);

			while (rSet.next()) {
				ksts.add(createKst(rSet));
			}
			rSet.close();
		} finally {
			if (stmnt != null)
				stmnt.close();
			if (objConn != null)
				objConn.close();
		}
		return ksts;
	}

	private Kostenstelle createKst(ResultSet rSet) throws SQLException {
		Kostenstelle objKst = new Kostenstelle();
		objKst.setKostenstelleID(rSet.getInt("kostenstelleID"));
		objKst.setKostenstelle(rSet.getString("kostenstelle"));
		objKst.setKostenstellenbezeichnung(rSet.getString("bezeichnung"));
		objKst.setStandort(rSet.getString("standort"));
		return objKst;
	}

}