package com.istec.ipc.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.istec.ipc.entities.Projekttyp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.agroal.api.AgroalDataSource;

/**
 * Diese Klasse kapselt die Datenbankzugriffe auf die Tabelle Projekttyp
 */
@Dependent
public class ProjekttypDB {
  private static Logger LOGGER = LoggerFactory.getLogger(ProjekttypDB.class);

  @Inject
  AgroalDataSource ds;

  /**
   * Diese Methode holt Daten zu allen vorhandenen Projekttypen aus der Datenbank
   * .
   * 
   * @return ArrayList mit Projekttyp-Objekten
   */
  public ArrayList<Projekttyp> getAlleTypen() throws SQLException {
    String strSelect = "SELECT projekttypID, projekttyp, bezeichnung FROM Projekttyp ORDER BY Projekttyp";
    return getProjekttypen(strSelect);
  }

  public Projekttyp getProjekttyp(int id) throws SQLException {
    String strSelect = "SELECT projekttypID, projekttyp, bezeichnung FROM Projekttyp where projekttypID=" + id;
    ArrayList<Projekttyp> list = getProjekttypen(strSelect);
    return list.isEmpty() ? null : list.get(0);
  }

  private ArrayList<Projekttyp> getProjekttypen(String strSelect) throws SQLException {

    ArrayList<Projekttyp> vecTyp = new ArrayList<Projekttyp>();
    Statement stmnt = null;
    ResultSet rSet = null;
    Connection objConn = null;

    LOGGER.info("ProjekttypDB.getProjekttypen(): %s", strSelect);

    try {
      objConn = ds.getConnection();
      stmnt = objConn.createStatement();
      rSet = stmnt.executeQuery(strSelect);

      while (rSet.next()) {
        vecTyp.add(createProjekttyp(rSet));
      }
      rSet.close();
    } finally {
      try {
        stmnt.close();
      } catch (SQLException e) {
      }
      if (objConn != null)
        objConn.close();
    }
    return vecTyp;
  }

  private Projekttyp createProjekttyp(ResultSet rSet) throws SQLException {
    Projekttyp objTyp = new Projekttyp();
    objTyp.setProjekttypID(rSet.getInt("projekttypID"));
    objTyp.setProjekttyp(rSet.getString("projekttyp"));
    objTyp.setProjekttypBezeichnung(rSet.getString("bezeichnung"));
    return objTyp;
  }
}
