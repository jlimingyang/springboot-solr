package com.item1024.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 阳十三
 * @email wdful165177@gmail.com
 * @blog http://www.item1024.com
 * @date 2017/9/22
 */

/*     "response":{"numFound":12,"start":0,"docs":[
      {
        "commod_nutrient":"蛋白质，脂肪，葡萄糖，叶酸等",
        "commod_todo":"果穗长圆锥形，松紧适度，极美观。果皮较薄，果肉脆，肉质感强，具有较浓郁的玫瑰香味，品质极上等，叶片厚，茸毛密，抗病性强，特别是抗褐斑病、黑痘病和霜霉病的能力强于红巴拉多。",
        "id":"50",
        "commod_addr":"中国中江",
        "commod_key":"黑巴拉多，葡萄",
        "commod_storageMode":"0摄氏度以上存储",
        "commod_sweetness":"5",
        "commod_name":"黑巴拉多",
        "commod_typeid":"34",
        "commod_rule":"1.8Kg",
        "_version_":1579249990548586496},
      */
@SolrDocument(solrCoreName="anh_core")
public class CommodInfo {
    @Field("id")
    private String id;// 唯一主键

    @Field("commod_nutrient")
    private String commod_nutrient;

    @Field("commod_todo")
    private String commod_todo;

    @Field("commod_addr")
    private String commod_addr;

    @Field("commod_key")
    private String commod_key;

    @Field("commod_storageMode")
    private String commod_storageMode;

    @Field("commod_sweetness")
    private String commod_sweetness;

    @Field("commod_name")
    private String commod_name;

    @Field("commod_typeid")
    private String commod_typeid;


    @Field("commod_rule")
    private String commod_rule;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommod_nutrient() {
        return commod_nutrient;
    }

    public void setCommod_nutrient(String commod_nutrient) {
        this.commod_nutrient = commod_nutrient;
    }

    public String getCommod_todo() {
        return commod_todo;
    }

    public void setCommod_todo(String commod_todo) {
        this.commod_todo = commod_todo;
    }

    public String getCommod_addr() {
        return commod_addr;
    }

    public void setCommod_addr(String commod_addr) {
        this.commod_addr = commod_addr;
    }

    public String getCommod_key() {
        return commod_key;
    }

    public void setCommod_key(String commod_key) {
        this.commod_key = commod_key;
    }

    public String getCommod_storageMode() {
        return commod_storageMode;
    }

    public void setCommod_storageMode(String commod_storageMode) {
        this.commod_storageMode = commod_storageMode;
    }

    public String getCommod_sweetness() {
        return commod_sweetness;
    }

    public void setCommod_sweetness(String commod_sweetness) {
        this.commod_sweetness = commod_sweetness;
    }

    public String getCommod_name() {
        return commod_name;
    }

    public void setCommod_name(String commod_name) {
        this.commod_name = commod_name;
    }

    public String getCommod_typeid() {
        return commod_typeid;
    }

    public void setCommod_typeid(String commod_typeid) {
        this.commod_typeid = commod_typeid;
    }

    public String getCommod_rule() {
        return commod_rule;
    }

    public void setCommod_rule(String commod_rule) {
        this.commod_rule = commod_rule;
    }

    @Override
    public String toString() {
        return "结果：{" +
                "id='" + id + '\'' +
                ", commod_nutrient='" + commod_nutrient + '\'' +
                ", commod_todo='" + commod_todo + '\'' +
                ", commod_addr='" + commod_addr + '\'' +
                ", commod_key='" + commod_key + '\'' +
                ", commod_storageMode='" + commod_storageMode + '\'' +
                ", commod_sweetness='" + commod_sweetness + '\'' +
                ", commod_name='" + commod_name + '\'' +
                ", commod_typeid='" + commod_typeid + '\'' +
                ", commod_rule='" + commod_rule + '\'' +
                '}';
    }
    //    @Field("create_time")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08")
//    private Date createTime;// 创建时间
}
