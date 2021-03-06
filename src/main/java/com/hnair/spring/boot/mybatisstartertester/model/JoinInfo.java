package com.hnair.spring.boot.mybatisstartertester.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * JoinInfo Entity.
 */
@Data
public class JoinInfo implements Serializable {

    //列信息
    private Integer id;

    private Integer cid;

    private Integer aid;

    private Integer isLeader;

    private LocalDateTime joinDate;

    private String joinComment;

    private String payMethod;

    private Integer prepay;

    private Integer discount;

    private Integer busSeat;

    private Integer tableSeat;

    private LocalDateTime lastModifyTime;

    private Integer roomId;

}

