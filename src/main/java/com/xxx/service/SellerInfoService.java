package com.xxx.service;

import com.xxx.model.SellerInfo;

import java.util.List;

public interface SellerInfoService {

    int deleteByPrimaryKey(String id);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    SellerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKey(SellerInfo record);

    List<SellerInfo> findAllSellerInfo(int pageNum,int pageSize);
}
