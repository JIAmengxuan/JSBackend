package ie.tcd.ase.entity;

import java.util.Date;

public class Schedule {
    private Integer id;

    private Date createDate;

    private Date updateDate;

    private String createBy;

    private String updateBy;

    private Integer userId;

    private String startPosition;

    private String startPositionLongitude;

    private String startPositionLatitude;

    private String endPosition;

    private String endPositionLongitude;

    private String endPositionLatitude;

    private Integer weekday;

    private Date startDuration;

    private Date endDuration;

    private Date startDuration2;

    private Date endDuration2;

    private Integer genderPreference;

    private Integer ratingPreference;

    private Integer commuteType;

    private Date engageTime;

    private Integer status;

    private String currentServer;

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

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition == null ? null : startPosition.trim();
    }

    public String getStartPositionLongitude() {
        return startPositionLongitude;
    }

    public void setStartPositionLongitude(String startPositionLongitude) {
        this.startPositionLongitude = startPositionLongitude == null ? null : startPositionLongitude.trim();
    }

    public String getStartPositionLatitude() {
        return startPositionLatitude;
    }

    public void setStartPositionLatitude(String startPositionLatitude) {
        this.startPositionLatitude = startPositionLatitude == null ? null : startPositionLatitude.trim();
    }

    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition == null ? null : endPosition.trim();
    }

    public String getEndPositionLongitude() {
        return endPositionLongitude;
    }

    public void setEndPositionLongitude(String endPositionLongitude) {
        this.endPositionLongitude = endPositionLongitude == null ? null : endPositionLongitude.trim();
    }

    public String getEndPositionLatitude() {
        return endPositionLatitude;
    }

    public void setEndPositionLatitude(String endPositionLatitude) {
        this.endPositionLatitude = endPositionLatitude == null ? null : endPositionLatitude.trim();
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Date getStartDuration() {
        return startDuration;
    }

    public void setStartDuration(Date startDuration) {
        this.startDuration = startDuration;
    }

    public Date getEndDuration() {
        return endDuration;
    }

    public void setEndDuration(Date endDuration) {
        this.endDuration = endDuration;
    }

    public Date getStartDuration2() {
        return startDuration2;
    }

    public void setStartDuration2(Date startDuration2) {
        this.startDuration2 = startDuration2;
    }

    public Date getEndDuration2() {
        return endDuration2;
    }

    public void setEndDuration2(Date endDuration2) {
        this.endDuration2 = endDuration2;
    }

    public Integer getGenderPreference() {
        return genderPreference;
    }

    public void setGenderPreference(Integer genderPreference) {
        this.genderPreference = genderPreference;
    }

    public Integer getRatingPreference() {
        return ratingPreference;
    }

    public void setRatingPreference(Integer ratingPreference) {
        this.ratingPreference = ratingPreference;
    }

    public Integer getCommuteType() {
        return commuteType;
    }

    public void setCommuteType(Integer commuteType) {
        this.commuteType = commuteType;
    }

    public Date getEngageTime() {
        return engageTime;
    }

    public void setEngageTime(Date engageTime) {
        this.engageTime = engageTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCurrentServer() {
        return currentServer;
    }

    public void setCurrentServer(String currentServer) {
        this.currentServer = currentServer == null ? null : currentServer.trim();
    }
}