package com.example.springbootdemo.utils;

import com.example.springbootdemo.entity.BookEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-04-17 16:27
 */
public class CheckUtil {

    private static List<BookEntity> bookList;

    static{
        bookList = new ArrayList<>();
        BookEntity book1 = new BookEntity();
        book1.setBookId(1L);
        book1.setBookName("梦的解析");
        book1.setBookAuthor("佛洛依德");
        book1.setBookPrice(new BigDecimal("29.8"));

        BookEntity book2 = new BookEntity();
        book2.setBookId(2L);
        book2.setBookName("无敌英语语法");
        book2.setBookAuthor("王平");
        book2.setBookPrice(new BigDecimal("32.8"));

        bookList.add(book1);
        bookList.add(book2);
    }

    public static BookEntity checkBook(String bookName){
        BookEntity bookEntity = bookList.stream()
                .filter(book -> book.getBookName().equals(bookName))
                .findFirst()
                .orElse(null);
        return bookEntity;
    }
}
