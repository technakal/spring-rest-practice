package com.technakal.bootstrap.web;

import com.technakal.bootstrap.service.WoofWoofService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(WoofWoofController.class)
public class WoofWoofUnitTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  WoofWoofService woofWoofService;

  @Test
  public void getAllWoofWoofs() throws Exception {
    mockMvc.perform(get("/api"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(content().json("[]"))
        .andDo(print());
    verify(woofWoofService, times(1)).retrieveAllWoofWoofs();
  }

  @Test
  public void getWoofWoofBreedById() throws Exception {
    mockMvc.perform(get("/api/1/breed"))
        .andExpect(status().isOk())
        .andDo(print());
    verify(woofWoofService, times(1)).retrieveBreedById(1L);
  }
}
