package com.qust.book.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_book", autoResultMap = true)
@KeySequence("tb_book_id_seq")
public class Book {
    @TableId(type = IdType.INPUT)
    private int id;
    private int type;
    private String name;
    private String author;
    private String publishinghouse;
    private int price;
    private int num;
    private String text;
    private String picture;
}
