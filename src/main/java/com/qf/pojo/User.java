package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userid;

    private String phone;

    private String wecahat;

    private String username;

    private Integer conuttime;

    private Integer count;

    private Integer vipstate;

    private String viptime;

    @JsonProperty("head")
    private String headurl;


}
