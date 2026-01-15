package com.study.baemin.api.domain.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopDetailDTO {
    private int shopSeq;
    private String shopName;
    private String shopAddress1;
    private String shopAddress2;
    private String shopNum;
    private float shopRate;

    /*
ShopDetailDTO(int _shopSeq,String _shopAddress1, String _shopAddress2, String _shopNum)
{
this.shopSeq=_shopSeq;
this.shopName=_shopSeq;
this.shopAddress1=_shopAddress1;
this.shopAddress2=_shopAddress2;

}
*/


}
