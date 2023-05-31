package project.chat.chat.domain.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Log4j2
public class ChatController {

    @GetMapping("/chat")
    public String chatGet() {

        log.info("@ChatController, chat GET()");

        return "chat";
    }
}
