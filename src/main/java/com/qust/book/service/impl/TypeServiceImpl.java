package com.qust.book.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qust.book.bean.Type;
import com.qust.book.mapper.TypeMapper;
import com.qust.book.service.TypeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {
    @Override
    public Map<Integer, String> map() {
        var map = new HashMap<Integer, String>();
        this.list().forEach(t -> map.put(t.getId(), t.getName()));
        return map;
    }
}
