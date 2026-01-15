package com.study.baemin.api.domain.shop.service;

import com.study.baemin.api.domain.common.dto.PagingDto;
import com.study.baemin.api.domain.common.dto.SearchRequestDTO;
import com.study.baemin.api.domain.shop.dto.ShopDTO;
import com.study.baemin.api.domain.shop.dto.ShopDetailDTO;


public interface ShopService {
    PagingDto<ShopDTO> getShopList(SearchRequestDTO search);
    ShopDetailDTO getShopDetail(int shopSeq);

}
