package telran.microservices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import telran.microservices.controller.Service1Controller;
@SpringBootTest
class Service1Test {
	@Autowired
Service1Controller service1Controller;
	@Test
	void test() {
		//TODO
	}

}
