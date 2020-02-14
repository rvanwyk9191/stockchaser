package com.reinhardt.stockchaser.controller;

import com.reinhardt.stockchaser.domain.StockInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockFetcherController {

    @GetMapping("/id")
    public StockInfo getStockInfoById(@PathVariable("id") String id){
        return new StockInfo();
    }

    @RequestMapping("/helloworld")
    public String helloworld(){
        return "Hello World";
    }

}
