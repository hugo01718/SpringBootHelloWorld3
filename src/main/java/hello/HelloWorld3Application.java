package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld3Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorld3Application.class, args);
		System.out.println("Hello World");
	}

}
