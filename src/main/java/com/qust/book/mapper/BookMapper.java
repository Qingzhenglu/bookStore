package com.qust.book.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qust.book.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
