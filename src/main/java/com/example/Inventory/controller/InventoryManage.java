package com.example.Inventory.controller;

import jdk.internal.net.http.common.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.Inventory.requestvo.addItemRequest;
import com.example.Inventory.responsevo.addItemResponse;
import org.springframework.cache.interceptor.LoggingCacheErrorHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InventoryManage {


    @PostMapping(value="add-item",consumes = {"application/json"})


    public ResponseEntity<addItemResponse>  addItem(@ResquestBody addItemRequest request)throws exception{
        try{
            addItemResponse response = addItemService.addIteminInventory(request);

            return ResponseEntity.ok(response);
        }catch(Exception e){

            Log.logger("exception occured");

        }

    }

}
