package com.qust.book.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qust.book.bean.Type;

import java.util.Map;

public interface TypeService extends IService<Type> {
    Map<Integer, String> map();
}
