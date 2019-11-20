package com.rentme.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_login")
public class UserLogin {


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
    private Date ceatedAt;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public UserLogin() {
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


    public Date getCeatedAt() {
        return ceatedAt;
    }

    public void setCeatedAt(Date ceatedAt) {
        this.ceatedAt = ceatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
