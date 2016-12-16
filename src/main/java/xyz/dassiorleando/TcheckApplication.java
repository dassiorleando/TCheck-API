package xyz.dassiorleando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by dassiorleando on 16/12/2016.
 */
@SpringBootApplication
@EnableMongoRepositories
public class TcheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcheckApplication.class, args);
	}
}
