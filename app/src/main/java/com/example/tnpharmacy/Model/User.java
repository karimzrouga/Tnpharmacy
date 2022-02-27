package com.example.tnpharmacy.Model;

public class User {
        private String name ,email , phone , Role , sexe ,password;

    public User(String name, String email, String phone, String role, String sexe, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        Role = role;
        this.sexe = sexe;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", Role='" + Role + '\'' +
                ", sexe='" + sexe + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

