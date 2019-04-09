import java.io.File;
import java.io.IOException;
import java.util.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class XmlStuff {


	public List readXML(){  

	     SAXBuilder saxBuilder = new SAXBuilder();  
	     File file = new File("importfiles/JLO0967_UH_20190116092851.xml");  
	     System.out.println("file: " + file);
	     List<Element> uevtList = null;
	     List<Element> uevtList2 = null;
	     List<Element> uevtList3 = null;
	     List<Element> uevtList4 = null;
	  
	  try {  
	   Document document = saxBuilder.build(file);  
	   System.out.println("document" + document);
	   Element rootNode = document.getRootElement();  
	   System.out.println("rootNode: " + rootNode);
	   uevtList = rootNode.getChildren("UEVT_Daten");
	   System.out.println("uevtList = rootNode.getChildren(UEVT_Daten): " + uevtList);  

	   uevtList2 = rootNode.getChildren("Stift-Info");
	   System.out.println("uevtList2 = rootNode.getChildren(Stift-Info): " + uevtList2); 
	   
	   uevtList3 = rootNode.getChildren("Zeitpunkt_UEVT-Aenderung");
	   System.out.println("uevtList3 = rootNode.getChildren(Zeitpunkt_UEVT-Aenderung): " + uevtList3); 
	   
	   uevtList4 = rootNode.getChildren("EVT-Kopf");
	   System.out.println("uevtList4 = rootNode.getChildren(EVT-Kopf): " + uevtList4); 
	   
	   
	   System.out.println("\n-----Inhalt des XMLs:-----");
	      
	   for(int i=0;i<=uevtList.size()-1;i++){
		   
		   System.out.println("uevtList.size(): " + uevtList.size());
		   System.out.println("\ni: " + i);
	       
		   Element element = uevtList.get(i);
	       System.out.println("Element element = uevtList.get(i): " +  element);
	       
	       
	       System.out.println("UeVtEvsStift : "+element.getChildText("UeVtEvsStift"));  
	       System.out.println("Status : "+element.getChildText("Status"));  
	       System.out.println("GGS : "+element.getChildText("GGS"));  
	       System.out.println("Leitung_UEVT : "+element.getChildText("Leitung_UEVT"));  
	   }  
	   System.out.println("\n-----XML Ende----------\n");	          
	  } catch (JDOMException e) {  
	   e.printStackTrace();  
	  } catch (IOException e) {  
	   e.printStackTrace();  
	  }
	  System.out.println("return uevtList: " + uevtList);
	return uevtList;  
	}
	
	
}
