package com.openclassrooms;

import com.openclassrooms.controller.LoginController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class SpringSecurityAuthApplicationTests {

	@Autowired
	private LoginController controller;

	@Test
	void contextLoads()throws Exception {
		assertThat(controller).isNotNull();
	}

}
