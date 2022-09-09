package com.example.springboot.controller;

import com.example.springboot.model.Goods;
import com.example.springboot.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)
 */
@RestController
@RequestMapping("item")
public class GoodsController {


    @Resource
    private GoodsService goodsService;


    @GetMapping("/item")
    public ResponseEntity<List<Goods>> queryByPage(Goods goods) {
        return ResponseEntity.ok(this.goodsService.queryByPage(goods));
    }


    @GetMapping("/item/{id}")
    public ResponseEntity<Goods> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.goodsService.queryById(id));
    }


    @PostMapping("/item")
    public ResponseEntity<Goods> add(@RequestBody Goods goods) {
        return ResponseEntity.ok(this.goodsService.insert(goods));
    }


    @PutMapping("/item")
    public ResponseEntity<Goods> edit(@RequestBody Goods goods) {
        return ResponseEntity.ok(this.goodsService.update(goods));
    }


    @DeleteMapping("/item")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.goodsService.deleteById(id));
    }

}

