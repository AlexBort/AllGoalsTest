package com.example.s.allgoalstest.api;

import com.example.s.allgoalstest.pojo.League;

import java.util.List;

public class DataResponse {

    // in that example it is doing little bit another (class ContactList)

    List<League> response;

    public DataResponse() {
    }

    public List<League> getResponse() {
        return response;
    }

    public void setResponse(List<League> response) {
        this.response = response;
    }

}
