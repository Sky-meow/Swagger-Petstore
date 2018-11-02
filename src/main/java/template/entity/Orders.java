package template.entity;

import java.util.Date;

public class Orders {

    private Integer id;

    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    private Integer petid;


    private Integer quantity;


    private Date shipdate;


    private String status;


    private Boolean complete;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getPetid() {
        return petid;
    }


    public void setPetid(Integer petid) {
        this.petid = petid;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Date getShipdate() {
        return shipdate;
    }


    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }


    public Boolean getComplete() {
        return complete;
    }


    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}