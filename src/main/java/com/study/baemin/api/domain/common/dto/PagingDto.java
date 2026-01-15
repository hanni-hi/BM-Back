package com.study.baemin.api.domain.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PagingDto<T> {
private int pageCount;
private int currentPage;
private List<T> data= new ArrayList<>();
private int allCount;



}
