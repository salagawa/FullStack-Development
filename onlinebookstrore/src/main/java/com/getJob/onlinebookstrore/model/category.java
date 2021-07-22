package com.getJob.onlinebookstrore.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Table(name = "category")
@Entity
@Data
public class category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="ctg")
    private Set<book> bk;
}
