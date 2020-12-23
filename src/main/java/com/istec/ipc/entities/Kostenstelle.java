package com.istec.ipc.entities;

/** 
*   Objekte der Klasse Kostenstelle enthalten Information zu den einzelnen Kostenstellen.
*   @author jk
*   @version 1.0 
*/
public class Kostenstelle 
{
/** ID der Kostenstelle (interner Schl�ssel)*/
  private int intkostenstelleID;
/** Name der Kostenstelle */
  private String strKostenstelle;
/** Bezeichnung der Kostenstelle */
  private String strKstBez;
/** Standort der Kostenstelle*/
  private String strStandort;

    
/** Setter f�r KostenstelleID */
  public void setKostenstelleID(int intkostenstelleID){
    this.intkostenstelleID = intkostenstelleID;
  }
/**  Getter f�r KostenstelleID */ 
  public int getKostenstelleID(){
    return intkostenstelleID;
  }
/**  Setter f�r Kostenstelle */
  public void setKostenstelle(String kostenstelle){
    this.strKostenstelle = kostenstelle;
  }
/**  Getter f�r Kostenstelle */
  public String getKostenstelle(){
    return strKostenstelle;
  }
/**  Setter f�r Kostenstellenbezeichnung */
  public void setKostenstellenbezeichnung(String kstBez){
    if(kstBez==null){
      this.strKstBez = "";
    }
    else{
      this.strKstBez = kstBez;
    }
  }
/**  Getter f�r Kostenstellenbezeichnung */
  public String getKostenstellenbezeichnung(){
    return strKstBez;
  }
/**  Setter f�r Standort */
  public void setStandort(String standort){
    if(standort==null){
      this.strStandort = "";
    }
    else{  
      this.strStandort = standort;
    }
  }
/**  Getter f�r Standort */
  public String getStandort(){
    return strStandort;
  }
/** Standard-Konstruktor */  
  public Kostenstelle()
  {
  }

  public Kostenstelle(int KostenstelleID, String Kostenstelle, String Bezeichnung, String Standort){
    intkostenstelleID = KostenstelleID;
    strKostenstelle = Kostenstelle;
    strKstBez = Bezeichnung;
    strStandort = Standort;
  }
	@Override
	public String toString() {
		return "Kostenstelle [(" + intkostenstelleID + ") " + strKostenstelle + " " + strKstBez + "]";
	}
}