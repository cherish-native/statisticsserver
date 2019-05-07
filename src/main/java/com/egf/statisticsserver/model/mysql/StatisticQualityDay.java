package com.egf.statisticsserver.model.mysql;

public class StatisticQualityDay {
    private String id;

    private String departCode;

    private String departName;

    private String gatheruserName;

    private String gatheruserId;

    private Integer statisticTime;

    private Integer countLevelA;

    private Integer countLevelB;

    private Integer countLevelC;

    private Integer countLevelD;

    private Integer countLevelE;

    private Integer isCompelPassCount;

    private Integer unCompelPassCount;

    private Integer count;

    private Float scoreAverage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getGatheruserName() {
        return gatheruserName;
    }

    public void setGatheruserName(String gatheruserName) {
        this.gatheruserName = gatheruserName == null ? null : gatheruserName.trim();
    }

    public String getGatheruserId() {
        return gatheruserId;
    }

    public void setGatheruserId(String gatheruserId) {
        this.gatheruserId = gatheruserId == null ? null : gatheruserId.trim();
    }

    public Integer getStatisticTime() {
        return statisticTime;
    }

    public void setStatisticTime(Integer statisticTime) {
        this.statisticTime = statisticTime;
    }

    public Integer getCountLevelA() {
        return countLevelA;
    }

    public void setCountLevelA(Integer countLevelA) {
        this.countLevelA = countLevelA;
    }

    public Integer getCountLevelB() {
        return countLevelB;
    }

    public void setCountLevelB(Integer countLevelB) {
        this.countLevelB = countLevelB;
    }

    public Integer getCountLevelC() {
        return countLevelC;
    }

    public void setCountLevelC(Integer countLevelC) {
        this.countLevelC = countLevelC;
    }

    public Integer getCountLevelD() {
        return countLevelD;
    }

    public void setCountLevelD(Integer countLevelD) {
        this.countLevelD = countLevelD;
    }

    public Integer getCountLevelE() {
        return countLevelE;
    }

    public void setCountLevelE(Integer countLevelE) {
        this.countLevelE = countLevelE;
    }

    public Integer getIsCompelPassCount() {
        return isCompelPassCount;
    }

    public void setIsCompelPassCount(Integer isCompelPassCount) {
        this.isCompelPassCount = isCompelPassCount;
    }

    public Integer getUnCompelPassCount() {
        return unCompelPassCount;
    }

    public void setUnCompelPassCount(Integer unCompelPassCount) {
        this.unCompelPassCount = unCompelPassCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getScoreAverage() {
        return scoreAverage;
    }

    public void setScoreAverage(Float scoreAverage) {
        this.scoreAverage = scoreAverage;
    }
}