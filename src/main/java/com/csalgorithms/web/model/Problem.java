package com.csalgorithms.web.model;

import javax.persistence.*;

@Entity
@Inheritance
public abstract class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
