package com.test.ingerencia.model.response;

import lombok.Data;

import java.util.List;

@Data
public class Author {
    public String value;
    public String matchLevel;
    public List<String> matchedWords;
    public boolean fullyHighlighted;
}
