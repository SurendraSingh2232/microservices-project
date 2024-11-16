package com.ServiceA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-a")
public class TestController {

    @GetMapping("/info")
    public String info() {
        return "This is Service A";
    }
}
