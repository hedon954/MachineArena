package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hedon
 * @since 2020-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tbl_algorithm_description")
@ApiModel(value="AlgorithmDescription对象", description="")
public class AlgorithmDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "algorithm_description_id", type = IdType.AUTO)
    private Integer algorithmDescriptionId;

    private String algorithmDescriptionContent;


}
