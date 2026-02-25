package com.study.baemin.api.domain.shop.repository;

import com.study.baemin.api.domain.common.dto.SearchRequestDTO;
import com.study.baemin.api.domain.shop.dto.ShopDTO;
import com.study.baemin.api.domain.shop.dto.ShopInsertDTO;
import com.study.baemin.api.domain.shop.dto.ShopUpdateDTO;
import com.study.baemin.api.domain.shop.entity.ShopEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
    // 1. 상점 카테고리 리스트
    // 2. 상점 카테고리별 상품 리스트
    // 3. 상점 상품별 옵션정보

    List<ShopDTO> getShopList(SearchRequestDTO search);
    int getShopListCount(SearchRequestDTO search);
    ShopEntity getShopDetail(int shopSeq);
    float getShopStarRate(int shopSeq);

    int insertShopData(ShopInsertDTO shopInsertDTO);
    int updateShopData(ShopUpdateDTO shopUpdateDTO);
    int deleteShopData(int id);
}
