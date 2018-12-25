package com.xsl.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1089575882721404817L;

    private Long systemId;

    private String userName;

    private Integer age;

    private String email;

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
