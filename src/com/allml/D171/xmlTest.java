package com.allml.D171;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class xmlTest {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document read = reader.read("src\\com\\allml\\D171\\xml.xml");
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        //有很多子元素，会获取第一个子元素
        Element user = rootElement.element("user");
        System.out.println(user.elementText("name"));

        //获取元素的属性信息
        System.out.println(user.attributeValue("id"));
    }
}