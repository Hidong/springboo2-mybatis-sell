package com.xxx.service.impl;

import com.github.pagehelper.PageHelper;
import com.xxx.mapper.SellerInfoMapper;
import com.xxx.model.SellerInfo;
import com.xxx.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboo2-mybatis-sell
 * @description:
 * @author: JackDong.ch
 * @create: 2018-07-10 09:15
 **/
@Service(value = "s ellerInfoService")
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(SellerInfo record) {
        return sellerInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(SellerInfo record) {
        return 0;
    }

    @Override
    public SellerInfo selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(SellerInfo record) {
        return 0;
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public List<SellerInfo> findAllSellerInfo(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return sellerInfoMapper.selectAllSellerInfo();
    }
}
