package com.harshi.InventoryAndBilling.service;

import java.util.List;

import com.harshi.InventoryAndBilling.entities.Warehouse;

public interface WarehouseService {

	List<Warehouse> getWarehousesList();

	Warehouse saveWarehouse(Warehouse warehouse);

	Warehouse getWarehouseById(Long warehouseId);
}
