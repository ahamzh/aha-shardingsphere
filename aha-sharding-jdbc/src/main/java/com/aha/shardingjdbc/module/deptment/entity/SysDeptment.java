package com.aha.shardingjdbc.module.deptment.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门信息(SysDeptment0)实体类
 *
 * @author zhihao.mao
 * @since 2020-09-08 17:16:49
 */
public class SysDeptment implements Serializable {
    private static final long serialVersionUID = 691683366059885056L;
    /**
     * 项目ID
     */
    private Integer projectId;
    /**
     * 租户编号
     */
    private Integer tenantId;
    /**
     * 部门ID
     */
    private Integer deptId;
    /**
     * 组织ID
     */
    private Integer groupId;
    /**
     * 部门标识
     */
    private String orgGuid;
    /**
     * 父ID
     */
    private Integer pid;
    /**
     * 部门编号
     */
    private String deptCode;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 项目全称
     */
    private String fullName;
    /**
     * 项目简称
     */
    private String shortName;
    /**
     * 全路径
     */
    private String fullPath;
    /**
     * 排序号
     */
    private Integer orderNo;
    /**
     * 部门职能
     */
    private String deptFunction;
    /**
     * 部门类型(DEPT_TYPE)
     */
    private Object deptType;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 成立日期
     */
    private Object buildDate;
    /**
     * 数据状态（ENABLED）
     */
    private Object dataStatus;
    /**
     * JSON字段
     */
    private String json;
    /**
     * 版本
     */
    private Integer version;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updator;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 部门监管分类
     */
    private String supervisionType;
    /**
     * 信用代码
     */
    private String creditCode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 行政区域字典值
     */
    private Integer areaCode;
    /**
     * 和信的组织主键
     */
    private String hexinId;
    /**
     * 和信的父级组织主键
     */
    private String hexinParentId;
    /**
     * 分库iD
     */
    private Integer dbId;


    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getOrgGuid() {
        return orgGuid;
    }

    public void setOrgGuid(String orgGuid) {
        this.orgGuid = orgGuid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getDeptFunction() {
        return deptFunction;
    }

    public void setDeptFunction(String deptFunction) {
        this.deptFunction = deptFunction;
    }

    public Object getDeptType() {
        return deptType;
    }

    public void setDeptType(Object deptType) {
        this.deptType = deptType;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Object getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Object buildDate) {
        this.buildDate = buildDate;
    }

    public Object getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Object dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getSupervisionType() {
        return supervisionType;
    }

    public void setSupervisionType(String supervisionType) {
        this.supervisionType = supervisionType;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getHexinId() {
        return hexinId;
    }

    public void setHexinId(String hexinId) {
        this.hexinId = hexinId;
    }

    public String getHexinParentId() {
        return hexinParentId;
    }

    public void setHexinParentId(String hexinParentId) {
        this.hexinParentId = hexinParentId;
    }

    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }

}