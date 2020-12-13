package com.istec.ipc.projekte;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import io.agroal.api.AgroalDataSource;

/**
 * Diese Klasse kapselt die Datenbankzugriffe auf die Tabelle Projekttyp
 */
@Dependent
public class ProjekttypDB {
  private static Logger cat = Logger.getLogger(ProjekttypDB.class.getName());

  @Inject
  AgroalDataSource ds;

  /**
   * Diese Methode holt Daten zu allen vorhandenen Projekttypen aus der Datenbank
   * .
   * 
   * @return Vector mit Projekttyp-Objekten
   */
  public Vector<Projekttyp> getAlleTypen() throws SQLException {

    Vector<Projekttyp> vecTyp = new Vector<Projekttyp>();
    Statement stmnt = null;
    ResultSet rSet = null;
    Connection objConn = null;

    String strSelect = "SELECT projekttypID, projekttyp, bezeichnung FROM Projekttyp ORDER BY Projekttyp";
    cat.info("ProjekttypDB.getAlleTypen(): select-string: " + strSelect);

    try {
      objConn = ds.getConnection();
      stmnt = objConn.createStatement();
      rSet = stmnt.executeQuery(strSelect);

      while (rSet.next()) {
        Projekttyp objTyp = new Projekttyp();
        objTyp.setProjekttypID(rSet.getInt("projekttypID"));
        objTyp.setProjekttyp(rSet.getString("projekttyp"));
        objTyp.setProjekttypBezeichnung(rSet.getString("bezeichnung"));
        vecTyp.addElement(objTyp);
      }
      rSet.close();
      stmnt.close();
    } finally {
      if (objConn != null)
        objConn.close();
    }
    return vecTyp;
  }
}
