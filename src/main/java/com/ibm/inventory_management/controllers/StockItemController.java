
ckage com.ibm.inventory_management.controllers;

public class StockItemController {

@GetMapping(path = "/stock-items", produces = "application/json")
    public List listStockItems() {
        return this.service.listStockItems();
    }

}

