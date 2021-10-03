package com.eommerce.ecommercespringreact.domain;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="users",schema = "public")
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", initialValue = 4, allocationSize = 1)
    @Column(name="id")
    private Long id;

    @Column(name="email")
    private String email;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="city")
    private String city;
    @Column(name="address")
    private String address;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="post_index")
    private String postIndex;
    @Column(name="activation_code")
    private String activationCode;
    @Column(name="password_reset_code")
    private String passwordResetCode;
    @Column(name="active")
    private boolean active;

    @Enumerated(EnumType.STRING)
    @Column(name="provider")
    private AuthProvider provider;

    @ElementCollection(targetClass = Role.class,fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    private Set<Role> roles;

}
