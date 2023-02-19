package cn.yihe199.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.yihe199.dto.MyDataSource;

/**
 * @author : lizhen
 * @date : 2022/10/6 2:22
 */
@RestController
@RequestMapping("/dto/data/source")
public class DtoController {

    private final MyDataSource myDataSource;

    public DtoController(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }

    @GetMapping
    String print() {
        return this.myDataSource.toString();
    }
}
