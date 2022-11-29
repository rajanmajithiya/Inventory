package com.example.Inventory.responsevo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class addItemResponse {

    private String id;
    private String item_name;
    private String item_category;
    private String item_quantity;
    private String Item_price;

}
