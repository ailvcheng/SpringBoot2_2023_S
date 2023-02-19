package com.example.springboot_mongo;

import com.example.springboot_mongo.domin.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootTest
class SpringBootMongoApplicationTests {

    @Autowired
    private MongoTemplate template;

    @Test
    void contextLoads() {
        final Book book = new Book();
        book.setId(2);
        book.setName("java1");
        book.setType("编程");
        book.setDescription("编程技术");

        final Book save = template.save(book);
    }

    @Test
    void findAll() {
        final List<Book> s = template.findAll(Book.class);
        System.out.println(s);
    }

    @Test
    void find() {
        Query query = new Query();


        final List<Book> s = template.find(query, Book.class);
        System.out.println(s);
    }

}
