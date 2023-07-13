package com.qust.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qust.book.mapper.IndexMapper;
import com.qust.book.service.IndexService;
import org.springframework.stereotype.Service;
import com.qust.book.bean.User;

@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, User> implements IndexService { }
