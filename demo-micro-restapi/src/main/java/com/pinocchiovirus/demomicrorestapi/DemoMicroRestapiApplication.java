package com.pinocchiovirus.demomicrorestapi;

import com.pinocchiovirus.demomicrorestapi.coffee.Cofee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoMicroRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroRestapiApplication.class, args);
	}

	@GetMapping
	public List<Cofee> hello(){
		return List.of(
				new Cofee(
						1L,
						"Abdulrazak A. Osman",
						LocalDate.of(2021, Month.DECEMBER, 29),
						"0547079680"
				)
		);
	}

}
