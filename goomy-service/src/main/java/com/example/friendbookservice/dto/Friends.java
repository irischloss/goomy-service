package com.example.friendbookservice.dto;

import java.util.Date;

public class Friends {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.id
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.username
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.phone_number
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.email
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.birthday
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.created_at
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friends.updated_at
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.id
     *
     * @return the value of friends.id
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.id
     *
     * @param id the value for friends.id
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.username
     *
     * @return the value of friends.username
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.username
     *
     * @param username the value for friends.username
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.phone_number
     *
     * @return the value of friends.phone_number
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.phone_number
     *
     * @param phoneNumber the value for friends.phone_number
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.email
     *
     * @return the value of friends.email
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.email
     *
     * @param email the value for friends.email
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.birthday
     *
     * @return the value of friends.birthday
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.birthday
     *
     * @param birthday the value for friends.birthday
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.created_at
     *
     * @return the value of friends.created_at
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.created_at
     *
     * @param createdAt the value for friends.created_at
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friends.updated_at
     *
     * @return the value of friends.updated_at
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friends.updated_at
     *
     * @param updatedAt the value for friends.updated_at
     *
     * @mbg.generated Sun Jun 15 19:17:43 CST 2025
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}