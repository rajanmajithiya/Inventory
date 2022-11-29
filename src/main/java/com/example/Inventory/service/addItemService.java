package com.example.Inventory.service;

import com.example.Inventory.repository.InventoryStoreRespository;
import com.example.Inventory.requestvo.addItemRequest;
import com.example.Inventory.responsevo.addItemResponse;

public class addItemService {

    public addItemResponse addIteminInventory(addItemRequest request) throws Exception {
        try {

            addItemResponse response = new addItemResponse();
            if (request != null) {
                if (request.getId().equals(InventoryStoreRespository.findById(request.getId()) ){
                response.setId(response.getId());
                response.setItem_name(request.getItem_name());
                response.setItem_category(request.getItem_category());
                response.setItem_price(request.getItem_price());
                response.setItem_quantity(request.getItem_quantity());

                InventoryStoreRespository.save(response);


                }
            }
            return response;
            } catch (Exception e) {
            throw e;
        }
    }
}

