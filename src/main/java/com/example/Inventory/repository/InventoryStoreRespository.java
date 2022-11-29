package com.example.Inventory.repository;


import com.example.Inventory.model.InventoryStore;
import com.example.Inventory.responsevo.addItemResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryStoreRespository extends JpaRepository<InventoryStore,Long> {

    static InventoryStore findById(String Id);

}
