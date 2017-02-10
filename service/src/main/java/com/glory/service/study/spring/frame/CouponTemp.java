package com.glory.service.study.spring.frame;

import java.io.Serializable;

/**
 * Created by yangch on 2016/11/7 0007.
 */
public class CouponTemp implements Serializable {
    private long id;
    private long shopId;
    private String range;
    private String rangeRule;
    private String type;
    private String typeRule;
    private String title;
    private float faceValue;
    private long startTime;
    private long endTime;
    private long maxNum;
    private long createNum;
    private long usedNum;
    private long receiveNum;
    private int status;
    private int isShow;
    private int actType;
    private String link;

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
        this.range = range;
    }

    public String getRangeRule() {
        return rangeRule;
    }

    public void setRangeRule(String rangeRule) {
        this.rangeRule = rangeRule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeRule() {
        return typeRule;
    }

    public void setTypeRule(String typeRule) {
        this.typeRule = typeRule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(float faceValue) {
        this.faceValue = faceValue;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(long maxNum) {
        this.maxNum = maxNum;
    }

    public long getCreateNum() {
        return createNum;
    }

    public void setCreateNum(long createNum) {
        this.createNum = createNum;
    }

    public long getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(long usedNum) {
        this.usedNum = usedNum;
    }

    public long getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(long receiveNum) {
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
        this.link = link;
    }
}
