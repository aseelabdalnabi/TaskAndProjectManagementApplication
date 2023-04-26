package com.springbootproject.TaskAndProjectManagementApplication;
//import org.apache.log4j.Logger;

import com.springbootproject.TaskAndProjectManagementApplication.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class TaskAndProjectManagementApplication {
	private static final Logger logger= LoggerFactory.getLogger(TaskAndProjectManagementApplication.class);
	public static void main(String[] args) {
		logger.debug("Hello this is a debug message");
		logger.info("Hello this is an info message");
		SpringApplication.run(TaskAndProjectManagementApplication.class, args);

	}

}
