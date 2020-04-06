package me.gabrielkirsten.testcontainermockserver

import org.junit.jupiter.api.Test
import org.mockserver.client.MockServerClient
import org.mockserver.model.HttpRequest
import org.mockserver.model.HttpResponse
import org.testcontainers.containers.MockServerContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
class TestcontainerMockserverApplicationTests {

	companion object {
		@Container
		private val mockServer = MockServerContainer()
	}

@Test
fun mockContainer() {
	MockServerClient(mockServer.containerIpAddress, mockServer.serverPort)
		.`when`(HttpRequest.request()
			.withPath("/person")
			.withQueryStringParameter("name", "peter"))
		.respond(HttpResponse.response()
			.withBody("Peter the person!"))
}

}
