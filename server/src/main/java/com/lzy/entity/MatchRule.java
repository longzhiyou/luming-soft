
package com.lzy.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class MatchRule {

    @Id
    private Integer Id;
    private String subject;
    private String description;
    private String rule;
    private boolean enable;



}

