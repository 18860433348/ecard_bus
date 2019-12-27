package com.ets.tkmybatistest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "REP_TJ_OPER")
public class RepTjOper implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_rep_tj_oper_id.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "OPID")
    private Integer opid;

    @Column(name = "ACC_CODE")
    private Integer accCode;

    @Column(name = "DISCOUNT_COUNT")
    private Integer discountCount;

    @Column(name = "DISCOUNT_AMOUNT_COUNT")
    private Integer discountAmountCount;

    @Column(name = "EXTRA_COUNT")
    private Integer extraCount;

    @Column(name = "EXTRA_AMOUNT_COUNT")
    private Integer extraAmountCount;

    @Column(name = "SUB_COUNT")
    private Integer subCount;

    @Column(name = "SUB_AMOUNT_COUNT")
    private Integer subAmountCount;

    @Column(name = "TRADE_COUNT")
    private Integer tradeCount;

    @Column(name = "TRADE_AMOUNT_COUNT")
    private Integer tradeAmountCount;

    @Column(name = "TOTAL_AMOUNT_COUNT")
    private Integer totalAmountCount;

    @Column(name = "TRADE_DATE")
    private Date tradeDate;

    @Column(name = "TJ_DATE")
    private Date tjDate;

    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * @return OPID
     */
    public Integer getOpid() {
        return opid;
    }

    /**
     * @param opid
     */
    public void setOpid(Integer opid) {
        this.opid = opid;
    }

    /**
     * @return ACC_CODE
     */
    public Integer getAccCode() {
        return accCode;
    }

    /**
     * @param accCode
     */
    public void setAccCode(Integer accCode) {
        this.accCode = accCode;
    }

    /**
     * @return DISCOUNT_COUNT
     */
    public Integer getDiscountCount() {
        return discountCount;
    }

    /**
     * @param discountCount
     */
    public void setDiscountCount(Integer discountCount) {
        this.discountCount = discountCount;
    }

    /**
     * @return DISCOUNT_AMOUNT_COUNT
     */
    public Integer getDiscountAmountCount() {
        return discountAmountCount;
    }

    /**
     * @param discountAmountCount
     */
    public void setDiscountAmountCount(Integer discountAmountCount) {
        this.discountAmountCount = discountAmountCount;
    }

    /**
     * @return EXTRA_COUNT
     */
    public Integer getExtraCount() {
        return extraCount;
    }

    /**
     * @param extraCount
     */
    public void setExtraCount(Integer extraCount) {
        this.extraCount = extraCount;
    }

    /**
     * @return EXTRA_AMOUNT_COUNT
     */
    public Integer getExtraAmountCount() {
        return extraAmountCount;
    }

    /**
     * @param extraAmountCount
     */
    public void setExtraAmountCount(Integer extraAmountCount) {
        this.extraAmountCount = extraAmountCount;
    }

    /**
     * @return SUB_COUNT
     */
    public Integer getSubCount() {
        return subCount;
    }

    /**
     * @param subCount
     */
    public void setSubCount(Integer subCount) {
        this.subCount = subCount;
    }

    /**
     * @return SUB_AMOUNT_COUNT
     */
    public Integer getSubAmountCount() {
        return subAmountCount;
    }

    /**
     * @param subAmountCount
     */
    public void setSubAmountCount(Integer subAmountCount) {
        this.subAmountCount = subAmountCount;
    }

    /**
     * @return TRADE_COUNT
     */
    public Integer getTradeCount() {
        return tradeCount;
    }

    /**
     * @param tradeCount
     */
    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
    }

    /**
     * @return TRADE_AMOUNT_COUNT
     */
    public Integer getTradeAmountCount() {
        return tradeAmountCount;
    }

    /**
     * @param tradeAmountCount
     */
    public void setTradeAmountCount(Integer tradeAmountCount) {
        this.tradeAmountCount = tradeAmountCount;
    }

    /**
     * @return TOTAL_AMOUNT_COUNT
     */
    public Integer getTotalAmountCount() {
        return totalAmountCount;
    }

    /**
     * @param totalAmountCount
     */
    public void setTotalAmountCount(Integer totalAmountCount) {
        this.totalAmountCount = totalAmountCount;
    }

    /**
     * @return TRADE_DATE
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     * @param tradeDate
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    /**
     * @return TJ_DATE
     */
    public Date getTjDate() {
        return tjDate;
    }

    /**
     * @param tjDate
     */
    public void setTjDate(Date tjDate) {
        this.tjDate = tjDate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", opid=").append(opid);
        sb.append(", accCode=").append(accCode);
        sb.append(", discountCount=").append(discountCount);
        sb.append(", discountAmountCount=").append(discountAmountCount);
        sb.append(", extraCount=").append(extraCount);
        sb.append(", extraAmountCount=").append(extraAmountCount);
        sb.append(", subCount=").append(subCount);
        sb.append(", subAmountCount=").append(subAmountCount);
        sb.append(", tradeCount=").append(tradeCount);
        sb.append(", tradeAmountCount=").append(tradeAmountCount);
        sb.append(", totalAmountCount=").append(totalAmountCount);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", tjDate=").append(tjDate);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}