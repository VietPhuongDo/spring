package org.example.sqch05ex7.processor;

import org.example.sqch05ex7.model.Comment;
import org.example.sqch05ex7.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private Comment comment;
    @Autowired
    private CommentRepository commentRepository;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment() {
        // changing the comment attribute
    }
    public void validateComment() {
        // validating and changing the comment attribute
    }
}
