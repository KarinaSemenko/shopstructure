package org.itgroup.shop.telegram;

public class Category {

    private String cclass;
    private int pro;

    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCclass() {
        return cclass;
    }

    public void setCclass(String cclass) {
        this.cclass = cclass;
    }
    public int getPro(){
        return pro;
    }
    public void setPro(int pro){
        this.pro = pro;
    }
}
