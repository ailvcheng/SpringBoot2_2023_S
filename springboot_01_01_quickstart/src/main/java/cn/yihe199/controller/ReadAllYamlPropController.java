package cn.yihe199.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一次性读取yaml中所有属性
 *
 * @author : lizhen
 * @date : 2022/10/6 1:57
 */
@RestController
@RequestMapping("/yaml/all/prop")
public class ReadAllYamlPropController {
    /**
     * 装配
     */
    private final Environment env;

    public ReadAllYamlPropController(Environment env) {
        this.env = env;
    }

    @RequestMapping(method = RequestMethod.GET, path = "")
    private String print(String key) {
//        使用getProperty方法
        return this.env.getProperty(key,String.class);
    }
}
