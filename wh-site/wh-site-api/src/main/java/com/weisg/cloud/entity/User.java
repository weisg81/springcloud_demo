package com.weisg.cloud.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author weisangeng
 * @since 2019-01-05
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    private String name;

    private BigDecimal money;

    private Date createDate;

    private Date modifyDate;

    private Integer isDeleted;

    private Integer age;



}
