package com.test.ingerencia.model.response;

import lombok.Data;

@Data
public class HighlightResult {
    public Title title;
    public Author author;
    public StoryText story_text;
    public CommentText comment_text;
    public StoryTitle story_title;
    public StoryUrl story_url;
}
