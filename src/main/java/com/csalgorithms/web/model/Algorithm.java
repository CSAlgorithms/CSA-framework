package com.csalgorithms.web.model;

import javax.persistence.*;

@Entity
public class Algorithm extends Problem {

    private String title;
    private String description;

    @ManyToOne
    private Event even;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event getEven() {
        return even;
    }

    public void setEven(Event even) {
        this.even = even;
    }
}
