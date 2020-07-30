package com.aust.mvc.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    void updatePoint(@Param("point") Integer point, @Param("userno") String userno);
}
