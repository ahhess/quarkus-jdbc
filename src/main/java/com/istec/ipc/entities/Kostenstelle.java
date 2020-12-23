package com.istec.ipc.entities;

/** 
*   Objekte der Klasse Kostenstelle enthalten Information zu den einzelnen Kostenstellen.
*   @author jk
*   @version 1.0 
*/
public class Kostenstelle 
{
/** ID der Kostenstelle (interner Schlüssel)*/
  private int intkostenstelleID;
/** Name der Kostenstelle */
  private String strKostenstelle;
/** Bezeichnung der Kostenstelle */
  private String strKstBez;
/** Standort der Kostenstelle*/
  private String strStandort;

    
/** Setter für KostenstelleID */
  public void setKostenstelleID(int intkostenstelleID){
    this.intkostenstelleID = intkostenstelleID;
  }
/**  Getter für KostenstelleID */ 
  public int getKostenstelleID(){
    return intkostenstelleID;
  }
/**  Setter für Kostenstelle */
  public void setKostenstelle(String kostenstelle){
    this.strKostenstelle = kostenstelle;
  }
/**  Getter für Kostenstelle */
  public String getKostenstelle(){
    return strKostenstelle;
  }
/**  Setter für Kostenstellenbezeichnung */
  public void setKostenstellenbezeichnung(String kstBez){
    if(kstBez==null){
      this.strKstBez = "";
    }
    else{
      this.strKstBez = kstBez;
    }
  }
/**  Getter für Kostenstellenbezeichnung */
  public String getKostenstellenbezeichnung(){
    return strKstBez;
  }
/**  Setter für Standort */
  public void setStandort(String standort){
    if(standort==null){
      this.strStandort = "";
    }
    else{  
      this.strStandort = standort;
    }
  }
/**  Getter für Standort */
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