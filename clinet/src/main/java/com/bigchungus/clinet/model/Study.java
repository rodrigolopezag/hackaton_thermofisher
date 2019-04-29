package com.bigchungus.clinet.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
public class Study {

    @Id @Generated
    private String _id;         /*Primary key*/

    private String name;

    private int days;

    private int price;

    public Study() {}

    public Study(String name, int days, int price) {
        this.name = name;
        this.days = days;
        this.price = price;
    }
}
