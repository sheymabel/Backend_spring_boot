package com.services;
import java.util.ArrayList;
import java.util.List;

import com.entites.clients;
public class agant_orange_clients {
  // List to store clients
  private List<clients> clientes;

  // Constructor
  public agant_orange_clients() {
      this.clientes = new ArrayList<>();
  }

  // Add a client
  public void addClient(clients client) {
    clients.add(client);
  }

  // Remove a client
  public void removeClient(clients client) {
      clients.remove(client);
  }

  // Get all clients
  public List<clients> getAllClients() {
      return new ArrayList<>(clientes);
  }

  // Find a client by ID
  /**
 * @param id
 * @return
 */
@SuppressWarnings("unlikely-arg-type")
public clients findClientById(Long id) {
    if (id == null) {
        return null; // or handle the null case as needed
    }
    for (clients client : clientes) {
        if (id.equals(client.getId())) {
            return client;
        }
    }
    return null; // or throw an exception if preferred
}
public void setClientes(List<clients> clientes) {
    this.clientes = clientes;
}
}
