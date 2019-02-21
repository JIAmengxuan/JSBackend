package ie.tcd.ase.entity;

import java.util.Date;

public class LoginInfo {
    private Integer id;

    private Date createDate;

    private Date updateDate;

    private String createBy;

    private String updateBy;

    private Integer userId;

    private Integer userStatus;

    private String password33;

    private Integer authorizationToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getPassword33() {
        return password33;
    }

    public void setPassword33(String password33) {
        this.password33 = password33 == null ? null : password33.trim();
    }

    public Integer getAuthorizationToken() {
        return authorizationToken;
    }

    public void setAuthorizationToken(Integer authorizationToken) {
        this.authorizationToken = authorizationToken;
    }
}