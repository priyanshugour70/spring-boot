package org.gour.priyanshu;

import org.gour.priyanshu.beans.BillGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// Start the container
		System.out.println("***********Container Started****************");
		ApplicationContext context = SpringApplication.run(Application.class, args);

		BillGenerator generator = context.getBean(BillGenerator.class);
		System.out.println(generator);

		// closing the container
		((ConfigurableApplicationContext) context).close();
		System.out.println("***********Container Stopped****************");
	}

}
