package chapter_4_1_3.proxy;

import chapter_4_1_3.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void notifyComment(Comment comment) {
        System.out.println("Sending push notification for proxy :"+comment.getText());
    }
}
