package com.example.springapp;

import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import java.util.ArrayList;
import com.example.springapp.Controllers.ApiController;
import com.example.springapp.Models.Student;
import static org.mockito.BDDMockito.given;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
class SpringappApplicationTests {

	@Autowired
	private  MockMvc mockMvc ;

	@MockBean
   	private ApiController apiController;

	@Test
	void test_case1() throws Exception{	

		ArrayList<Student> arr = new ArrayList<Student>();

		Student st = new Student();

		st.setStudentName("Demo");
		st.setMessage("Test!");

		arr.add(st);

		given(apiController.getWelcomeMessage()).willReturn(arr);

		 mockMvc.perform(MockMvcRequestBuilders.get("/welcome")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$[0].message", is(st.getMessage())))
						.andReturn();
	}

}
