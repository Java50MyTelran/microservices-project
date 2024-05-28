package telran.microservices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import telran.microservices.controller.Service2Controller;
@SpringBootTest
class Service2Test {
	@Autowired
Service2Controller service2Controller;
	@Test
	void test() {
		//TODO
	}

}
