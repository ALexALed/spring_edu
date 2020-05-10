package com.alexaled.spring_full.spring_full;

import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@formatter:off
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@formatter:on

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class SpringFullApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private CatRepository catRepository;

	@BeforeEach
	public void before() throws Exception {
		Stream.of("Felix", "Garfield", "Whiskers").forEach(n -> catRepository.save(new Cat(n)));

	}

	@Test
	public void catReflectedInRead() throws Exception {
		MediaType halJson = MediaType.parseMediaType("application/hal+json");
		this.mvc.perform(get("/cats")).andExpect(status().isOk()).andExpect(content().contentType(halJson))
				.andExpect(mvcResult -> {
					String contentAsString = mvcResult.getResponse().getContentAsString();
					assertTrue(
							contentAsString.split("totalElements")[1].split(":")[1].trim().split(",")[0].equals("3"));
				});

	}

}
