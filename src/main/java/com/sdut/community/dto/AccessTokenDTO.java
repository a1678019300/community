package com.sdut.community.dto;

import lombok.Data;

//当参数多于两个时候，最好创建一个类封装起来
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
