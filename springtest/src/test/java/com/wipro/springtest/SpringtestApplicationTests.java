package com.wipro.springtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.client.RestTestClient;

import com.wipro.springtest.controller.GreetingController;
import com.wipro.springtest.controller.GreetingService;
import com.wipro.springtest.controller.HomeController;
import static org.mockito.Mockito.when;

@WebMvcTest(GreetingController.class)
@AutoConfigureRestTestClient
class WebMockTest {

	@Autowired
	private RestTestClient restTestClient;

	@MockitoBean
	private GreetingService service;

	@Test
	void greetingShouldReturnMessageFromService() throws Exception {
		when (service.greet()).thenReturn("Hello, Mock");
		restTestClient.get().uri("/greeting")
				.exchange()
				.expectBody(String.class)
				.isEqualTo("Hello, Mock");
	}
}
