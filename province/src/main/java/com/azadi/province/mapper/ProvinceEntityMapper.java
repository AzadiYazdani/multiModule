package com.azadi.province.mapper;


import com.azadi.common.mapper.EntityMapper;
import com.azadi.common.model.Province;
import com.azadi.province.api.ProvinceDto;
import com.azadi.province.db.ProvinceEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
//public interface ProvinceEntityMapper extends EntityMapper<ProvinceEntity, Province> {
//
//
//    ProvinceEntity toEntity(Province model);
//
//    Province toModel(ProvinceEntity entity);
//
//    List<Province> toModel(List<ProvinceEntity> dtoList);
//
//    List <ProvinceEntity> toEntity(List<Province> modelList);


    public interface ProvinceEntityMapper {


        ProvinceEntity toEntity(Province model);

        Province toModel(ProvinceEntity entity);

        List<Province> toModel(List<ProvinceEntity> dtoList);

        List <ProvinceEntity> toEntity(List<Province> modelList);

    }
