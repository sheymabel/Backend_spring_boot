package controllers;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.clients;
import Repository.ClientRepository;

@RestController
@RequestMapping("/clients")
public class clientController<Client> {
    @Autowired
    private ClientRepository clientRepository;

    /**
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return ResponseEntity.ok(clients);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client clients) {
        Client savedClient = clientRepository.save(clients);
        return ResponseEntity.created(URI.create("/clients/" + savedClient.getId())).body(savedClient);
    }
}
