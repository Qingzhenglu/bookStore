# 网上书店
> 一个简单的在线购书平台
<details>
  <summary>首页预览</summary>
  
  ![image](https://github.com/Qingzhenglu/book/blob/master/imagePreview/home.png)
</details>

## 使用说明
  ### 1. 克隆仓库
  用户需要从GitHub或其他代码托管平台克隆项目到本地。可以提供具体的命令行指令，如：
  ```
  git clone https://github.com/Qingzhenglu/book.git
  ```
  ### 2. 创建数据库（使用docker中的postgres镜像）
  如果使用的是IDEA,运行docker-compose.yml，在创建成功后，运行createDB.sql，完成数据库的创建和基本信息的输入。
  ### 3. 运行项目
  最后，运行BookApplication.java即可成功运行。在浏览器中输入 http://localhost:8090/index 即可进入首页。
  
## 功能预览图

### 1. 登录注册
![image](https://github.com/Qingzhenglu/book/blob/master/imagePreview/login.png)

### 2. 图书管理
![image](https://github.com/Qingzhenglu/book/blob/master/imagePreview/book.png)

### 3. 图书类别管理
![image](https://github.com/Qingzhenglu/book/blob/master/imagePreview/type.png)

### 4. 用户管理
![image](https://github.com/Qingzhenglu/book/blob/master/imagePreview/user.png)

### 5. 其他
![image](https://github.com/Qingzhenglu/book/blob/master/imagePreview/tonghua.png)
