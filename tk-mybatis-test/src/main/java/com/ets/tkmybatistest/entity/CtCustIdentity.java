package com.ets.tkmybatistest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_CUST_IDENTITY")
public class CtCustIdentity implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select SEQ_ct_cust_identity_ID.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "PID")
    private Integer pid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "OP_ID")
    private Integer opId;

    @Column(name = "VER")
    private Integer ver;

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
     * @return PID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
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
     * @return VER
     */
    public Integer getVer() {
        return ver;
    }

    /**
     * @param ver
     */
    public void setVer(Integer ver) {
        this.ver = ver;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", opId=").append(opId);
        sb.append(", ver=").append(ver);
        sb.append("]");
        return sb.toString();
    }
}