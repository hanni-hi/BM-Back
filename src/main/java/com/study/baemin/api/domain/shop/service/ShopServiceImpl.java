package com.study.baemin.api.domain.shop.service;

import com.study.baemin.api.domain.common.dto.PagingDto;
import com.study.baemin.api.domain.common.dto.SearchRequestDTO;
import com.study.baemin.api.domain.shop.dto.ShopDTO;
import com.study.baemin.api.domain.shop.dto.ShopDetailDTO;
import com.study.baemin.api.domain.shop.dto.ShopInsertDTO;
import com.study.baemin.api.domain.shop.dto.ShopUpdateDTO;
import com.study.baemin.api.domain.shop.entity.ShopEntity;
import com.study.baemin.api.domain.shop.repository.ShopMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService{

    private final ShopMapper shopMapper;

    public ShopServiceImpl(ShopMapper _shopMapper){
        this.shopMapper=_shopMapper;

    }

    @Override
    public PagingDto<ShopDTO> getShopList(SearchRequestDTO search) {
        PagingDto<ShopDTO> res=new PagingDto<>();
        res.setData(shopMapper.getShopList(search));
        res.setAllCount(shopMapper.getShopListCount(search));
        return res;
    }

    @Override
    public ShopDetailDTO getShopDetail(int shopSeq) {

        float _rate=3.5F;
        ShopDetailDTO shopDetailDTO=new ShopDetailDTO();
        ShopEntity shopEntity=shopMapper.getShopDetail(shopSeq);

        BeanUtils.copyProperties(shopEntity, shopDetailDTO);

        shopDetailDTO.setShopRate(shopMapper.getShopStarRate(shopSeq));

        return shopDetailDTO;
    }

    @Override
    public String insertShopData(ShopInsertDTO shopInsertDTO) {
int result=shopMapper.insertShopData(shopInsertDTO);

        return result > 0? "성공" : "실패";
    }

    @Override
    public String updateShopData(int id, ShopUpdateDTO shopUpdatetDTO) {
        shopUpdatetDTO.setShopSeq(id);
        int result=shopMapper.updateShopData(shopUpdatetDTO);
        return result > 0? "성공" : "실패";
    }

    @Override
    public String deleteShopData(int id) {
        int result=shopMapper.deleteShopData(id);
        return result > 0? "성공" : "실패";
    }
}
