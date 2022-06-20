package com.MostlyBook.shop.Model;

/**
 * Kelas AdminOrders.java untuk membuat objek kelas order
 */
public class AdminOrders {
    private String name,phone,address,city,state,date,time,totalAmount;

    public AdminOrders() {
    }

    /**
     * parameter class AdminOrders
     * @param name - name
     * @param phone - phone number
     * @param address - address
     * @param city - city
     * @param state - state
     * @param date - date
     * @param time - time
     * @param totalAmount - total amount
     */
    public AdminOrders(String name, String phone, String address, String city, String state, String date, String time, String totalAmount) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.date = date;
        this.time = time;
        this.totalAmount = totalAmount;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *          nama di-input-kan
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     *          phone di-input-kan
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     *          address di-input-kan
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     *          city di-input-kan
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     *          state di-input-kan
     */
    public void setState(String state) {
        this.state = state;
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

    /**
     *
     * @return total amount
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     *
     * @param totalAmount
     *          total amount di-input-kan
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
