package com.azadi.province.mapper;


import com.azadi.common.mapper.DtoMapper;
import com.azadi.common.model.Province;
import com.azadi.province.api.ProvinceDto;
import org.mapstruct.Mapper;

import java.util.List;


//@Mapper(componentModel = "spring")
//public interface ProvinceDtoMapper extends DtoMapper<ProvinceDto, Province> {
//
//    @Override
//    ProvinceDto toDto(Province model);
//
//    @Override
//    Province toModel(ProvinceDto dto);
//
//    @Override
//    List <ProvinceDto> toDto(List<Province> modelList);
//
//    @Override
//    List<Province> toModel(List<ProvinceDto> dtoList);
//


@Mapper(componentModel = "spring")
public interface ProvinceDtoMapper {

//    @Override
    ProvinceDto toDto(Province model);

//    @Override
    Province toModel(ProvinceDto dto);

//    @Override
    List <ProvinceDto> toDto(List<Province> modelList);

//    @Override
    List<Province> toModel(List<ProvinceDto> dtoList);

}
