package com.study.baemin.api.domain.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ShopDTO {
    private int shopSeq;
    private String shopName;
    private String shopAddress1;
    private String shopAddress2;
    private String shopNum;
}
