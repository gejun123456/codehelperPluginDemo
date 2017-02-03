package com.codehelper.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bruce.ge on 2017/2/3.
 */
public class Article {

    private Integer id;

    private String content;

    private Long length;

    private Date createTime;

    private Date updateTime;


    private Boolean hasMore;

    private BigDecimal priority;

}
