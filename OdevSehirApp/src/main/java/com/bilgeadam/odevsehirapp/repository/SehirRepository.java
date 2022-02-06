package com.bilgeadam.odevsehirapp.repository;

import com.bilgeadam.odevsehirapp.entity.Sehir;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public interface  odevSehirAppAplication {

    public static void main(String[] args) {
        SpringApplication.run(odevSehirAppAplication.class, args);
    }

    Optional<Sehir> findById(long id);
}