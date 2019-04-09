import java.util.List;

import org.jdom2.Element;

public class Executive {

	public static void main(String[] args) {

		//SqlStuff DBObjekt = new SqlStuff();
		XmlStuff XmlObjekt = new XmlStuff();
		
		/*
		 * Datenbankverbindung herstellen
		 * */
		//DBObjekt.connect();
		
		
		/*
		 * Datenbankverbindung trennen
		 * */
		//DBObjekt.disconnect();
		
		
		
		/*
		 * XML auslesen
		 * */
		List<Element> studentList = XmlObjekt.readXML();
	}

}
