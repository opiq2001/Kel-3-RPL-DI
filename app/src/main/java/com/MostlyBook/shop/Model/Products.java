package com.MostlyBook.shop.Model;

/**
 * Kelas Products.java untuk membuat objek kelas products
 */
public class Products {
    private String pname, description, price, image, category, pid, date, time;
    public Products()
    {

    }

    /**
     * parameter class Products
     * @param pname - product name
     * @param description - phone number
     * @param price - price
     * @param image - image
     * @param category - category
     * @param pid - product id
     * @param date - date
     * @param time - time
     */
    public Products(String pname, String description, String price, String image, String category, String pid, String date, String time) {
        this.pname = pname;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
        this.pid = pid;
        this.date = date;
        this.time = time;
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
     * @return product description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *          product description di-input-kan
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     *
     * @return product category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     *          product category di-input-kan
     */
    public void setCategory(String category) {
        this.category = category;
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
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     *          date di-input-kan
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     *          time di-input-kan
     */
    public void setTime(String time) {
        this.time = time;
    }

}
