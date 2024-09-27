package org.example.sqch05ex2.service;

import org.example.sqch05ex2.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}