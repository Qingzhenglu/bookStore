drop schema bookshop cascade ;
create schema bookshop;
grant all on schema bookshop to postgres;
grant all on schema bookshop to public ;

create table tb_user(
    id serial primary key,
    name text not null,
    password text not null,
    age int not null,
    sex text,
    text text,
    avatar text
);
insert into tb_user values (0, '管理员', 111111, 20, '男', '我是一个管理员','https://alifei05.cfp.cn/creative/vcg/nowater800/new/VCG41N1360255326.jpg?x-oss-process=image/format,webp');

create table tb_type(
    id serial primary key,
    name text not null
);
insert into tb_type values (0,'其他');

create table tb_book(
    id serial primary key,
    type int not null references tb_type default 0,
    name text not null,
    author text not null ,
    publishinghouse text not null ,
    price int8,
    num int4 ,
    text text ,
    picture text
);

insert into tb_type(name) values ('童书'),('小说'),('文学'),('人文社科'),('经济管理'),
                           ('科技科普'),('计算机与互联网'),('成功励志'),('生活'),
                           ('少儿'),('艺术设计'),('漫画绘本'),('教育考试'),('杂志');




insert into tb_book (type, name, author, publishinghouse, price, num, text, picture) values
    (1, '活着', '余华', '作家出版社', 1349, 108, '《活着》讲述了农村人福贵悲惨的人生遭遇。福贵本是个阔少爷，可他嗜赌如命，' ||
                                        '终于赌光了家业，一贫如洗。他的父亲被他活活气死，母亲则在穷困中患了重病，福贵前去求药，' ||
                                        '却在途中被国民党抓去当壮丁。经过几番波折回到家里，才知道母亲早已去世，' ||
                                        '妻子家珍含辛茹苦地养大两个儿女。此后更加悲惨的命运一次又一次降临到福贵身上，' ||
                                        '他的妻子、儿女和孙子相继死去，最后只剩福贵和一头老牛相依为命，但老人依旧活着，' ||
                                        '仿佛比往日更加洒脱与坚强。','https://pic.arkread.com/cover/ebook/f/30541512.1653661839.jpg!cover_default.jpg'),
    (2, '红楼梦（套装全2册）', '曹雪芹', '人民文学出版社', 2299, 108, '《红楼梦》，中国古代古代四大名著之一，也是中国古代小说的巅峰之作。' ||
                                                   '全书以荣国府的日常生活为中心，以宝玉、黛玉、宝钗的爱情婚姻悲剧及大观园中点滴琐事为' ||
                                                   '主线，以金陵贵族名门贾、史、王、薛四大家族由鼎盛走向衰亡的历史为暗线，展现了封建' ||
                                                   '时代家族和社会的没落。', 'https://pic.arkread.com/cover/ebook/f/169371278.1653695523.jpg!cover_default.jpg');








