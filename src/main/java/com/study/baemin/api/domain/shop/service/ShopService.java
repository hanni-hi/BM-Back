package com.study.baemin.api.domain.shop.service;

import com.study.baemin.api.domain.common.dto.PagingDto;
import com.study.baemin.api.domain.common.dto.SearchRequestDTO;
import com.study.baemin.api.domain.shop.dto.ShopDTO;
import com.study.baemin.api.domain.shop.dto.ShopDetailDTO;
import com.study.baemin.api.domain.shop.dto.ShopInsertDTO;
import com.study.baemin.api.domain.shop.dto.ShopUpdateDTO;


public interface ShopService {
    PagingDto<ShopDTO> getShopList(SearchRequestDTO search);
    ShopDetailDTO getShopDetail(int shopSeq);

    //등록
    String insertShopData(ShopInsertDTO shopInsertDTO);

    //업데이트
    String updateShopData(int id, ShopUpdateDTO shopUpdateDTO);

    //삭제
    String deleteShopData(int id);
}
