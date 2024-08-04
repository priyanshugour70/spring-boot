package com.finopsrj.yellowkart;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finopsrj.yellowkart.bean.Customer;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        try {
            // use ObjectMapper class
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and put into java object
            File file = new File("/Users/priyanshugour/Desktop/SpringAndMicroservices/spring-boot/44-spring-boot-basicJSON-project/data/sample.json");

            //converting JSON to Java object
            Customer customer = mapper.
                    readValue(file, Customer.class);

            //use java object
            System.out.println(customer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}