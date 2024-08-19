package Repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Entity.clients;

public interface ClientRepository extends JpaRepository<clients, Long> {
    /**
     * @param prefix
     * @return
     */
    List<clients> findByNomStartingWith(String prefix);

    // Trouver tous les clients par leur nom et leur prénom
    Clients findByNomAndPrenom(String nom, String prenom);

    // Compter le nombre de clients par ville
    Long countByVille(String ville);

    // Trouver les 10 premiers clients triés par date de naissance
    List<clients> findTop10ByOrderByDateNaissanceDesc();

    // Méthode personnalisée avec requête JPQL
    @Query("SELECT c FROM Client c WHERE c.age > :age")
    List<Clients> findClientsPlusAgesQue(Integer age);
}
