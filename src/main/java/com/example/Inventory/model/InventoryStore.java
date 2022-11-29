package com.example.Inventory.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.persistence.Entity;




@Entity
@Data

public class InventoryStore {

    @Id
    private String Id;
    private String item_name;
    private String item_category;
    private String item_quantity;
    private String Item_price;

}
