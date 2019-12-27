package com.ets.tkmybatistest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "REP_BALANCE_SYS_DAY_TOTAL")
public class RepBalanceSysDayTotal implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_REP_BALANCE_SYS_DAY_TOTAL_id.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "WALLET_0")
    private Integer wallet0;

    @Column(name = "WALLET_1")
    private Integer wallet1;

    @Column(name = "WALLET_2")
    private Integer wallet2;

    @Column(name = "BALANCE_TOTAL")
    private Integer balanceTotal;

    @Column(name = "WALLET_PRE_0")
    private Integer walletPre0;

    @Column(name = "WALLET_PRE_1")
    private Integer walletPre1;

    @Column(name = "WALLET_PRE_2")
    private Integer walletPre2;

    @Column(name = "BALANCE_PRE_TOTAL")
    private Integer balancePreTotal;

    @Column(name = "TRADE_AMOUNT_IN")
    private Integer tradeAmountIn;

    @Column(name = "TRADE_AMOUNT_OUT")
    private Integer tradeAmountOut;

    @Column(name = "JS_DATE")
    private Date jsDate;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "OVER_AMOUNT_PRE")
    private Integer overAmountPre;

    @Column(name = "OVER_AMOUNT")
    private Integer overAmount;

    @Column(name = "UPLOAD_DATE")
    private Date uploadDate;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return LEGAL_PERSON_CODE
     */
    public String getLegalPersonCode() {
        return legalPersonCode;
    }

    /**
     * @param legalPersonCode
     */
    public void setLegalPersonCode(String legalPersonCode) {
        this.legalPersonCode = legalPersonCode;
    }

    /**
     * @return WALLET_0
     */
    public Integer getWallet0() {
        return wallet0;
    }

    /**
     * @param wallet0
     */
    public void setWallet0(Integer wallet0) {
        this.wallet0 = wallet0;
    }

    /**
     * @return WALLET_1
     */
    public Integer getWallet1() {
        return wallet1;
    }

    /**
     * @param wallet1
     */
    public void setWallet1(Integer wallet1) {
        this.wallet1 = wallet1;
    }

    /**
     * @return WALLET_2
     */
    public Integer getWallet2() {
        return wallet2;
    }

    /**
     * @param wallet2
     */
    public void setWallet2(Integer wallet2) {
        this.wallet2 = wallet2;
    }

    /**
     * @return BALANCE_TOTAL
     */
    public Integer getBalanceTotal() {
        return balanceTotal;
    }

    /**
     * @param balanceTotal
     */
    public void setBalanceTotal(Integer balanceTotal) {
        this.balanceTotal = balanceTotal;
    }

    /**
     * @return WALLET_PRE_0
     */
    public Integer getWalletPre0() {
        return walletPre0;
    }

    /**
     * @param walletPre0
     */
    public void setWalletPre0(Integer walletPre0) {
        this.walletPre0 = walletPre0;
    }

    /**
     * @return WALLET_PRE_1
     */
    public Integer getWalletPre1() {
        return walletPre1;
    }

    /**
     * @param walletPre1
     */
    public void setWalletPre1(Integer walletPre1) {
        this.walletPre1 = walletPre1;
    }

    /**
     * @return WALLET_PRE_2
     */
    public Integer getWalletPre2() {
        return walletPre2;
    }

    /**
     * @param walletPre2
     */
    public void setWalletPre2(Integer walletPre2) {
        this.walletPre2 = walletPre2;
    }

    /**
     * @return BALANCE_PRE_TOTAL
     */
    public Integer getBalancePreTotal() {
        return balancePreTotal;
    }

    /**
     * @param balancePreTotal
     */
    public void setBalancePreTotal(Integer balancePreTotal) {
        this.balancePreTotal = balancePreTotal;
    }

    /**
     * @return TRADE_AMOUNT_IN
     */
    public Integer getTradeAmountIn() {
        return tradeAmountIn;
    }

    /**
     * @param tradeAmountIn
     */
    public void setTradeAmountIn(Integer tradeAmountIn) {
        this.tradeAmountIn = tradeAmountIn;
    }

    /**
     * @return TRADE_AMOUNT_OUT
     */
    public Integer getTradeAmountOut() {
        return tradeAmountOut;
    }

    /**
     * @param tradeAmountOut
     */
    public void setTradeAmountOut(Integer tradeAmountOut) {
        this.tradeAmountOut = tradeAmountOut;
    }

    /**
     * @return JS_DATE
     */
    public Date getJsDate() {
        return jsDate;
    }

    /**
     * @param jsDate
     */
    public void setJsDate(Date jsDate) {
        this.jsDate = jsDate;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return OVER_AMOUNT_PRE
     */
    public Integer getOverAmountPre() {
        return overAmountPre;
    }

    /**
     * @param overAmountPre
     */
    public void setOverAmountPre(Integer overAmountPre) {
        this.overAmountPre = overAmountPre;
    }

    /**
     * @return OVER_AMOUNT
     */
    public Integer getOverAmount() {
        return overAmount;
    }

    /**
     * @param overAmount
     */
    public void setOverAmount(Integer overAmount) {
        this.overAmount = overAmount;
    }

    /**
     * @return UPLOAD_DATE
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * @param uploadDate
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", wallet0=").append(wallet0);
        sb.append(", wallet1=").append(wallet1);
        sb.append(", wallet2=").append(wallet2);
        sb.append(", balanceTotal=").append(balanceTotal);
        sb.append(", walletPre0=").append(walletPre0);
        sb.append(", walletPre1=").append(walletPre1);
        sb.append(", walletPre2=").append(walletPre2);
        sb.append(", balancePreTotal=").append(balancePreTotal);
        sb.append(", tradeAmountIn=").append(tradeAmountIn);
        sb.append(", tradeAmountOut=").append(tradeAmountOut);
        sb.append(", jsDate=").append(jsDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", overAmountPre=").append(overAmountPre);
        sb.append(", overAmount=").append(overAmount);
        sb.append(", uploadDate=").append(uploadDate);
        sb.append("]");
        return sb.toString();
    }
}