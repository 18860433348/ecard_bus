package com.ets.tkmybatistest.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "TR_DEPOSIT_ACC")
public class TrDepositAcc implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_tr_deposit_acc_id.nextval from dual")
    private BigDecimal id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "CUST_CODE")
    private String custCode;

    @Column(name = "ACC_CODE")
    private BigDecimal accCode;

    @Column(name = "ACC_DES")
    private String accDes;

    @Column(name = "TRADE_AMOUNT")
    private BigDecimal tradeAmount;

    @Column(name = "DEV_TRADE_NO")
    private String devTradeNo;

    @Column(name = "TRADE_NO")
    private String tradeNo;

    @Column(name = "THIRD_TRADE_NO")
    private String thirdTradeNo;

    @Column(name = "DEV_SN")
    private String devSn;

    @Column(name = "DEV_DEPT_ID")
    private BigDecimal devDeptId;

    @Column(name = "PAY_WAY")
    private String payWay;

    @Column(name = "OP_ID")
    private BigDecimal opId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "STATUS")
    private BigDecimal status;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "TRADE_NO_PRE")
    private String tradeNoPre;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
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
     * @return CUST_CODE
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * @param custCode
     */
    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    /**
     * @return ACC_CODE
     */
    public BigDecimal getAccCode() {
        return accCode;
    }

    /**
     * @param accCode
     */
    public void setAccCode(BigDecimal accCode) {
        this.accCode = accCode;
    }

    /**
     * @return ACC_DES
     */
    public String getAccDes() {
        return accDes;
    }

    /**
     * @param accDes
     */
    public void setAccDes(String accDes) {
        this.accDes = accDes;
    }

    /**
     * @return TRADE_AMOUNT
     */
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * @param tradeAmount
     */
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * @return DEV_TRADE_NO
     */
    public String getDevTradeNo() {
        return devTradeNo;
    }

    /**
     * @param devTradeNo
     */
    public void setDevTradeNo(String devTradeNo) {
        this.devTradeNo = devTradeNo;
    }

    /**
     * @return TRADE_NO
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * @param tradeNo
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * @return THIRD_TRADE_NO
     */
    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    /**
     * @param thirdTradeNo
     */
    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    /**
     * @return DEV_SN
     */
    public String getDevSn() {
        return devSn;
    }

    /**
     * @param devSn
     */
    public void setDevSn(String devSn) {
        this.devSn = devSn;
    }

    /**
     * @return DEV_DEPT_ID
     */
    public BigDecimal getDevDeptId() {
        return devDeptId;
    }

    /**
     * @param devDeptId
     */
    public void setDevDeptId(BigDecimal devDeptId) {
        this.devDeptId = devDeptId;
    }

    /**
     * @return PAY_WAY
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * @param payWay
     */
    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    /**
     * @return OP_ID
     */
    public BigDecimal getOpId() {
        return opId;
    }

    /**
     * @param opId
     */
    public void setOpId(BigDecimal opId) {
        this.opId = opId;
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
     * @return STATUS
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return TRADE_NO_PRE
     */
    public String getTradeNoPre() {
        return tradeNoPre;
    }

    /**
     * @param tradeNoPre
     */
    public void setTradeNoPre(String tradeNoPre) {
        this.tradeNoPre = tradeNoPre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", custCode=").append(custCode);
        sb.append(", accCode=").append(accCode);
        sb.append(", accDes=").append(accDes);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", devTradeNo=").append(devTradeNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", thirdTradeNo=").append(thirdTradeNo);
        sb.append(", devSn=").append(devSn);
        sb.append(", devDeptId=").append(devDeptId);
        sb.append(", payWay=").append(payWay);
        sb.append(", opId=").append(opId);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", tradeNoPre=").append(tradeNoPre);
        sb.append("]");
        return sb.toString();
    }
}