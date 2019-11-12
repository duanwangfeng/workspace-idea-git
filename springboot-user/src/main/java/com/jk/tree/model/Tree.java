package com.jk.tree.model;

import lombok.Data;

import java.util.List;

@Data
public class Tree {

    private Integer id;
    private String  text;
    private String  href;
    private Integer pid;
    private String  state;
    private List<Tree> children;

}
