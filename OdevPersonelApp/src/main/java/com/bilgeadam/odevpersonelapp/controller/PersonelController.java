package com.bilgeadam.odevpersonelapp.controller;

import com.bilgeadam.odevpersonelapp.PersonelRepository;
import com.bilgeadam.odevpersonelapp.entity.Personel;
import com.bilgeadam.odevpersonelapp.exception.PersonelNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonelController {

    @Autowired
    private PersonelRepository personelRepository;


    @GetMapping("/{id}")
    public Personel getKisi(@PathVariable("id") Long id) {
        Personel personel = null;
        Optional<Personel> personelDB = personelRepository.findById(id);

        if (personelDB.isPresent()) {
            personel = personelDB.get();
            return personel;
        } else {
            throw new PersonelNotFoundExeption(id + " nolu Personel bulunamadı!");
        }
    }

    public List<Personel> getTumPersonel() {
        return personelRepository.findAll();
    }

    @GetMapping("/personel-bolu-sehir/{id}")

    public String getPersonelBolumSehir(@PathVariable("id") Long id) {
        Personel personel = getKisi(id);

        String bolumAd = getBolumAd(personel.getBolumNo());

        return personel.getAd() + " " + personel.getSoyad() + " " + bolumAd;
    }

    private String getBolumAd(Long id) {
        String bolumURL = "http://localhost8230";

        RestTemplate restTemplate = new RestTemplate();

        String bolumdenGelenMesaj = restTemplate.getForObject(bolumURL + "/bolum/" + id, String.class);

        return bolumURL;
    }
}
