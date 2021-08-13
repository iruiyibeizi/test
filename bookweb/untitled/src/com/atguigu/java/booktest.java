package com.atguigu.java;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @auther zhaolixin
 * @creat 2021.04.25.17:38
 */
public class booktest {
    @Test
    public  void test1(){
        SAXReader saxReader=new SAXReader();
        try {
            Document document=saxReader.read("src/book.xml");
            System.out.println(document);
            Element rootElement = document.getRootElement();
            System.out.println(rootElement);
            List<Element> books = rootElement.elements("book");
            for(Element book: books){
                Element name = book.element("name");
                String nametext=name.getText();
                String price = book.elementText("price");
                String sn = book.attributeValue("id");
                System.out.println(name.asXML()+nametext+price+sn);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
