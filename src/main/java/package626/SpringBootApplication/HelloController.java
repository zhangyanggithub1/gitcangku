package package626.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello yt";
    }
}
