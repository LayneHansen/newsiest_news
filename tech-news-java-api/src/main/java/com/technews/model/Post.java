package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@JsonIgnoreProperties({"hibernatizeLazyInitializer", "handler"})
@Table(name = "post")
public class Post {

    private Integer id;
    private String title;
    private String postUrl;

    @Transient
    private String userName;

    @Transient
    private int voteCount;

    private Integer userId;
    private Date postedAt = new Date();
    private Date updatedAt = new Date();
    private List<Comment> comments;
}
