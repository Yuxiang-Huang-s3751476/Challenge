package com.example.springboot.service.impl;

import com.example.springboot.model.Goods;
import com.example.springboot.dao.GoodsDao;
import com.example.springboot.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;


    @Override
    public Goods queryById(Integer id) {
        return this.goodsDao.queryById(id);
    }


    @Override
    public List<Goods> queryByPage(Goods goods) {
        return this.goodsDao.queryAllByLimit(goods);
    }


    @Override
    public Goods insert(Goods goods) {
        this.goodsDao.insert(goods);
        return goods;
    }


    @Override
    public Goods update(Goods goods) {
        this.goodsDao.update(goods);
        return this.queryById(goods.getId());
    }


    @Override
    public boolean deleteById(Integer id) {
        return this.goodsDao.deleteById(id) > 0;
    }
}
