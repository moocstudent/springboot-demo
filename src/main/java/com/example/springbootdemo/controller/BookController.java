package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.BookEntity;
import com.example.springbootdemo.utils.CheckUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangQi
 * @Date: 2021-04-17 16:26
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/find")
    public String findSomeBook(String bookName){
        BookEntity bookEntity = CheckUtil.checkBook(bookName);
        if(bookEntity==null){
            return "查无此书";
        }else{
            return bookEntity.toString();
        }
    }
}
