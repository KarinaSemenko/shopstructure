package org.itgroup.shop.telegram;

public class Product {
    protected String content;
    protected String prodName;
    protected int prodId;
    protected double price;
    protected Order order;
    protected StockRecord stockRecord;
    protected Category category;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public StockRecord getStockRecord(){ return stockRecord;}
    public void setStockRecord(StockRecord stockRecord) { this.stockRecord = stockRecord;}

    public  Category getCategory(){ return category;}
    public void setCategory(Category category) { this.category = category;}

}
