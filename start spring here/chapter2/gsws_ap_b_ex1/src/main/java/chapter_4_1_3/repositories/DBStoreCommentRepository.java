package chapter_4_1_3.repositories;

import chapter_4_1_3.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBStoreCommentRepository implements CommentRepository{
    @Override
    public void saveComment(Comment comment) {
        System.out.println("Save this comment to DB: "+comment.getText());
    }
}
