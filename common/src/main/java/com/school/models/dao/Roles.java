package com.school.models.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="roles")
@Setter
@Getter
public class Roles {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    //@OneToMany
    @OneToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Set<Users> users;
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    Users users;

}
