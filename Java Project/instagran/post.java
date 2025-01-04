package com.Instagram.Main;

class Post extends Mylogic{
    String content;
    User user;

    Post(String content, User user) {
        this.content = content;
        this.user = user;
    }
}
