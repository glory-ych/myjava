package com.glory.service.study.exception;

public class CouponTemp {
    private static final long serialVersionUID = 2661909886129547500L;
    private long id;

    private long shopId;

    private String range;

    private String rangeRule;

    private String type;

    private String typeRule;

    private String title;

    private float faceValue;

    private int startTime;

    private int endTime;

    private int maxNum;

    private int createNum;

    private int usedNum;

    private int receiveNum;

    private int status;

    private int isShow;

    private int actType = 123;

    private String link;

    private long mtime;

    private String operaer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public String getRangeRule() {
        return rangeRule;
    }

    public void setRangeRule(String rangeRule) {
        this.rangeRule = rangeRule == null ? null : rangeRule.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeRule() {
        return typeRule;
    }

    public void setTypeRule(String typeRule) {
        this.typeRule = typeRule == null ? null : typeRule.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public float getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(float faceValue) {
        this.faceValue = faceValue;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getCreateNum() {
        return createNum;
    }

    public void setCreateNum(int createNum) {
        this.createNum = createNum;
    }

    public int getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(int usedNum) {
        this.usedNum = usedNum;
    }

    public int getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(int receiveNum) {
        this.receiveNum = receiveNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    public int getActType() {
        return actType;
    }

    public void setActType(int actType) {
        this.actType = actType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public long getMtime() {
        return mtime;
    }

    public void setMtime(long mtime) {
        this.mtime = mtime;
    }

    public String getOperaer() {
        return operaer;
    }

    public void setOperaer(String operaer) {
        this.operaer = operaer;
    }
}