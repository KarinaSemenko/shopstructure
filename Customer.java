package org.itgroup.shop.telegram;

public class Customer {
    private String name;
    private int id;
    public Customer(){
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
}
