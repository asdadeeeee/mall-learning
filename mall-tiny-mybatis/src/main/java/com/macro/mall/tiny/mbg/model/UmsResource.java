package com.macro.mall.tiny.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UmsResource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_resource.id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_resource.create_time
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_resource.name
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_resource.url
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_resource.description
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_resource.category_id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_resource.id
     *
     * @return the value of ums_resource.id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_resource.id
     *
     * @param id the value for ums_resource.id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_resource.create_time
     *
     * @return the value of ums_resource.create_time
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_resource.create_time
     *
     * @param createTime the value for ums_resource.create_time
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_resource.name
     *
     * @return the value of ums_resource.name
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_resource.name
     *
     * @param name the value for ums_resource.name
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_resource.url
     *
     * @return the value of ums_resource.url
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_resource.url
     *
     * @param url the value for ums_resource.url
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_resource.description
     *
     * @return the value of ums_resource.description
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_resource.description
     *
     * @param description the value for ums_resource.description
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_resource.category_id
     *
     * @return the value of ums_resource.category_id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_resource.category_id
     *
     * @param categoryId the value for ums_resource.category_id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", description=").append(description);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}