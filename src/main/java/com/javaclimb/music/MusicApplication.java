package com.javaclimb.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
热更新、热加载
1.ctrl+shift+A---->搜索registry.....然后勾选app.running
2.执行快捷键ctrl+F9才进行热加载
 */
@SpringBootApplication
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
