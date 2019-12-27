package com.ets.tkmybatistest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "SS_MANAGER_INFO")
public class SsManagerInfo implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select SEQ_SS_MANAGER_INFO_ID.nextval from dual")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "DEV_DEPT_ID")
    private Integer devDeptId;

    @Column(name = "DEV_DEPT_CODE")
    private String devDeptCode;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "IDENTITY_TYPE")
    private Integer identityType;

    @Column(name = "OP_ID")
    private Integer opId;

    @Column(name = "STATUS")
    private Integer status;

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
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return DEV_DEPT_ID
     */
    public Integer getDevDeptId() {
        return devDeptId;
    }

    /**
     * @param devDeptId
     */
    public void setDevDeptId(Integer devDeptId) {
        this.devDeptId = devDeptId;
    }

    /**
     * @return DEV_DEPT_CODE
     */
    public String getDevDeptCode() {
        return devDeptCode;
    }

    /**
     * @param devDeptCode
     */
    public void setDevDeptCode(String devDeptCode) {
        this.devDeptCode = devDeptCode;
    }

    /**
     * @return ACCOUNT
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
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
     * @return IDENTITY_TYPE
     */
    public Integer getIdentityType() {
        return identityType;
    }

    /**
     * @param identityType
     */
    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
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
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", devDeptId=").append(devDeptId);
        sb.append(", devDeptCode=").append(devDeptCode);
        sb.append(", sys=").append(account);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", identityType=").append(identityType);
        sb.append(", opId=").append(opId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}