package com.study.baemin.api.domain.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SearchRequestDTO {
    private int pageSize;
    private int searchPage;
    private String searchText;

}
