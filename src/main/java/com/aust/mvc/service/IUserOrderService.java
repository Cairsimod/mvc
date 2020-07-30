package com.aust.mvc.service;


public interface IUserOrderService {
    void placeOrder(String userno, String orderno, Double price);
}
