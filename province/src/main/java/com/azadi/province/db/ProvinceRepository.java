package com.azadi.province.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceEntity, Integer> {

    List<ProvinceEntity> getAllByParent(Integer id);
}
