package org.example.scch05ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = c.getBean("commentService",CommentService.class);
        var cs2 = c.getBean("commentService",CommentService.class);

        System.out.println(cs1==cs2);
    }

}
