package com.zmy;

import com.zmy.pojo.Books;
import com.zmy.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bs = context.getBean("bookServiceImpl", BookService.class);
        List<Books> books = bs.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
