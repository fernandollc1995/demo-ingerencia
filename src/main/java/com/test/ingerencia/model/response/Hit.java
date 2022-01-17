package com.test.ingerencia.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Hit {

    @JsonProperty()
    public Date created_at;
    public String title;
    public Object url;
    public String author;
    public int points;
    public String story_text;
    public String comment_text;
    public int num_comments;
    public int story_id;
    public String story_title;
    public String story_url;
    public int parent_id;
    public int created_at_i;
    public List<String> _tags;
    public String objectID;
    public HighlightResult _highlightResult;
}
