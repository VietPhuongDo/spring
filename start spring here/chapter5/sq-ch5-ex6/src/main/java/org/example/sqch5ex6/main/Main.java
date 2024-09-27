package org.example.sqch5ex6.main;

import org.example.sqch5ex6.config.ProjectConfig;
import org.example.sqch5ex6.services.CommentService;
import org.example.sqch5ex6.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        System.out.println(s1.getCommentRepository()==s2.getCommentRepository());
    }
}
