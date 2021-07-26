package org.example.base;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class Xml {
    URL resource = this.getClass().getResource("/pom.xml");

    public static void main(String[] args) {
        Xml xml = new Xml();
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml.resource.getFile());
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
