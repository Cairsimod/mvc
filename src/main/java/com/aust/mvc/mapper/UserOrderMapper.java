package com.aust.mvc.mapper;

import org.apache.ibatis.annotations.Param;


public interface UserOrderMapper {
    void insertOrder(@Param("userno") String userno, @Param("orderno") String orderno, @Param("total_price") Double total_price);
}
