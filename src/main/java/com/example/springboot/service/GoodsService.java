package com.example.springboot.service;

import com.example.springboot.model.Goods;

import java.util.List;

/**
 * (Goods)
 */
public interface GoodsService {


    Goods queryById(Integer id);


    List<Goods> queryByPage(Goods goods);


    Goods insert(Goods goods);


    Goods update(Goods goods);


    boolean deleteById(Integer id);

}
