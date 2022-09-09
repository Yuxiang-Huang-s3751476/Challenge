package com.example.springboot.dao;

import com.example.springboot.model.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Goods)
 */
public interface GoodsDao {


    Goods queryById(Integer id);


    List<Goods> queryAllByLimit(Goods goods);


    long count(Goods goods);


    int insert(Goods goods);


    int insertBatch(@Param("entities") List<Goods> entities);


    int insertOrUpdateBatch(@Param("entities") List<Goods> entities);


    int update(Goods goods);


    int deleteById(Integer id);

}

