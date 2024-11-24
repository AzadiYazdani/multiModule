package com.azadi.common.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Contract for a generic dto to entity mapper.
 *
 * @param <D> - DTO type parameter.
 * @param <M> - Model type parameter.
 */

//@Component

public interface DtoMapper<D, M> {

    M toModel(D dto);

    D toDto(M model);

    List <M> toModel(List<D> dtoList);

    List <D> toDto(List<M> modelList);
}
