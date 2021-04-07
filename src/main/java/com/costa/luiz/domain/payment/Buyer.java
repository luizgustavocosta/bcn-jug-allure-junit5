package com.costa.luiz.domain.payment;

import com.costa.luiz.domain.infrastructure.Model;

@Model
public class Buyer {

    private final String name;
    private final String email;

    public Buyer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
