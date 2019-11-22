package com.rentme.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_login")
public class UserLoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_signed_on")
    private Date lastSignOn;


    @Column(name = "created_at")
    private Date createdAt;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private UserSignupEntity user;


    public UserLoginEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastSignOn() {
        return lastSignOn;
    }

    public void setLastSignOn(Date lastSignOn) {
        this.lastSignOn = lastSignOn;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCeatedAt(Date ceatedAt) {
        this.createdAt = ceatedAt;
    }

    public UserSignupEntity getUser() {
        return user;
    }

    public void setUser(UserSignupEntity user) {
        this.user = user;
    }
}
