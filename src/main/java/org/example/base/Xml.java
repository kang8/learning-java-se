package org.example.base;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.net.URL;

public class Xml {
    URL resource = this.getClass().getResource("/pom.xml");

    public static void main(String[] args) {
        Xml xml = new Xml();
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml.resource.getFile());

            XPath xPath = XPathFactory.newInstance().newXPath();
            try {
                Node versionNode = (Node) xPath.compile("/project/version").evaluate(doc, XPathConstants.NODE);
                String version = versionNode.getTextContent();
                System.out.println(version);
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
