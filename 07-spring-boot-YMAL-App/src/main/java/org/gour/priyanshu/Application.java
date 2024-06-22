package org.gour.priyanshu;

import org.gour.priyanshu.beans.Company;
import org.gour.priyanshu.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// Start the container
		System.out.println("***********Container Started****************");
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);

		DataSource source = context.getBean(DataSource.class);
		System.out.println("DataSource is :: "+source.getClass().getName());

		System.out.println();

		// closing the container
		((ConfigurableApplicationContext) context).close();
		System.out.println("***********Container Stopped****************");
	}

}