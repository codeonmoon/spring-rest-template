package com.adorsys.springdemo.entity;

public class ToDo {

    private Long userId;
    private Long id;
    private String tite;
    private boolean completed;

    public ToDo(){

    }

    public ToDo(Long userId, Long id, String tite, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.tite = tite;
        this.completed = completed;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTite() {
        return tite;
    }

    public void setTite(String tite) {
        this.tite = tite;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
