package ru.accounting_point.task.savinov.entities;

import java.math.BigInteger;


public class ObjRow {

    private BigInteger id;

    private String uid;

    private Integer object_type;

    private JsonData jsonData;

    private BigInteger parent_object_id;

    private Integer level;

    private String path;

    public ObjRow() {
    }

    public ObjRow(BigInteger id, String uid, Integer object_type, JsonData jsonData, BigInteger parent_object_id, Integer level, String path) {
        this.id = id;
        this.uid = uid;
        this.object_type = object_type;
        this.jsonData = jsonData;
        this.parent_object_id = parent_object_id;
        this.level = level;
        this.path = path;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getObject_type() {
        return object_type;
    }

    public void setObject_type(Integer object_type) {
        this.object_type = object_type;
    }

    public JsonData getJsonData() {
        return jsonData;
    }

    public void setJsonData(JsonData jsonData) {
        this.jsonData = jsonData;
    }

    public BigInteger getParent_object_id() {
        return parent_object_id;
    }

    public void setParent_object_id(BigInteger parent_object_id) {
        this.parent_object_id = parent_object_id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ObjRow{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", object_type=" + object_type +
                ", jsonData=" + jsonData +
                ", parent_object_id=" + parent_object_id +
                ", level=" + level +
                ", path='" + path + '\'' +
                '}';
    }
}
