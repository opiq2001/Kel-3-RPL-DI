package com.MostlyBook.shop;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartActivityTest {
    @Test
    public void totalPrice()throws Exception {
        int x = 80000;
        int quant = 3;
        int result;
        int expected = 240000;

        CartActivity cartActivity = new CartActivity();
        result = cartActivity.totalPrice(x, quant);
        assertEquals(result, expected);


    }
}