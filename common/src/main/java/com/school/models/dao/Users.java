package com.school.models.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="users")
@Setter
@Getter
@ToString
public class Users {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Email
    @Column(name="emailId")
    private String emailId;
    @Column(name="password")
    private String password;
    @Column(name="rsaPrivateKey")
    private String rsaPrivateKey;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="prefLanguageId")
    private Long prefLanguageId;
    @Column(name="dateOfBirth")
    private LocalDateTime dateOfBirth;
    @Column(name="gender")
    private Long gender;
    @Column(name="skypeUserName")
    private String skypeUserName;
    @Column(name="googleUserName")
    private String googleUserName;
    @Column(name="facebookUserName")
    private String facebookUserName;
    @Column(name="youTubeUserName")
    private String youTubeUserName;
    @Column(name="twitterUserName")
    private String twitterUserName;
    @Column(name="appleUserName")
    private String appleUserName;
    @Column(name="skypeAccountId")
    private String skypeAccountId;
    @Column(name="googleAccountId")
    private String googleAccountId;
    @Column(name="facebookAccountId")
    private String facebookAccountId;
    @Column(name="youTubeAccountId")
    private String youTubeAccountId;
    @Column(name="twitterAccountId")
    private String twitterAccountId;
    @Column(name="appleAccountId")
    private String appleAccountId;
    @Column(name="loginTypeId")
    private String loginTypeId;
    @Column(name="emailIdVerified")
    private Long emailIdVerified;
    @Column(name="phoneVerified")
    private Long phoneVerified;
    @Column(name="muteNotifyIndicator")
    private Long muteNotifyIndicator;
    @Column(name="lastModifiedDate")
    private LocalDateTime lastModifiedDate;
    @Column(name="lastModifiedBy")
    private Long lastModifiedBy;
    @Column(name="softDelInd")
    private Long softDeleteStatus;
// FetchType.EAGER -> will fetch the relation table data too
// FetchType.LAZY -> will NOT fetch the relation table data too
    // CascadeType -> when we delete parent child should be also deleted
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_role_id", referencedColumnName = "id")
    Roles roles;
//    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
//    @JoinColumn(name = "fk_role_id", referencedColumnName = "id")
//    Set<Roles> roles;

    @OneToOne
    @JoinColumn(name = "fk_school_id", referencedColumnName = "id")
    private School school;

    @ManyToMany
    @JoinTable(
            name = "users_address",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    Set<Address> address;
}
