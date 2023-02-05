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
import com.example.springapp.Models.Family;
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

		ArrayList<Family> arr = new ArrayList<Family>();

		Family m1 = new Family();

        m1.setName("Demo1");
        m1.setAge(1);
        m1.setRelation("Demo1");

        Family m2 = new Family();

        m2.setName("Demo2");
        m2.setAge(2);
        m2.setRelation("Demo2");

		arr.add(m1);
		arr.add(m2);

		given(apiController.getFamilyDetails()).willReturn(arr);

		 mockMvc.perform(MockMvcRequestBuilders.get("/")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andReturn();
	}

	@Test
	void test_case2() throws Exception{	

		ArrayList<Family> arr = new ArrayList<Family>();

		Family m1 = new Family();

        m1.setName("Demo1");
        m1.setAge(1);
        m1.setRelation("Demo1");

        Family m2 = new Family();

        m2.setName("Demo2");
        m2.setAge(2);
        m2.setRelation("Demo2");

		arr.add(m1);
		arr.add(m2);

		given(apiController.getFamilyDetails()).willReturn(arr);

		 mockMvc.perform(MockMvcRequestBuilders.get("/")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$[0].name", is(m1.getName())))
						.andReturn();
	}

	@Test
	void test_case3() throws Exception{	

		ArrayList<Family> arr = new ArrayList<Family>();

		Family m1 = new Family();

        m1.setName("Demo1");
        m1.setAge(1);
        m1.setRelation("Demo1");

        Family m2 = new Family();

        m2.setName("Demo2");
        m2.setAge(2);
        m2.setRelation("Demo2");

		arr.add(m1);
		arr.add(m2);

		given(apiController.getFamilyDetails()).willReturn(arr);

		 mockMvc.perform(MockMvcRequestBuilders.get("/")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$[1].relation", is(m2.getRelation())))
						.andReturn();
	}

	@Test
	void test_case4() throws Exception{	

		ArrayList<Family> arr = new ArrayList<Family>();

		Family m1 = new Family();

        m1.setName("Demo1");
        m1.setAge(1);
        m1.setRelation("Demo1");

        Family m2 = new Family();

        m2.setName("Demo2");
        m2.setAge(2);
        m2.setRelation("Demo2");

		arr.add(m1);
		arr.add(m2);

		given(apiController.getFamilyDetails()).willReturn(arr);

		 mockMvc.perform(MockMvcRequestBuilders.get("/")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$[0].age", is(m1.getAge())))
						.andReturn();
	}

	@Test
	void test_case5() throws Exception{	

		ArrayList<Family> arr = new ArrayList<Family>();

		Family m1 = new Family();

        m1.setName("Demo1");
        m1.setAge(1);
        m1.setRelation("Demo1");

        Family m2 = new Family();

        m2.setName("Demo2");
        m2.setAge(2);
        m2.setRelation("Demo2");

		arr.add(m1);
		arr.add(m2);

		given(apiController.getFamilyDetails()).willReturn(arr);

		 mockMvc.perform(MockMvcRequestBuilders.get("/")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$[1].age", is(m2.getAge())))
						.andReturn();
	}

}
