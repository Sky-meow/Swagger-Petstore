package template.entity;

import java.util.Date;

public class PetOrder {
    private Integer id;

    private Integer petId;

    private Integer quantity;

    private Date shipDate;

    private String status;

    private byte[] complete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public byte[] getComplete() {
        return complete;
    }

    public void setComplete(byte[] complete) {
        this.complete = complete;
    }
}