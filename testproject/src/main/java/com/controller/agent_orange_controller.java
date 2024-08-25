package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.entites.Agant_orange;
import com.Repository.*;

@RestController
@RequestMapping("/agents")
public class agent_orange_controller {

    @Autowired
    private AgantOrangeRepository repository;

    public AgantOrangeRepository getRepository() {
        return repository;
    }

    public void setRepository(AgantOrangeRepository repository) {
        this.repository = repository;
    }

    public agent_orange_controller(AgantOrangeRepository repository) {
        this.repository = repository;
    }

    /**
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Agant_orange>> getAll() {
        try {
            List<Agant_orange> items = repository.findAll();
            if (items.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            // Log the exception here
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    

    @GetMapping("{id}")
    public ResponseEntity<Agant_orange> getById(@PathVariable("id") Long id) {
        Optional<Agant_orange> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Agant_orange> create(@RequestBody Agant_orange item) {
        try {
            Agant_orange savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Agant_orange> update(@PathVariable("id") Long id,
                                              @RequestBody Agant_orange item) {
        Optional<Agant_orange> existingItemOptional = repository.findById(id);  // Use Optional<Agant_orange>
        if (existingItemOptional.isPresent()) {
            Agant_orange existingItem = existingItemOptional.get();
            // Mettre à jour les champs nécessaires
            existingItem.setEmail(item.getEmail());
            existingItem.setPassword(item.getPassword());
            existingItem.setNom(item.getNom());
            existingItem.setPrenom(item.getPrenom());
            existingItem.setNum_telephone(item.getNum_telephone());
            existingItem.setGenre(item.getGenre());
            existingItem.setPoste(item.getPoste());
            existingItem.setBotique(item.getBotique());
            return new ResponseEntity<>(repository.save(existingItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
