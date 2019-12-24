package com.lucene.demo.Bean;


import org.apache.lucene.document.Document;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

/**
 * Created by ozc on 2017/7/12.
 */
public class User {

    private String id ;
    private String userName;
    private String sal;

    public User() {

    }
    public User(String id, String userName, String sal) {
        this.id = id;
        this.userName = userName;
        this.sal = sal;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }
}
