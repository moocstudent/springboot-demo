package com.example.springbootdemo.entity;

import java.math.BigDecimal;

/**
 * @Author: zhangQi
 * @Date: 2021-04-17 16:26
 */
public class BookEntity {

    private Long bookId;

    private String bookName;

    private String bookAuthor;

    private BigDecimal bookPrice;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
