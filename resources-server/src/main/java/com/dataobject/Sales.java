package com.dataobject;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author：linma
 * @date: 2018/11/21 14:37
 * @email: linma@homeinns.com
 **/
@Entity
@Data
public class Sales {

    @Id
    @GenericGenerator(name = "id", strategy = "uuid")
    @GeneratedValue(generator = "id")
    private String id;

    private String salesName;

    private Integer salesAge;

    private String salesSex;

    private String productId;
}
