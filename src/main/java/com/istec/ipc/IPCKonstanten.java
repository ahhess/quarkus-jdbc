package com.istec.ipc;

/**
 * Sammlung aller IPC-Konstanten.
 */
public class IPCKonstanten {

	/*
	 * System-Konstanten
	 */
	/* Konstanten für die Konfiguration */
	public final static String IPC_PRM_KONFDATEI = "ipcKonfDatei";
	public final static String IPC_STD_KONFDATEI = "./conf/ipc.config";

	public final static String IPC_PRM_MELDUNGENDATEI = "ipcmeldungen";
	public final static String IPC_STD_MELDUNGENDATEI = "ipcmeldungen.properties";

	public final static String LOG_PRM_KONFDATEI = "log4jkonfdatei";
	public final static String LOG_STD_KONFDATEI = "log4j.config";
	
	public final static String FOP_PRM_DEBUG_XML = "fop_debug_xml"; // Für Debugzwecke XML als Datei ausgegeben werden
	public final static String FOP_STD_DEBUG_XML = null; // zB "./logs/fop_debug.xml"

	public final static String IMPORT_PRM_KONFDATEI = "importkonfdatei";
	public final static String IMPORT_STD_KONFDATEI = "import.config";

	public final static String IPC_PRM_UPLOADPFAD = "uploadpfad";

	public final static String IPC_PRM_WEBSERVICEADRESSE = "WebServiceAdresse";
	/** Zeitraum, für den die Urlaubsübersicht vorbelegt sein soll. */
	public final static String IPC_URLAUB_ZEITRAUM = "urlaubsuebersicht_zeitraum";

	/* BuRV-Konstanten */
	public final static String BURV_PRM_KONFDATEI = "burvkonfdatei";
	public final static String BURV_STD_KONFDATEI = "BuRVConfig.cfg";
	public final static String BURV_PRM_ERRORLOGDATEI = "burvErrorLogDatei";
	public final static String BURV_PRM_SQLLOGDATEI = "burvSQLLogDatei";
	public final static String BURV_WRITE_RECHT = "w";
	public final static String BURV_READ_RECHT = "r";
	public final static String BURV_EXECUTE_RECHT = "x";
	public final static String BURV_STD_FEHLERSEITE = "burv_error_page.jsp";

	/* Konstanten für Standardseiten */
	public final static String IPC_PRM_STARTSEITE = "ipcStartSeite";
	public final static String IPC_STD_STARTSEITE = "zeiten_erfassen.jsp";
	public final static String IPC_STD_FEHLERSEITE = "error_page.jsp";
	public final static String IPC_STD_FEHLERSEITE_OHNE_MENUE = "error_page1.jsp";
	public final static String IPC_STD_AUTOLOGOUTSEITE = "autologout.jsp";
	public final static String IPC_PASSWORT_AENDERN = "pwaendern.jsp";

	/* Konstanten für HttpSession-Attributnamen */
	public final static String HTTPSESSION_ATTR_EXCEPTION = "exception";
	public final static String HTTPSESSION_ATTR_BURVUSER = "objBuRVUser";
	public final static String HTTPSESSION_ATTR_MITARBEITER = "objMitarbeiter";
	public final static String HTTPSESSION_ATTR_PARTNERSUCHE = "objPartnerSuche";
	public final static String HTTPSESSION_ATTR_PASSWORTAENDERN = "pwZwingendAendern";
	public final static String HTTPSESSION_ATTR_FREIGABE = "objFreigabe";

	/*
	 * Anwendungs-Konstanten
	 */
	/* Konstante für IPC-Title-Tag */
	public final static String IPC_TITLE = "ipctitle";

	/* Konstante für wieviel Tage Zeitintervalle änderbar sind */
	public final static String IPC_TAGE_ZEITINTERVALL_AENDERBAR = "tageZeitintervalleAenderbar";
	/* Konstanten für Projektstatus. */
	public final static int PROJEKT_DEFINIERT = 1;
	public final static int PROJEKT_AKTIV = 2;
	public final static int PROJEKT_IN_GWL = 3;
	public final static int PROJEKT_BEENDET = 4;
	public final static int PROJEKT_ANGEBOT = 5;
	public final static int PROJEKT_ABSAGE = 6;

	/* Konstanten für Aktivitätstatus. */
	public final static int AKTIVITAET_DEFINIERT = 1;
	public final static int AKTIVITAET_AKTIV = 2;
	public final static int AKTIVITAET_BEENDET = 3;

	/* Konstanten für Aktivitättyp. */
	public final static int AKTIVITAET_NORMAL = 1;
	public final static int AKTIVITAET_KRANK = 2;
	public final static int AKTIVITAET_GWL = 3;
	public final static int AKTIVITAET_REISE = 4;

	/* Konstanten für Projekttyp. */
	public final static int PROJEKT_FESTPREIS = 1;
	public final static int PROJEKT_AUFWAND = 2;
	public final static int PROJEKT_INTERN = 3;
	public final static int PROJEKT_SYSTEM = 4;

	/* Konstanten für true und false. */
	public final static String DB_TRUE = "J";
	public final static String DB_FALSE = "N";

	/* Konstanten für Mitarbeiterstatus. */
	public static final int MITARBEITER_AKTIV = 1;
	public static final int MITARBEITER_INAKTIV = 2;

	/* Konstanten für Anstellungsstatus. */
	public static final int MITARBEITER_ANGESTELLT = 1;
	public static final int MITARBEITER_FREIBERUFLICH = 2;
	public static final int MITARBEITER_EHEMALIG = 3;

