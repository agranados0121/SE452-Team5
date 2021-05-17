package team5.ourstore.Stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Inventory {
    @Id
    @Column(name = "product_id")
    int id;
    @Column(name = "amt")
    int amount;
}
