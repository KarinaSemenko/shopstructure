package org.itgroup.shop.telegram;

public class StockRecord {
    protected int quantity;
    protected String stock;
    protected int stockId;

    public int getQuantity(){
        return quantity;
    }
  
    public int getStockId(){
        return stockId;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
 
    public void setStockId(int stockId){
        this.stockId = stockId;
    }
    public StockRecord createStock(String stock){
        throw new UnsupportedOperationException();
    }
}
