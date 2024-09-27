package org.example.sqch05ex1.main;

import org.example.sqch05ex1.config.ProjectConfig;
import org.example.sqch05ex1.services.CommentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService1 = context.getBean(CommentService.class);
        var commentService2 = context.getBean(CommentService.class);
        System.out.println(commentService1);
        System.out.println(commentService2);
        System.out.println(commentService1==commentService2);
    }
}
