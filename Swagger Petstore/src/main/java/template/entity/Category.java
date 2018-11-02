package template.entity;

import template.annotation.Range;

public class Category {
    @Range(min = 20,max = 30 ,message = "shabibani")
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}