package com.company.CatalogHomeTask11;

public abstract class Products {

    private String type;
    private String name;
    private int price;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //   public abstract void showAllGoods();

    public abstract void showDetails();

}


