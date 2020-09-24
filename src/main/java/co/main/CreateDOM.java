package co.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class CreateDOM {

	public  Document getDOM(String test)
			throws SAXException, ParserConfigurationException, IOException, URISyntaxException {
		Document dom = null;
		File quizFile = null;
		//Application main = new Application();
		quizFile = new File(getClass().getClassLoader().getResource(test + "-quiz-1.xml").getFile());

		//quizFile = new File("C:\\quizzes\\" + test + "-quiz-1.xml");
		System.out.println("Quiz File Absolute Path " + quizFile.getAbsolutePath());
		   String path =Paths.get("").toAbsolutePath().toString();
		    System.out.println("Quiz File Absolute Path "+path);
		    

	       // quizFile=new File("/src/main/resources/"+test+"-quiz-1.xml");
	        System.out.println("Quiz File Absolute Path "+quizFile.getAbsolutePath());
		// ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		// quizFile = new File(classloader.getResource((test + "-quiz-1.xml")).getFile());
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		try {
			dom = db.parse(quizFile);
		} catch (FileNotFoundException fileNotFound) {
			System.out.println("Error : Quiz File Not Found " + fileNotFound);
		}
		dom.getDocumentElement().normalize();
		return dom;
	}

}
