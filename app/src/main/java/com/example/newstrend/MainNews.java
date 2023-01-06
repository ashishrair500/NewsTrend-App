package com.example.newstrend;

import java.util.ArrayList;


public class MainNews {

    private String status;
    private String totalResults;

    private ArrayList<ModelClass> articles;

    public MainNews(String status, String totalResult, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResult) {
        this.totalResults = totalResult;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
