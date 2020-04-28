package com.jacky.bank.controller;


import com.jacky.bank.service.TradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //标识其为一个可接收 HTTP 请求的控制器
@RequestMapping("/trade")
public class TradeController {

    private TradeService tradeService;

    /**
     * @author jacky
     * @date 2020/4/18 10:13
     * @discription 
     * @param UID、
     * @return 
     */
//    @RequestMapping(value="/trade")
//    public String trade(){
//
//    }
//
//    @RequestMapping(value="/tradeRecord")
//    public String tradeRecord(){
//
//    }
}
