package es.nom.marcosfernandez.SpringBootTutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//@SpringBootApplication is a convenience annotation that adds all of the following:
//@Configuration tags the class as a source of bean definitions for the application context.
//@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
//		Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
//@ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String name : beanNames) {
				System.out.println(name);
			}
		};
	}

}
