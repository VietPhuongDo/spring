package chapter_4_1_3.main;

import chapter_4_1_3.ProjectConfiguration;
import chapter_4_1_3.model.Comment;
import chapter_4_1_3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setText("abc");
        comment.setAuthor("xyz");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
