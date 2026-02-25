package com.study.baemin.api.domain.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ShopInsertDTO {
    private int ownerSeq;
    private String shopName;
    private String shopAddress1;
    private String shopAddress2;
    private String shopNum;
    private Boolean closeYN;
    private  String createUser;

}