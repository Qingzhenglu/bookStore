package com.qust.book.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_user", autoResultMap = true)
@KeySequence("tb_user_id_seq")
public class User {
    @TableId(type = IdType.INPUT)
    private int id;
    private String name;
    private String password;
    private int age;
    private String sex;
    private String text;
    private String avatar;//头像

}
