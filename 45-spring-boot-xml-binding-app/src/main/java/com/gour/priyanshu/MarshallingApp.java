package com.gour.priyanshu;


import java.io.File;

import com.gour.priyanshu.bean.Address;
import com.gour.priyanshu.bean.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class MarshallingApp {
    public static void main(String[] args) throws Exception {

        Person person = new Person();

        person.setId(10);
        person.setEmail("sachin@gmail.com");
        person.setGender("male");
        person.setName("sachin");

        Address address = new Address();
        address.setCity("bandra");
        address.setState("Maharshtra");
        address.setCountry("IND");

        person.setAddress(address);

        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(person, new File("/Users/priyanshugour/Desktop/SpringAndMicroservices/spring-boot/45-spring-boot-xml-binding-app/src/main/resources/person.xml"));
        System.out.println("********Marshalling Completed**********");
    }
}