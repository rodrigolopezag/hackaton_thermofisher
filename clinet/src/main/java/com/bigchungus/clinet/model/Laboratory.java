package com.bigchungus.clinet.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Setter @Getter
public class Laboratory {

    @Id @Generated
    private String Id;         /*Primary key*/

    private String name;

    private String state;

    private String city;

    private String street;

    private int intern_num;

    private int acred_num;

    private String bank_acc;

    private String rfc;

    private String mail_petition;

    private String mail_bill;

    @Field("studies")
    private List<Studies> studies;

    public Laboratory() {}

    public Laboratory(String name, String state, String city, String street, int intern_num, int acred_num, String bank_acc, String rfc, String mail_petition, String mail_bill) {
        this.name = name;
        this.state = state;
        this.city = city;
        this.street = street;
        this.intern_num = intern_num;
        this.acred_num = acred_num;
        this.bank_acc = bank_acc;
        this.rfc = rfc;
        this.mail_petition = mail_petition;
        this.mail_bill = mail_bill;
    }

    @Getter @Setter
    public static class Studies {
        @Field("Id")
        private String id;
    }
}
