package org.acme.datasource;

import java.io.Serializable;

public class Projekttyp implements Serializable {

  private static final long serialVersionUID = 8418265790193442167L;

  private int intProjekttypID;
  /** Kurzform der Bezeichnung (z.B. f=Festpreis, a=Aufwand). */
  private String strProjekttyp;
  /** Bezeichnung (z.B. Festpreis, Aufwand). */
  private String strProjekttypBezeichnung;

  /** Setter f�r ProjekttypID. */
  public void setProjekttypID(int intProjekttypID) {
    this.intProjekttypID = intProjekttypID;
  }

  /** Getter f�r ProjekttypID. */
  public int getProjekttypID() {
    return this.intProjekttypID;
  }

  /** Setter f�r Projekttyp. */
  public void setProjekttyp(String strProjekttyp) {
    this.strProjekttyp = strProjekttyp;
  }

  /** Getter f�r Projekttyp. */
  public String getProjekttyp() {
    return this.strProjekttyp;
  }

  /** Setter f�r Projekttypbezeichnung. */
  public void setProjekttypBezeichnung(String strProjekttypBezeichnung) {
    this.strProjekttypBezeichnung = strProjekttypBezeichnung;
  }

  /** Setter f�r Projekttypbezeichnung. */
  public String getProjekttypBezeichnung() {
    return this.strProjekttypBezeichnung;
  }

  /** Standard-Konstruktor */
  public Projekttyp() {
  }

  @Override
  public String toString() {
    return "Projekttyp [(" + intProjekttypID + ") " + strProjekttyp + " " + strProjekttypBezeichnung + "]";
  }
}
