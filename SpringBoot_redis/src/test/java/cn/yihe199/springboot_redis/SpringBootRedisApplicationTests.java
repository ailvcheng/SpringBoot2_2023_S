package cn.yihe199.springboot_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class SpringBootRedisApplicationTests {

    //    对象操作,或指定泛型
    @Autowired
//    private RedisTemplate redisTemplate;
    private RedisTemplate<String, String> redisTemplate;


    @Test
    void set() {
        final ValueOperations ops = redisTemplate.opsForValue();
        //更改为String ,String,否则不会加入Redis
        ops.set("t1", 1);
        ops.set("t2", 2);
        ops.set("t3", 3);
    }


    @Test
    void get() {
        final ValueOperations valueOperations = redisTemplate.opsForValue();
        final String t1 = (String) valueOperations.get("movieList");
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
