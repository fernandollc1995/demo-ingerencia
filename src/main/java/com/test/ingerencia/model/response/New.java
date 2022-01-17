package com.test.ingerencia.model.response;

import lombok.Data;

import java.util.List;

@Data
public class New {

    public List<Hit> hits;
    public int nbHits;
    public int page;
    public int nbPages;
    public int hitsPerPage;
    public boolean exhaustiveNbHits;
    public boolean exhaustiveTypo;
    public String query;
    public String params;
    public Object renderingContent;
    public int processingTimeMS;
}
