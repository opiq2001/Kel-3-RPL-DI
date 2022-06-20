package com.MostlyBook.shop.Model;

/**
 * Kelas Users.java untuk membuat objek kelas user
 */
public class Users {
    private String name, phone, password, image, address;
    public Users()
    {

    }

    /**
     * parameter class Users
     * @param name - username
     * @param phone - phone number
     * @param address - address
     * @param password - password
     * @param image - image
     */
    public Users(String name, String phone, String password, String image, String address) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.image = image;
        this.address = address;
    }

    /**
     *
     * @return name user
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *          nama user di-input-kan
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return phone user
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     *          nomor handphone user di-input-kan
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return password user
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     *          password user di-input-kan
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return image user
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     *          gambar user di-input-kan
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return address user
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     *          alamat user di-input-kan
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
