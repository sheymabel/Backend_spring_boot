package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entites.contrat;

@RestController
@RequestMapping("/contrats")
public class contratController {

    @Autowired
    private contratController repository;

    @GetMapping
    public ResponseEntity<List<contrat>> getAll() {
        try {
            List<contrat> items = repository.findAll();

            if (items.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<contrat> getById(@PathVariable("id") Long id) {
        Optional<contrat> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

   
  

    @PostMapping
    public ResponseEntity<contrat> create(@RequestBody contrat item) {
        try {
            contrat savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

  

    @PutMapping("{id}")
    public ResponseEntity<contrat> update(@PathVariable("id") Long id,
                                          @RequestBody contrat item) {
        Optional<contrat> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            contrat existingItem = existingItemOptional.get();
            // Logique de mise à jour spécifique à l'entité
            existingItem.setNome(item.getNome());
            existingItem.setType_de_contrat(item.getType_de_contrat());
            existingItem.setService(item.getService());
            existingItem.setDate_de_debut(item.getDate_de_debut());
            existingItem.setDate_de_fin(item.getDate_de_fin());
            // Ajoutez d'autres champs si nécessaire

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


   
    // Trouver un contrat par son ID
    public Optional<contrat> findById(Long id) {
        return repository.findById(id);
    }

    // Sauvegarder un nouveau contrat ou mettre à jour un contrat existant
    public contrat save(contrat item) {
        return repository.save(item);
    }

    // Supprimer un contrat par son ID
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    // Récupérer tous les contrats
    public List<contrat> findAll() {
        return repository.findAll();
    }
}
