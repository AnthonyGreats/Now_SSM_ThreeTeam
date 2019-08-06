package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Crowd {

    private Integer cid;

    private String cname;

    private String cphoto;

    private Integer mtypeid;


}
