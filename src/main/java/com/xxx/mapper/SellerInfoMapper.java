package com.xxx.mapper;

import com.xxx.model.SellerInfo;

import java.util.List;

public interface SellerInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    SellerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);

    List<SellerInfo> selectAllSellerInfo();
}