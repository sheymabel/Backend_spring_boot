package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.Repository.ClientRepository;
import com.entites.clients;

import java.util.ArrayList;

public class clientServices {
    @Autowired
    private ClientRepository clientRepository;



    public clients getClientById(Long id) {
        return (clients) clientRepository.findById(id).orElse(null);
    }

    public clients saveClient(clients client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public List<clients> getAllClients() {
        try {
            // Fetch all clients from the repository
            return clientRepository.findAll();
        } catch (Exception e) {
            // Handle exception (e.g., log it)
            System.err.println("Error fetching clients: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list or handle the error as needed
        }
    }

}
