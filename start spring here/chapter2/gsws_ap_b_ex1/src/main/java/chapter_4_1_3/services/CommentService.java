package chapter_4_1_3.services;

import chapter_4_1_3.model.Comment;
import chapter_4_1_3.proxy.CommentNotificationProxy;
import chapter_4_1_3.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.saveComment(comment);
        commentNotificationProxy.notifyComment(comment);
    }
}
