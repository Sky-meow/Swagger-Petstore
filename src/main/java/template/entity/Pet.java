package template.entity;

public class Pet {

    private Integer id;
    private Integer categoryId;
    private Category category;
    private Tag tag;
    private String name;
    private String photourls;
    private Integer tags;
    private String status;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name ;
    }

     
    public String getPhotourls() {
        return photourls;
    }


    public void setPhotourls(String photourls) {
        this.photourls = photourls ;
    }


    public Integer getTags() {
        return tags;
    }


    public void setTags(Integer tags) {
        this.tags = tags;
    }


    public String getStatus() {
        return status;
    }

    public Pet(Integer id, Integer categoryId, Category category, Tag tag, String name, String photourls, Integer tags, String status) {
        this.id = id;
        this.categoryId = categoryId;
        this.category = category;
        this.tag = tag;
        this.name = name;
        this.photourls = photourls;
        this.tags = tags;
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}