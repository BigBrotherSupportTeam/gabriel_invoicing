package com.brother.support.domain;

import java.util.Date;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.status_cd
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private String statusCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.status_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private Date statusDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.role_id
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.create_staff
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private String createStaff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.create_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.update_staff
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private String updateStaff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.update_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.remark
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.status_cd
     *
     * @return the value of user_info.status_cd
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public String getStatusCd() {
        return statusCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.status_cd
     *
     * @param statusCd the value for user_info.status_cd
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd == null ? null : statusCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.status_date
     *
     * @return the value of user_info.status_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.status_date
     *
     * @param statusDate the value for user_info.status_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.role_id
     *
     * @return the value of user_info.role_id
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.role_id
     *
     * @param roleId the value for user_info.role_id
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.create_staff
     *
     * @return the value of user_info.create_staff
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public String getCreateStaff() {
        return createStaff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.create_staff
     *
     * @param createStaff the value for user_info.create_staff
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setCreateStaff(String createStaff) {
        this.createStaff = createStaff == null ? null : createStaff.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.create_date
     *
     * @return the value of user_info.create_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.create_date
     *
     * @param createDate the value for user_info.create_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.update_staff
     *
     * @return the value of user_info.update_staff
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public String getUpdateStaff() {
        return updateStaff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.update_staff
     *
     * @param updateStaff the value for user_info.update_staff
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setUpdateStaff(String updateStaff) {
        this.updateStaff = updateStaff == null ? null : updateStaff.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.update_date
     *
     * @return the value of user_info.update_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.update_date
     *
     * @param updateDate the value for user_info.update_date
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.remark
     *
     * @return the value of user_info.remark
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.remark
     *
     * @param remark the value for user_info.remark
     *
     * @mbg.generated Sat Jun 20 13:26:21 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}