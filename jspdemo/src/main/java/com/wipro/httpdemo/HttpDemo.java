package com.wipro.httpdemo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder(URI.create("http://localhost:8080/mobile/1"))
				.GET().build();
		try {
			HttpResponse<String> response=client.send(request,BodyHandlers.ofString());
			System.out.println(response.body());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}


