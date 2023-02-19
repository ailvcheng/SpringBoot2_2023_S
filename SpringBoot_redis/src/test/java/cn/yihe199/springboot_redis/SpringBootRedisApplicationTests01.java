package cn.yihe199.springboot_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class SpringBootRedisApplicationTests01 {

    //字符串操作
    @Autowired
    private StringRedisTemplate redisTemplate;


    @Test
    void set() {
        final ValueOperations ops = redisTemplate.opsForValue();
        ops.set("t1", "1");
        ops.set("t2", "2");
        ops.set("t3", "3");
    }


    @Test
    void get() {
        final ValueOperations valueOperations = redisTemplate.opsForValue();
        final Object t1 = valueOperations.get("movieList");
        System.out.println(t1);

    }

    @Test
    void hset() {
        final HashOperations ops = redisTemplate.opsForHash();
        ops.put("info", "a", "aa");
        ops.put("info", "b", "bb");

    }

    @Test
    void hget() {
        final HashOperations ops = redisTemplate.opsForHash();
        Object o = ops.get("info", "b");
        System.out.println(o);
    }
}
