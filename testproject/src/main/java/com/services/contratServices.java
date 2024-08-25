package com.services;

import java.util.ArrayList;
import java.util.List;

import com.entites.contrat;
public class contratServices {
    private List<contrat> contacts;

    // Constructor
    public contratServices() {
        this.contacts = new ArrayList<>();
    }

    public List<contrat> getContacts() {
        return contacts;
    }

    public void setContacts(final List<contrat> contacts) {
        this.contacts = contacts;
    }

    // Add a contact
    public void addContact(final contrat contact) {
        contacts.add(contact);
    }

 
    public boolean removeContact(final Long id) {
        return contacts.removeIf(contact -> contact.getId() == id);
    }
    
    public contrat findContactById(final Long id) {
        return contacts.stream()
            .filter(contact -> contact.getId() == id)
            .findFirst()
            .orElse(null);
    }
    
    
    // Get all contacts
    public List<contrat> getAllContacts() {
        return new ArrayList<>(contacts);
    }
    // Update contact details
    /**
     * @param id
     * @param name
     * @param email
     * @return
     */
    public boolean updateContact(final Long id, final String name, final String setType_de_contrat) {
        contrat contact = findContactById(id);
        if (contact != null) {
            contact.setNome(name);
            contact.setType_de_contrat(setType_de_contrat);
            return true;
        }
        return false;
    }

  

  
    
}
