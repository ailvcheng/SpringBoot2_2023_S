package cn.yihe199.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * yaml单值属性的读取
 *
 * @author : lizhen
 * @date : 2022/10/6 0:50
 */
@RestController
@RequestMapping("yaml/one/value/print")
public class ReadOneYamlController {
    /**
     * 使用SPEL表达式读取
     */
    @Value("${country}")
    private String country;
    @Value("${province}")
    private String province;
    @Value("${city}")
    private String city;
    @Value("${area}")
    private String area;
    @Value("${birthday}")
    private String birthday;
    @Value("${user[0].name1}")
    private String userName;
    @Value("${user2[0].age}")
    private String user2Age;
    @Value("${a.b.c.d}")
    private String aBCD;
    @Value("${likes[1]}]")
    private String likes1;
    @Value("${user[0].val}")
    private Double userVal;
    @Value("${user[0].valid}")
    private Boolean userValid;
    @Value("${time}")
    private String time;
    @Value("${tempDir}")
    private String tmpDir;
    @Value("${tempDir2}")
    private String tmpDir2;

    @Override
    public String toString() {
        return "ReadOneYamlController{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", birthday='" + birthday + '\'' +
                ", userName='" + userName + '\'' +
                ", user2Age='" + user2Age + '\'' +
                ", aBCD='" + aBCD + '\'' +
                ", likes1='" + likes1 + '\'' +
                ", userVal=" + userVal +
                ", userValid=" + userValid +
                ", time='" + time + '\'' +
                ", tmpDir='" + tmpDir + '\'' +
                ", tmpDir2='" + tmpDir2 + '\'' +
                '}';
    }

    @GetMapping()
    private String print() {
        return this.toString();
    }
}
