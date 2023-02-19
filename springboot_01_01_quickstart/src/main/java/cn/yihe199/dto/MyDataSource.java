package cn.yihe199.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * 使用封装的对象读取yaml中某一部分的数据
 * 1.定义数据模型封装yaml中的数据
 * 2.定义为Spring管理的Bean
 * 3.指定加载的数据
 *
 * @author : lizhen
 * @date : 2022/10/6 2:16
 */
@Repository
@ConfigurationProperties(prefix = "datasource")//配置同意前缀
public class MyDataSource {
    /**
     * 需要保证实体字段名与ymal需要的属性保持一致
     */
    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
