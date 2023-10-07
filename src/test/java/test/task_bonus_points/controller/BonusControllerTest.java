package test.task_bonus_points.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class BonusControllerTest {
    private static final String INCREASE_BONUS_URL = "/mapi/v1/bonuses/increase";
    private static final String DECREASE_BONUS_URL = "/mapi/v1/bonuses/decrease";
    @Autowired
    WebApplicationContext webApplicationContext;

    @Test
    void shouldCheckIncreaseBonusUrlsAvailable() {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        try {
            mockMvc.perform(post(INCREASE_BONUS_URL, new Object())).andExpect(status().isBadRequest());
            mockMvc.perform(post(DECREASE_BONUS_URL, new Object())).andExpect(status().isBadRequest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}