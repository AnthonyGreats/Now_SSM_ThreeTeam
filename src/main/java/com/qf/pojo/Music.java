package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Music {
    private Integer mid;

    private String mname;

    private String mtitle;

    private String mcontext;

    private String mtime;

    private Integer mtypeid;

    private Integer vipstate;

    private String murl;

    private String mphoto;

    private Integer mcount;


}
