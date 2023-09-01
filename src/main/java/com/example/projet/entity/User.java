package com.example.projet.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String photo;
    private String userName;
    private String email;
    private String prenom;
    private String Password;

    public User() {
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Recette> recettes = new ArrayList<>();

    public User(Integer id, String photo, String userName, String email, String prénom, String password, List<Recette> recettes) {
        this.id = id;
        this.photo = photo;
        this.userName = userName;
        this.email = email;
        this.prenom = prenom;
        Password = password;
        this.recettes = recettes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrénom() {
        return prenom;
    }

    public void setPrénom(String prénom) {
        this.prenom = prénom;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public List<Recette> getRecettes() {
        return recettes;
    }

    public void setRecettes(List<Recette> recettes) {
        this.recettes = recettes;
    }


}
