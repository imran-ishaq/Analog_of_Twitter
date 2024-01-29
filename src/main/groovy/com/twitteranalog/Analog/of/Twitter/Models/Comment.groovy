package com.twitteranalog.Analog.of.Twitter.Models

import lombok.Data
import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDateTime

@Document(collection = "Comment")
class Comment {

    private String id;
    private String userId;
    private String postId;
    private String text;
    private LocalDateTime timestamp;

    String getId() {
        return id
    }

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    String getPostId() {
        return postId
    }

    void setPostId(String postId) {
        this.postId = postId
    }

    String getText() {
        return text
    }

    void setText(String text) {
        this.text = text
    }

    LocalDateTime getTimestamp() {
        return timestamp
    }

    void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp
    }

}
