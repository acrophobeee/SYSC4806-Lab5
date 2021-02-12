package app;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import app.servingwebcontent.BuddyInfoController;
import app.servingwebcontent.BuddyInfoRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(BuddyInfoController.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BuddyInfoRepository service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
//        when(service.greet()).thenReturn("Hello, Mock");
        this.mockMvc.perform(get("/buddy")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("<title>Modify BuddyInfo</title>")));
    }
}