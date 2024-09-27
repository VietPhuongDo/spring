package org.example.sqch05ex3;

import org.example.sqch05ex3.config.ProjectConfig;
import org.example.sqch05ex3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("before");
        c.getBean(CommentService.class);
        System.out.println("after");
    }
}
