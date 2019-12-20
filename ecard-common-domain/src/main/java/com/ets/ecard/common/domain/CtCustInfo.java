package com.ets.ecard.common.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "CT_CUST_INFO")
public class CtCustInfo implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_CT_CUST_INFO_id.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "WORK_NO")
    private String workNo;

    @Column(name = "CUST_CODE")
    private String custCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PINYIN")
    private String pinyin;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "OP_ID")
    private Integer opId;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ID_CARD_TYPE")
    private Integer idCardType;

    @Column(name = "ID_CARD_NO")
    private String idCardNo;

    @Column(name = "SEX")
    private Integer sex;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "IDENTITY_ID")
    private Integer identityId;

    @Column(name = "CARD_TYPE")
    private Integer cardType;

    @Column(name = "ENTRY_DATE")
    private Date entryDate;

    @Column(name = "OUT_DATE")
    private Date outDate;

    @Column(name = "POLITICAL_ID")
    private Integer politicalId;

    @Column(name = "NATION_ID")
    private Integer nationId;

    @Column(name = "NATIVE_PLACE_ID")
    private Integer nativePlaceId;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "EDUCATION_ID")
    private Integer educationId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MARRIAGE_STATUS")
    private Integer marriageStatus;

    @Column(name = "CUST_BATCH_ID")
    private Integer custBatchId;

    @Column(name = "IS_OPEN_CARD")
    private Integer isOpenCard;

    @Column(name = "ACCOUNT_PWD")
    private String accountPwd;

    @Column(name = "THIRD_ID")
    private String thirdId;

    @Column(name = "ACCES_TOKEN")
    private String accesToken;

    @Column(name = "VER")
    private Integer ver;

    @Column(name = "BACK1")
    private String back1;

    @Column(name = "BACK2")
    private String back2;

    @Column(name = "BACK3")
    private String back3;

    private static final long serialVersionUID = 1L;

    /**
    * 非数据库字段
    */
    @Transient
    private String myWork;

}