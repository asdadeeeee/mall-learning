package com.macro.mall.tiny.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UmsMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.parent_id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.create_time
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.title
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.level
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.sort
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.name
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.icon
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_menu.hidden
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private Integer hidden;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_menu
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.id
     *
     * @return the value of ums_menu.id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.id
     *
     * @param id the value for ums_menu.id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.parent_id
     *
     * @return the value of ums_menu.parent_id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.parent_id
     *
     * @param parentId the value for ums_menu.parent_id
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.create_time
     *
     * @return the value of ums_menu.create_time
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.create_time
     *
     * @param createTime the value for ums_menu.create_time
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.title
     *
     * @return the value of ums_menu.title
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.title
     *
     * @param title the value for ums_menu.title
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.level
     *
     * @return the value of ums_menu.level
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.level
     *
     * @param level the value for ums_menu.level
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.sort
     *
     * @return the value of ums_menu.sort
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.sort
     *
     * @param sort the value for ums_menu.sort
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.name
     *
     * @return the value of ums_menu.name
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.name
     *
     * @param name the value for ums_menu.name
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.icon
     *
     * @return the value of ums_menu.icon
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.icon
     *
     * @param icon the value for ums_menu.icon
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_menu.hidden
     *
     * @return the value of ums_menu.hidden
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public Integer getHidden() {
        return hidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_menu.hidden
     *
     * @param hidden the value for ums_menu.hidden
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
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
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", title=").append(title);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", hidden=").append(hidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}