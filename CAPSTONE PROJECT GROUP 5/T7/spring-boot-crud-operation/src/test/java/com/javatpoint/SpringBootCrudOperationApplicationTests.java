package com.javatpoint;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.assertj.core.api.Assert;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatpoint.model.Books;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

@SpringBootTest
class SpringBootCrudOperationApplicationTests {
	ObjectMapper om = new ObjectMapper();

	@Test
	void contextLoads() {
	}
	@Test
	public void test1() throws JSONException, JsonProcessingException{
		System.out.println("==================Test1=========================");
		
		Books Book = new Books(100,"The Pilgrim's Progress","John Bunyan",1000);
		
		String bookJSON = om.writerWithDefaultPrettyPrinter().writeValueAsString(Book);
		System.out.println(bookJSON.toString());

		Response response=given().contentType(ContentType.JSON).
		body(bookJSON).
		when().
		post("http://localhost:8080/books");
		System.out.println("Posted book1 and the response is: " +response.getBody().asString());
		
		Books Book1 = new Books(103,"Famous Five","Enid Blyton",500);
		String book1JSON = om.writerWithDefaultPrettyPrinter().writeValueAsString(Book1);
		System.out.println(book1JSON.toString());
		Response response2=given().contentType(ContentType.JSON).
		body(book1JSON).
		when().
		post("http://localhost:8080/books");
		System.out.println("Posted book2 and the response is "+response2.getBody().asString());
	}
	@Test
	public void test2() {
		System.out.println("==================Test2=========================");

		Response response=given().get("http://localhost:8080/book/100");
		System.out.println("Response is"+response.getBody().asString());

	}
	
	@Test
	public void test3() throws JSONException, JsonProcessingException {
		System.out.println("==================Test3=========================");

		Books Book = new Books(103,"Famous Five","Enid Blyton",1500);
		
		String bookJSON = om.writerWithDefaultPrettyPrinter().writeValueAsString(Book);
		System.out.println(bookJSON.toString());

		Response response = given().contentType(ContentType.JSON).
		body(bookJSON).
		when().
		put("http://localhost:8080/books");
		System.out.println("Put book and the response is: " + response.getBody().asString());
	}

	@Test
	public void test4() {
		System.out.println("==================Test4=========================");
		Response response =given().
		delete("http://localhost:8080/book/103");
		System.out.println("Deleted and the response is: "+response.getBody().asString());
	}	


}
