package com.wubaoguo.springboot.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.wubaoguo.springboot.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTests {
	private MockMvc mvc;
	
	@Before 
    public void setUp() throws Exception { 
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build(); 
    } 
	
	@Test 
    public void testUserController() throws Exception { 
        // 测试UserController 
        RequestBuilder request = null; 

        // 1、get查一下user列表，应该为空 
        request = get("/user/1"); 
        mvc.perform(request) 
                .andExpect(status().isOk()) 
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"zhang\"}"))); 
	}
}
