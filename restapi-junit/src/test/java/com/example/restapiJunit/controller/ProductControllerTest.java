package com.example.restapiJunit.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.apache.catalina.connector.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.restapiJunit.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ProductControllerTest
{
	@Autowired
	private TestRestTemplate	template;

	@Test
	public void testGetAllProducts ()
	{
		ResponseEntity<Product[]> responseEntity = template.getForEntity ("/api/product/all", Product[].class);
		assertThat (Response.SC_OK, equalTo (responseEntity.getStatusCodeValue ()));
	}
}
