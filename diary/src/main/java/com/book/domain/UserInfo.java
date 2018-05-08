package com.book.domain;

import net.sf.json.JSONArray;

import java.io.Serializable;

/**
 * @Author aihui075
 * @Date 2018/4/3.
 * @Description
 */
public class UserInfo implements Serializable {
    private Integer id;
    private String openid;
    private String nickname;
    private String sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private JSONArray privilege;
    private String unionid;
    private String loverName;
    private String createTime;
    private String state;
    private String loverId;
    private String loverTime;

    public UserInfo() {
    }

    public UserInfo(Integer id) {
        this.id = id;
    }

    public String getLoverTime() {
        return loverTime;
    }

    public void setLoverTime(String loverTime) {
        this.loverTime = loverTime;
    }

    public String getLoverId() {
        return loverId;
    }

    public void setLoverId(String loverId) {
        this.loverId = loverId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public JSONArray getPrivilege() {
        return privilege;
    }

    public void setPrivilege(JSONArray privilege) {
        this.privilege = privilege;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLoverName() {
        return loverName;
    }

    public void setLoverName(String loverName) {
        this.loverName = loverName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", privilege=" + privilege +
                ", unionid='" + unionid + '\'' +
                ", loverName='" + loverName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", state='" + state + '\'' +
                ", loverId='" + loverId + '\'' +
                ", loverTime='" + loverTime + '\'' +
                '}';
    }
}
