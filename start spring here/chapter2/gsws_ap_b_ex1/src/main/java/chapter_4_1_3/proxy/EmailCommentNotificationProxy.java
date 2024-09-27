package chapter_4_1_3.proxy;

import chapter_4_1_3.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void notifyComment(Comment comment) {
        System.out.println("Notify comment to email :"+comment.getText());
    }
}
