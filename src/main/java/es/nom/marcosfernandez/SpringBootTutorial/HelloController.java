package es.nom.marcosfernandez.SpringBootTutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RestController combines @Controller and @ResponseBody

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
