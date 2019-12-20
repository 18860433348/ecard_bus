package com.ets.tkmybatisgenerator.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

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
     * @return WORK_NO
     */
    public String getWorkNo() {
        return workNo;
    }

    /**
     * @param workNo
     */
    public void setWorkNo(String workNo) {
        this.workNo = workNo;
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
     * @return PINYIN
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * @param pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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

    /**
     * @return DEPT_ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return ID_CARD_TYPE
     */
    public Integer getIdCardType() {
        return idCardType;
    }

    /**
     * @param idCardType
     */
    public void setIdCardType(Integer idCardType) {
        this.idCardType = idCardType;
    }

    /**
     * @return ID_CARD_NO
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * @param idCardNo
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    /**
     * @return SEX
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return IDENTITY_ID
     */
    public Integer getIdentityId() {
        return identityId;
    }

    /**
     * @param identityId
     */
    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    /**
     * @return CARD_TYPE
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    /**
     * @return ENTRY_DATE
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return OUT_DATE
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * @param outDate
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    /**
     * @return POLITICAL_ID
     */
    public Integer getPoliticalId() {
        return politicalId;
    }

    /**
     * @param politicalId
     */
    public void setPoliticalId(Integer politicalId) {
        this.politicalId = politicalId;
    }

    /**
     * @return NATION_ID
     */
    public Integer getNationId() {
        return nationId;
    }

    /**
     * @param nationId
     */
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    /**
     * @return NATIVE_PLACE_ID
     */
    public Integer getNativePlaceId() {
        return nativePlaceId;
    }

    /**
     * @param nativePlaceId
     */
    public void setNativePlaceId(Integer nativePlaceId) {
        this.nativePlaceId = nativePlaceId;
    }

    /**
     * @return BIRTHDAY
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return EDUCATION_ID
     */
    public Integer getEducationId() {
        return educationId;
    }

    /**
     * @param educationId
     */
    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return MARRIAGE_STATUS
     */
    public Integer getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * @param marriageStatus
     */
    public void setMarriageStatus(Integer marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    /**
     * @return CUST_BATCH_ID
     */
    public Integer getCustBatchId() {
        return custBatchId;
    }

    /**
     * @param custBatchId
     */
    public void setCustBatchId(Integer custBatchId) {
        this.custBatchId = custBatchId;
    }

    /**
     * @return IS_OPEN_CARD
     */
    public Integer getIsOpenCard() {
        return isOpenCard;
    }

    /**
     * @param isOpenCard
     */
    public void setIsOpenCard(Integer isOpenCard) {
        this.isOpenCard = isOpenCard;
    }

    /**
     * @return ACCOUNT_PWD
     */
    public String getAccountPwd() {
        return accountPwd;
    }

    /**
     * @param accountPwd
     */
    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd;
    }

    /**
     * @return THIRD_ID
     */
    public String getThirdId() {
        return thirdId;
    }

    /**
     * @param thirdId
     */
    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    /**
     * @return ACCES_TOKEN
     */
    public String getAccesToken() {
        return accesToken;
    }

    /**
     * @param accesToken
     */
    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
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

    /**
     * @return BACK1
     */
    public String getBack1() {
        return back1;
    }

    /**
     * @param back1
     */
    public void setBack1(String back1) {
        this.back1 = back1;
    }

    /**
     * @return BACK2
     */
    public String getBack2() {
        return back2;
    }

    /**
     * @param back2
     */
    public void setBack2(String back2) {
        this.back2 = back2;
    }

    /**
     * @return BACK3
     */
    public String getBack3() {
        return back3;
    }

    /**
     * @param back3
     */
    public void setBack3(String back3) {
        this.back3 = back3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", workNo=").append(workNo);
        sb.append(", custCode=").append(custCode);
        sb.append(", name=").append(name);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", status=").append(status);
        sb.append(", deptId=").append(deptId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", opId=").append(opId);
        sb.append(", phone=").append(phone);
        sb.append(", idCardType=").append(idCardType);
        sb.append(", idCardNo=").append(idCardNo);
        sb.append(", sex=").append(sex);
        sb.append(", address=").append(address);
        sb.append(", identityId=").append(identityId);
        sb.append(", cardType=").append(cardType);
        sb.append(", entryDate=").append(entryDate);
        sb.append(", outDate=").append(outDate);
        sb.append(", politicalId=").append(politicalId);
        sb.append(", nationId=").append(nationId);
        sb.append(", nativePlaceId=").append(nativePlaceId);
        sb.append(", birthday=").append(birthday);
        sb.append(", educationId=").append(educationId);
        sb.append(", email=").append(email);
        sb.append(", marriageStatus=").append(marriageStatus);
        sb.append(", custBatchId=").append(custBatchId);
        sb.append(", isOpenCard=").append(isOpenCard);
        sb.append(", accountPwd=").append(accountPwd);
        sb.append(", thirdId=").append(thirdId);
        sb.append(", accesToken=").append(accesToken);
        sb.append(", ver=").append(ver);
        sb.append(", back1=").append(back1);
        sb.append(", back2=").append(back2);
        sb.append(", back3=").append(back3);
        sb.append("]");
        return sb.toString();
    }
}