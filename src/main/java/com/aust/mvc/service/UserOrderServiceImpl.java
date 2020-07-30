package com.aust.mvc.service;

import com.aust.mvc.mapper.UserInfoMapper;
import com.aust.mvc.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserOrderServiceImpl implements com.aust.mvc.service.IUserOrderService {
    private UserOrderMapper orderMapper;
    private UserInfoMapper infoMapper;

    @Autowired
    public void setOrderMapper(UserOrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Autowired
    public void setInfoMapper(UserInfoMapper infoMapper) {
        this.infoMapper = infoMapper;
    }

    @Transactional
    public void placeOrder(String userno, String orderno, Double price) {

        orderMapper.insertOrder(userno,orderno,price);
        infoMapper.updatePoint(price.intValue(),userno);
    }
}
