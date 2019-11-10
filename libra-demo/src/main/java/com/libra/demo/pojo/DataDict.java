package com.libra.demo.pojo;

import javax.persistence.*;

@Table(name = "data_dict")
public class DataDict {
    @Id
    private Integer id;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "type_code")
    private String typeCode;

    private String ddkey;

    private String ddvalue;

    private Boolean status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return type_code
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * @param typeCode
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * @return ddkey
     */
    public String getDdkey() {
        return ddkey;
    }

    /**
     * @param ddkey
     */
    public void setDdkey(String ddkey) {
        this.ddkey = ddkey;
    }

    /**
     * @return ddvalue
     */
    public String getDdvalue() {
        return ddvalue;
    }

    /**
     * @param ddvalue
     */
    public void setDdvalue(String ddvalue) {
        this.ddvalue = ddvalue;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}