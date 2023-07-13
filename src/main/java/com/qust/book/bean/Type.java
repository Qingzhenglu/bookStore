package com.qust.book.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_type", autoResultMap = true)
@KeySequence("tb_type_id_seq")
public class Type {
    @TableId(type = IdType.INPUT)
    private int id;
    private String name;
}
