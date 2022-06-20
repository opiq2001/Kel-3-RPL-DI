package com.MostlyBook.shop.Model;

/**
 * Kelas Cart.java untuk membuat objek kelas cart
 */
public class Cart {
    private String pid,pname, price,quantity, image;

    public Cart() {
    }

    /**
     * parameter class Cart
     * @param pid - product id
     * @param pname - product name
     * @param price - price
     * @param quantity - quantity
     * @param image - image
     */
    public Cart(String pid, String pname, String price, String quantity, String image) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    /**
     *
     * @return product id
     */
    public String getPid() {
        return pid;
    }

    /**
     *
     * @param pid
     *          product id di-input-kan
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     *
     * @return product name
     */
    public String getPname() {
        return pname;
    }

    /**
     *
     * @param pname
     *          product name di-input-kan
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     *
     * @return product price
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price
     *          product price di-input-kan
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return product quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     *          product quantity di-input-kan
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return product image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     *          product image di-input-kan
     */
    public void setImage(String image) {
        this.image = image;
    }
}
