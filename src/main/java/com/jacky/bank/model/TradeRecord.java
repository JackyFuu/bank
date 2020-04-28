package com.jacky.bank.model;

import java.util.Date;

public class TradeRecord {
    private String tradeId;

    private Integer tradeType;

    private Date tradeTime;

    private String userIda;

    private String userIdb;

    private String tradeMoney;

    private String isSuccess;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getUserIda() {
        return userIda;
    }

    public void setUserIda(String userIda) {
        this.userIda = userIda;
    }

    public String getUserIdb() {
        return userIdb;
    }

    public void setUserIdb(String userIdb) {
        this.userIdb = userIdb;
    }

    public String getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(String tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }
}