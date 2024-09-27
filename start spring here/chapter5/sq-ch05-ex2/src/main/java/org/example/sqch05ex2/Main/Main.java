package org.example.sqch05ex2.Main;

import org.example.sqch05ex2.config.ProjectConfig;
import org.example.sqch05ex2.service.CommentService;
import org.example.sqch05ex2.service.UserService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = c.getBean( CommentService.class);
        var us = c.getBean(UserService.class);

        var crp1 = cs.getCommentRepository();
        var crp2 = us.getCommentRepository();
        System.out.println(crp1 == crp2);
    }
}
