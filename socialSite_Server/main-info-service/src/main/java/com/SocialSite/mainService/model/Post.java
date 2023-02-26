package com.SocialSite.mainService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Integer Id;
    private String imgUrl;
    private String comment;
}
