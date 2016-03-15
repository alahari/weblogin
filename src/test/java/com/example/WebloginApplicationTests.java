package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.vedas.webLogin.WebloginApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebloginApplication.class)
@WebAppConfiguration
public class WebloginApplicationTests {

	@Test
	public void contextLoads() {
	}

}
