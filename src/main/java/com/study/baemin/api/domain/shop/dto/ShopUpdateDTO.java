package com.study.baemin.api.domain.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopUpdateDTO {
    private int shopSeq;
    private int ownerSeq;
    private String shopName;
    private String shopAddress1;
    private String shopAddress2;
    private String shopNum;
    private Boolean closeYN;
    private  String createUser;

}