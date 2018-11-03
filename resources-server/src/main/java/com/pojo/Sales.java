package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author：linma
 * @date: 2018/11/3 14:06
 * @email: linma@homeinns.com
 **/
@Data
@Entity
public class Sales {

    @Id
    private String id;

    private String salesName;

    private String saleSex;

    private Integer salesAge;

    private Integer productId;

}
