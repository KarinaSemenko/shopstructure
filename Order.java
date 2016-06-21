package org.itgroup.shop.telegram;

public class Order {
    protected int ordId;
    protected boolean status;
    protected Customer customer;

    public int getOrdId(){
        return ordId;
    }
    public void setOrdId(int ordId){
        this.ordId = ordId;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
      this.customer = customer;
    }
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
