package com.micheledisograt.mdt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "surname")
    private String surname;
    @Column (name = "username")
    private String username;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private String password;
    @Column (name = "birth_date")
	private Date birthDate;
    @Column (name = "cf")
	private String fiscalCode;
    @Column (name = "address")
	private String address;
    @Column (name = "cap")
	private String cap;
    @Column (name = "city")
	private String city;
    @Column (name = "state")
	private String state;
    @Column (name = "tel_number")
	private String telephoneNumber;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();
}
