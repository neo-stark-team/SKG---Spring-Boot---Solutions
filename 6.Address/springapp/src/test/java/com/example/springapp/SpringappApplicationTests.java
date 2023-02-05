package com.example.springapp;

import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
import com.example.springapp.Controllers.ApiController;
import com.example.springapp.Models.Address;
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

		Address address = new Address();

		address.setName("Demo");
		address.setDoorNo(1);
		address.setStreetName("Demo Street");
		address.setPincode(111111);
		address.setArea("Demo Area");
		address.setDistrict("Coimbatore");
		address.setState("Tamil Nadu");
		address.setCountry("India");

		given(apiController.getAddress()).willReturn(new ResponseEntity<Address>(address,HttpStatus.OK));

		mockMvc.perform(MockMvcRequestBuilders.get("/address")
						.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andReturn();
	}

	@Test
	void test_case2() throws Exception{	

		Address address = new Address();

		address.setName("Demo");
        address.setDoorNo(1);
        address.setStreetName("Demo Street");
        address.setPincode(111111);
        address.setArea("Demo Area");
        address.setDistrict("Coimbatore");
        address.setState("Tamil Nadu");
        address.setCountry("India");

		given(apiController.getAddress()).willReturn(new ResponseEntity<Address>(address,HttpStatus.OK));

		 mockMvc.perform(MockMvcRequestBuilders.get("/address")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$.doorNo", is(address.getDoorNo())))
						.andReturn();
	}

	@Test
	void test_case3() throws Exception{	

		Address address = new Address();

		address.setName("Demo");
        address.setDoorNo(1);
        address.setStreetName("Demo Street");
        address.setPincode(111111);
        address.setArea("Demo Area");
        address.setDistrict("Coimbatore");
        address.setState("Tamil Nadu");
        address.setCountry("India");

		given(apiController.getAddress()).willReturn(new ResponseEntity<Address>(address,HttpStatus.OK));

		 mockMvc.perform(MockMvcRequestBuilders.get("/address")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$.state", is(address.getState())))
						.andReturn();
	}

	@Test
	void test_case4() throws Exception{	

		Address address = new Address();

		address.setName("Demo");
        address.setDoorNo(1);
        address.setStreetName("Demo Street");
        address.setPincode(111111);
        address.setArea("Demo Area");
        address.setDistrict("Coimbatore");
        address.setState("Tamil Nadu");
        address.setCountry("India");

		given(apiController.getAddress()).willReturn(new ResponseEntity<Address>(address,HttpStatus.OK));

		 mockMvc.perform(MockMvcRequestBuilders.get("/address")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$.name", is(address.getName())))
						.andReturn();
	}

	@Test
	void test_case5() throws Exception{	

		Address address = new Address();

		address.setName("Demo");
        address.setDoorNo(1);
        address.setStreetName("Demo Street");
        address.setPincode(111111);
        address.setArea("Demo Area");
        address.setDistrict("Coimbatore");
        address.setState("Tamil Nadu");
        address.setCountry("India");

		given(apiController.getAddress()).willReturn(new ResponseEntity<Address>(address,HttpStatus.OK));

		 mockMvc.perform(MockMvcRequestBuilders.get("/address")
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$.area", is(address.getArea())))
						.andReturn();
	}

}
