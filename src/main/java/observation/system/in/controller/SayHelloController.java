package observation.system.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @GetMapping("/say")
    public String sayHello() {
        return "Hello World";
    }
}
