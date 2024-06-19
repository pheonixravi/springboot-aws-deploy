package in.ravi.awsdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
@GetMapping("/message")
    public String getMessage( ){

        return "Message from AWS ECS";
    }
}
