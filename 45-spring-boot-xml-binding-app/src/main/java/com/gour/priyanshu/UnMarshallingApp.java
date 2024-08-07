package com.gour.priyanshu;

import com.gour.priyanshu.bean.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class UnMarshallingApp {
    public static void main(String[] args) throws JAXBException {

        // Read XML data and convert to object
        JAXBContext context = JAXBContext.newInstance(Person.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        Person person = (Person) unmarshaller.unmarshal(new File("/Users/priyanshugour/Desktop/SpringAndMicroservices/spring-boot/45-spring-boot-xml-binding-app/src/main/resources/person.xml"));
        System.out.println(person);

    }
}