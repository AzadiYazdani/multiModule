package com.azadi.province.api;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set", toBuilder = true, builderMethodName = "newInstance")
public class ProvinceDto implements Serializable {

    private int parent;

    @ApiModelProperty(value = "نام  استان", dataType = "String", example = "اصفهان")
    private String title;

}
