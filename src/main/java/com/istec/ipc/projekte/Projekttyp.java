package com.istec.ipc.projekte;

/**In Objekten der Klasse Projekttyp werden Daten zu Projekttyp gespeichert.*/
public class Projekttyp 
{
/** ProjekttypID (interner Schlüssel)*/
  private int intProjekttypID;
/** Kurzform der Bezeichnung (z.B. f=Festpreis, a=Aufwand).*/
  private String strProjekttyp;
/** Bezeichnung (z.B. Festpreis, Aufwand).*/
  private String strProjekttypBezeichnung;

/** Setter für ProjekttypID.*/
  public void setProjekttypID(int intProjekttypID){
    this.intProjekttypID = intProjekttypID;
  }
/** Getter für ProjekttypID.*/
  public int getProjekttypID(){
    return this.intProjekttypID;
  }
/** Setter für Projekttyp.*/
  public void setProjekttyp(String strProjekttyp){
    this.strProjekttyp = strProjekttyp;
  }
/** Getter für Projekttyp.*/
  public String getProjekttyp(){
    return this.strProjekttyp;
  }
/** Setter für Projekttypbezeichnung.*/
  public void setProjekttypBezeichnung(String strProjekttypBezeichnung){
    this.strProjekttypBezeichnung = strProjekttypBezeichnung;
  }
/** Setter für Projekttypbezeichnung.*/
  public String getProjekttypBezeichnung(){
    return this.strProjekttypBezeichnung;
  }

	@Override
	public String toString() {
		return "Projekttyp [(" + intProjekttypID + ") " + strProjekttyp + " " + strProjekttypBezeichnung + "]";
	}
}