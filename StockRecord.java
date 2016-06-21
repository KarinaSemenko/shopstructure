package org.itgroup.shop.telegram;

public class StockRecord {
    protected int quantity;
    protected String stock;
    protected int stockId;

    public int getQuantity(){
        return quantity;
    }
   /* public String getStock(){
        return stock;
    }*/
    public int getStockId(){
        return stockId;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
  /*  public void setStock(String stock){
        this.stock = stock;
    }*/
    public void setStockId(int stockId){
        this.stockId = stockId;
    }
    public StockRecord createStock(String stock){
        throw new UnsupportedOperationException();
    }
}
