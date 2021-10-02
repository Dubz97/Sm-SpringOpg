package Controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Controller {




  @RequestMapping("/check")
  public String charLength(@RequestParam String name)  {
    //localhost:8080/check?name=ENTER-NAME-HERE
    if (name.length()<5) {
      return name + " is less than 5 characters";
    } else return name + " is more than 5 characters";
  }

  @GetMapping("/calc")
  public int calc(int num1, int num2) {
    //localhost:8080/cal?num1=5&num2=3
    return num1 + num2;
  }
}
