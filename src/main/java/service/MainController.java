package service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    // feature02_1_added
    @RequestMapping("/")
    String hello() {
        return "hello world_feature01_modified_feature02_2_added";
        // feature02_3_added
    }
    // feature02_2_added
}
