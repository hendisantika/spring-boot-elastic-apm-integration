package com.hendisantika.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elastic-apm-integration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/09/21
 * Time: 08.01
 */
@RestController
public class TestController {
    @GetMapping("/super-fast")
    public String getSuperFastApi() {
        return "I'm super fast.";
    }

    @GetMapping("/fast")
    public String getFastApi() throws InterruptedException {

        Thread.sleep(20); // sleep for 20 milliseconds
        return "I'm fast!";
    }
}
