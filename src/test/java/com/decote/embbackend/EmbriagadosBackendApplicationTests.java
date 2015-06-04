package com.decote.embbackend;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmbriagadosBackendApplication.class)
@WebAppConfiguration
public class EmbriagadosBackendApplicationTests {

	@Test
	public void contextLoads() throws SQLException, URISyntaxException {
		Assert.assertTrue(true);
	}
	
}
