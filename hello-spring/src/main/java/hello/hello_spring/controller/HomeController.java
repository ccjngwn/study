package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 8080/ 경로로 들어오면 이 밑이 호출
    public String home() {
        return "home"; // home.html이 호출
    }
}
