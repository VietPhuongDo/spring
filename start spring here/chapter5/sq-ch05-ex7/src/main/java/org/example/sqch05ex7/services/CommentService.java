package org.example.sqch05ex7.services;

import org.example.sqch05ex7.model.Comment;
import org.example.sqch05ex7.processor.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext applicationContext;

    public void sendComment(Comment comment){
        CommentProcessor commentProcessor = applicationContext.getBean(CommentProcessor.class);
        commentProcessor.setComment(comment);
        commentProcessor.processComment();
        commentProcessor.validateComment();
        comment = commentProcessor.getComment();

    }
}
