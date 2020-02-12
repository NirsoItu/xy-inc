package com.xyinc.gps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyinc.gps.controller.PoisController;
import com.xyinc.gps.model.Pois;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PoisController.class)
public class PoisControllerIntegrationTest {

    @Autowired
    protected MockMvc mockMvc;

    @Test
    public void getAllPois() throws Exception
    {
        mockMvc.perform( MockMvcRequestBuilders
                .get("/allPois")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.pois").exists());
    }

    @Test
    public void getUnderTen() throws Exception
    {
        mockMvc.perform( MockMvcRequestBuilders
                .get("/underTen")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.pois").exists());
    }

    @Test
    public void addPoi() throws Exception
    {
        mockMvc.perform( MockMvcRequestBuilders
                .post("/addPoi")
                .content(asJsonString(new Pois()))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.Pois").exists());
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
