package telran.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service1")
public class Service1Controller {
@GetMapping()
	String greetings() {
		
		return "greetings from service1";
	}
}
