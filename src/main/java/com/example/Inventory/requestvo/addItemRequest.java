package com.example.Inventory.requestvo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
public class addItemRequest {
    private String id;
    private String item_name;
    private String item_category;
    private String item_quantity;
    private String Item_price;
}
