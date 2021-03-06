package com.elcentr.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@ToString(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
@Entity
public class Customer extends BaseEntity {

    private String name;
    private String notes;

    public Customer(Integer id, String name, String notes) {
        super.setId(id);
        this.name = name;
        this.notes = notes;
    }
}
