package com.test.ingerencia.model.response;

import lombok.Data;

import java.util.List;

@Data
public class Title {
    public String value;
    public String matchLevel;
    public boolean fullyHighlighted;
    public List<String> matchedWords;
}
