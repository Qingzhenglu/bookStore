package com.qust.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qust.book.bean.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IndexMapper extends BaseMapper<User> { }
