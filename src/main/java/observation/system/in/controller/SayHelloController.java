package observation.system.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller -- use to make mvc controller & @ResponseBody -- convert json to object
public class SayHelloController {

    // HTTP GET REQUEST so use @GetMapping annotation.
    // http://localhost:8080/say-hello
    @GetMapping("/say-hello")
    public String sayHello() {
        return "Hello World";
    }
}
