package coop.equidad.autos.automas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class TareaAutomasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaAutomasApplication.class, args);
	}

}
