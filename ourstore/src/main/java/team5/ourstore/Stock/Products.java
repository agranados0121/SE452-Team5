package team5.ourstore.Stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Products {
    @Id
    @Column(name = "product_id")
    int id;
    @Column(name = "product_name")
    String product_name;
    @Column(name = "brand_id")
    int brand_id;
    @Column(name = "category_id")
    int cat_id;
    @Column(name = "price")
    float price;
}
