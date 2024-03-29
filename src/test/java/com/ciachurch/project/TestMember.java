package com.ciachurch.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestMember {

    @Autowired
    MockMvc mvc;

    @Test
    public void whenRegisterMember_thenReturnMessageSuccess(){

    }

    @Test
    public void whenUpdateMember_thenReturnMessageSuccess(){

    }

    @Test
    public void whenGetMember_thenReturnMember(){

    }

    @Test
    public void whenDeleteUser_thenReturnSuccess(){

    }
}