	/* Konstanten für SaldotypID. */
	public static final int SALDO_GLEITZEIT = 1;
	public static final int SALDO_URLAUB = 2;
	public static final int SALDO_SONDERURLAUB = 3;
	public static final int SALDO_UEBERSTUNDEN = 4;
	public static final int SALDO_JAHRESURLAUB = 5;
	public static final int SALDO_URLAUBSKORREKTUR = 6;
	public static final int SALDO_BESTAND_UNBEZAHLTER_URLAUB = 7;
	public static final int SALDO_KORREKTUR_UNBEZAHLTER_URLAUB = 8;
	// Sonderfall für Saldenübersicht 'Resturlaub' (nicht in DB)
	public static final int SALDO_RESTURLAUB = 0;

	/* Konstante für Stundensatz. */
	public static final float STUNDENSATZ_FSL = 64;
	
	/* Konstante für Mehrwertsteuersatz */
	public static final String IPC_PRM_MWSTSATZ = "mwstsatz";
	public static final String IPC_STD_MWSTSATZ = "19.00";

	/*
	 * Konstante für Zeiten ohne Tätigkeitsart (wird für Projektbericht
	 * benötigt)
	 */
	public static final String KEY_KEINE_TAETART = "_";

	/* PARTNERVERWALTUNG */
	
	/* Konstanten für Typen. */
	/* Metatypen */
	public static final int TYP_ADRESSE = 1;
	public static final int TYP_RUFNUMMER = 2;
	public static final int TYP_PARTNER = 3;
	public static final int TYP_VERKNUEPFUNG = 4;
	public static final int TYP_STATUS = 5;
	public static final int TYP_ANREDE = 6;
	public static final int TYP_FEIERTAG = 7;

	/* Konstanten zum Metatyp Partner */
	public static final int TYP_FIRMA = 110;
	public static final int TYP_ANSPRECHPARTNER = 111;

	/* Konstanten zum Metatyp Adresse */
	public static final int TYP_HAUPT_ADRESSE = 100;
	public static final int TYP_PROJEKT_ADRESSE = 103;
	
	/* Konstanten zum Metatyp Feiertag */
	public static final int TYP_FIXER_FEIERTAG = 110;
	public static final int TYP_VARIABLER_FEIERTAG = 111;

	/* Konstante für Standardverknüpfung Projekt-Partner */
	public static final int TYP_STANDARD_VERKNUEPFUNG = 123;

	public static final int TYP_STATUS_SONSTIGE = 152;

	/* Konstante der AktivitaetID des unbezahlten Urlaub */
	public static final int AKTID_UNBEZAHLTER_URLAUB = 1572;
	/* Konstante der AktivitaetID des Sonderurlaub */
	public static final int AKTID_SONDERURLAUB = 13;

	/* Anzeigename der Urlaubskorrektur */
	public static final String NAME_URLAUBSKORREKTUR = "Veränderung Sekretariat:";

	/*
	 * SSo: Konstanten für MA-Jahresbericht (Zeilen- & Spaltenanzahl der
	 * DatenMatrix)
	 */
	public static final int DM_ZEILENANZAHL = 15;
	public static final int DM_SPALTENANZAHL = 16;
	// Zeilen die angezeigt werden sollen, wenn kein unbez.Urlaub vorhanden ist.
	public static final int DM_ZEILENANZAHL_SHORT = 11;

	// Konstanten für Kostenstellen
	public static final String KST_PRO_LEINFELDEN = "550";
	public static final String KST_PRO_ETTLINGEN = "510";
	public static final String KST_3DDL_ETTLINGEN = "310";
	public static final String KST_PMM_ETTLINGEN = "320";

	/* Konstanten für die Umsatzliste: besondere Darstellung neuer und ausgeblendeter Projekte */
	public static final String UL_ANZEIGE_NEU = "*";
	public static final String UL_ANZEIGE_ANZEIGEN = "J";  
	public static final String UL_ANZEIGE_AUSBLENDEN = "N";
	
	// Konstanten für Klassen vom Stylesheet, die beim Projektübersichtsblatt
	// darstellen, ob sie ausgefüllt sein müssen
	// um bei der Vollständigkeitsprüfung als vollständig zu gelten
	public static final String VOPR_AUSGEFUELLT = "dunkel";
	public static final String VOPR_NICHT_AUSGEFUELLT = "hell";

	// Null Wert für Zahlen(int)
	public static final int INT_NULL = -1;

	/* Konstanten für Zeitenübersicht */
	public static final int ZU_PROJEKT = 1;
	public static final int ZU_AKTIVITAET = 2;
	public static final int ZU_AKTIVITAET_TAETIGKEITSART = 3;
	public static final int ZU_AKTIVITAET_BESCHREIBUNG = 4;

	// Standard Formate
	public static final String IPC_PRM_NUMBERFORMAT = "IPCNUMBERFORMAT";
	public static final String IPC_STD_NUMBERFORMAT = ",##0.00";
	public static final String IPC_PRM_NUMBERNODECFORMAT = "IPCNUMBERNODECFORMAT";
	public static final String IPC_STD_NUMBERNODECFORMAT = ",##0";
	
	public static final String IPC_PRM_RECHNUNG_FAELLIGKEITSTAGE_DEFAULT = "rechnung_faelligkeitstage_default";
	public static final String IPC_STD_RECHNUNG_FAELLIGKEITSTAGE_DEFAULT = "40";
	
}
