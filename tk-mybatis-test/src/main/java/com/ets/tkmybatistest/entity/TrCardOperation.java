package com.ets.tkmybatistest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "TR_CARD_OPERATION")
public class TrCardOperation implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select SEQ_TR_CARD_OPERATION_ID.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "DEV_TRADE_NO")
    private String devTradeNo;

    @Column(name = "TRADE_NO")
    private String tradeNo;

    @Column(name = "OP_TYPE")
    private Integer opType;

    @Column(name = "OP_ID")
    private Integer opId;

    @Column(name = "DEV_SN")
    private String devSn;

    @Column(name = "DEV_ID")
    private Integer devId;

    @Column(name = "CARD_NO")
    private String cardNo;

    @Column(name = "CUST_CODE")
    private String custCode;

    @Column(name = "CARD_INDEX")
    private Integer cardIndex;

    @Column(name = "CARD_SN")
    private Integer cardSn;

    @Column(name = "WALLET_0")
    private Integer wallet0;

    @Column(name = "WALLET_1")
    private Integer wallet1;

    @Column(name = "WALLET_2")
    private Integer wallet2;

    @Column(name = "WALLET_OP_0")
    private Integer walletOp0;

    @Column(name = "WALLET_OP_1")
    private Integer walletOp1;

    @Column(name = "WALLET_OP_2")
    private Integer walletOp2;

    @Column(name = "WALLET_ED_0")
    private Integer walletEd0;

    @Column(name = "WALLET_ED_1")
    private Integer walletEd1;

    @Column(name = "WALLET_ED_2")
    private Integer walletEd2;

    @Column(name = "OP_TIME")
    private Date opTime;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "REMARK")
    private String remark;

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
     * @return OP_TYPE
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * @param opType
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    /**
     * @return OP_ID
     */
    public Integer getOpId() {
        return opId;
    }

    /**
     * @param opId
     */
    public void setOpId(Integer opId) {
        this.opId = opId;
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
     * @return DEV_ID
     */
    public Integer getDevId() {
        return devId;
    }

    /**
     * @param devId
     */
    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    /**
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
     * @return CARD_INDEX
     */
    public Integer getCardIndex() {
        return cardIndex;
    }

    /**
     * @param cardIndex
     */
    public void setCardIndex(Integer cardIndex) {
        this.cardIndex = cardIndex;
    }

    /**
     * @return CARD_SN
     */
    public Integer getCardSn() {
        return cardSn;
    }

    /**
     * @param cardSn
     */
    public void setCardSn(Integer cardSn) {
        this.cardSn = cardSn;
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
     * @return WALLET_OP_0
     */
    public Integer getWalletOp0() {
        return walletOp0;
    }

    /**
     * @param walletOp0
     */
    public void setWalletOp0(Integer walletOp0) {
        this.walletOp0 = walletOp0;
    }

    /**
     * @return WALLET_OP_1
     */
    public Integer getWalletOp1() {
        return walletOp1;
    }

    /**
     * @param walletOp1
     */
    public void setWalletOp1(Integer walletOp1) {
        this.walletOp1 = walletOp1;
    }

    /**
     * @return WALLET_OP_2
     */
    public Integer getWalletOp2() {
        return walletOp2;
    }

    /**
     * @param walletOp2
     */
    public void setWalletOp2(Integer walletOp2) {
        this.walletOp2 = walletOp2;
    }

    /**
     * @return WALLET_ED_0
     */
    public Integer getWalletEd0() {
        return walletEd0;
    }

    /**
     * @param walletEd0
     */
    public void setWalletEd0(Integer walletEd0) {
        this.walletEd0 = walletEd0;
    }

    /**
     * @return WALLET_ED_1
     */
    public Integer getWalletEd1() {
        return walletEd1;
    }

    /**
     * @param walletEd1
     */
    public void setWalletEd1(Integer walletEd1) {
        this.walletEd1 = walletEd1;
    }

    /**
     * @return WALLET_ED_2
     */
    public Integer getWalletEd2() {
        return walletEd2;
    }

    /**
     * @param walletEd2
     */
    public void setWalletEd2(Integer walletEd2) {
        this.walletEd2 = walletEd2;
    }

    /**
     * @return OP_TIME
     */
    public Date getOpTime() {
        return opTime;
    }

    /**
     * @param opTime
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", devTradeNo=").append(devTradeNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", opType=").append(opType);
        sb.append(", opId=").append(opId);
        sb.append(", devSn=").append(devSn);
        sb.append(", devId=").append(devId);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", custCode=").append(custCode);
        sb.append(", cardIndex=").append(cardIndex);
        sb.append(", cardSn=").append(cardSn);
        sb.append(", wallet0=").append(wallet0);
        sb.append(", wallet1=").append(wallet1);
        sb.append(", wallet2=").append(wallet2);
        sb.append(", walletOp0=").append(walletOp0);
        sb.append(", walletOp1=").append(walletOp1);
        sb.append(", walletOp2=").append(walletOp2);
        sb.append(", walletEd0=").append(walletEd0);
        sb.append(", walletEd1=").append(walletEd1);
        sb.append(", walletEd2=").append(walletEd2);
        sb.append(", opTime=").append(opTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}