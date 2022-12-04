package es.serbatic.microshop.catalog.repository.db.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product_type")
public class ProductTypeEntity {
    @Id
    private String type;
    private int discount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
