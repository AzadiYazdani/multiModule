package com.azadi.common.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Contract for a generic dto to entity mapper.
 *
 * @param <E> - Entity type parameter.
 * @param <M> - Model type parameter.
 */

//@Component
public interface EntityMapper<E, M> {

    E toEntity(M model);

    M toModel(E entity);

    List <M> toModel(List<E> dtoList);

    List <E> toEntity(List<M> modelList);
}
