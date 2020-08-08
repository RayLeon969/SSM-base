package com.zmy.service.impl;


import com.zmy.dao.BookMapper;
import com.zmy.pojo.Books;
import com.zmy.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    //业务层调DAO层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBooksById(int id) {
        return bookMapper.deleteBooksById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
