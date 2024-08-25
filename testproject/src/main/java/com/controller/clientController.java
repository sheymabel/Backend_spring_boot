package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entites.clients;
import com.services.clientServices;

@RestController
@RequestMapping("clients")
public class clientController {

    @Autowired
    private clientServices clientService;

   
    @GetMapping
    public List<clients> getAllClients() {
        return (List<clients>) clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getClientById(@PathVariable Long id) {
        Object client = clientService.getClientById(id);
        return client != null ? ResponseEntity.ok(client) : ResponseEntity.notFound().build();
    }

    /**
     * @param client
     * @return
     */
    @PostMapping
    public clients createClient(@RequestBody clients client) {
        return (clients) clientService.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}

// Similar controllers for AgantOrange and Contrat
