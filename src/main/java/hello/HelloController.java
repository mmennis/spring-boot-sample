package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michaelmennis on 5/19/17.
 */
@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Mikes Spring Boot App!";
  }
}
