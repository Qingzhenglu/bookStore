package com.qust.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qust.book.mapper.BookMapper;
import org.springframework.stereotype.Service;
import com.qust.book.bean.Book;
import com.qust.book.service.BookService;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
