package io.pivotal.pal.tracker;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> 2353cde9717a04b35c73c9baaa1da2c5334bf0d8
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

<<<<<<< HEAD
    private String message;

    @Autowired
    public WelcomeController(@Value("${welcome.message}") final String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return this.message;
=======
    @GetMapping("/")
    public String sayHello() {
        return "hello";
>>>>>>> 2353cde9717a04b35c73c9baaa1da2c5334bf0d8
    }
}