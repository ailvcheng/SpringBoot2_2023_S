package cn.yihe199.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lizhen
 * @date : 2022/10/4 22:47
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping
    public static String  springBootRunTest() {
        return "SpringBoot is running...";
    }
}
