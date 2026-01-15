package com.study.baemin.api.v1.shop;

import com.study.baemin.api.domain.common.dto.PagingDto;
import com.study.baemin.api.domain.common.dto.SearchRequestDTO;
import com.study.baemin.api.domain.shop.dto.ShopDTO;
import com.study.baemin.api.domain.shop.dto.ShopDetailDTO;
import com.study.baemin.api.domain.shop.service.ShopService;
import com.study.baemin.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="Shop API",description = "상점 API")
@RestController
@RequestMapping("/shop")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService _shopService) {
        this.shopService = _shopService;
    }

    @Operation (summary="상점 목록 조회", description="상점 목록을 조회합니다.")
    @GetMapping("/list")
    public ResponseEntity<ApiResponse<PagingDto<ShopDTO>>> getShopList
            (@Valid @ModelAttribute SearchRequestDTO search){

        return ResponseEntity.ok(ApiResponse.ok(shopService.getShopList(search)));
    }

    @Operation (summary="상점 상세 조회", description="상점 상세 정보를 조회합니다.")
    @GetMapping("/detail")
    public ResponseEntity<ApiResponse<ShopDetailDTO>> getShopDetails
            (@Valid @RequestParam("ShopSeq") int ShopSeq){

        return ResponseEntity.ok(ApiResponse.ok(shopService.getShopDetail(ShopSeq)));
    }

}
