package com.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entites.Agant_orange ;
  public interface AgantOrangeRepository  extends JpaRepository <Agant_orange , Integer>{
    List<Agant_orange> findByName(String name);

    // Find agents by status
    List<Agant_orange> findByStatus(String status);

    // Custom query using JPQL
    @Query("SELECT a FROM Agant_orange a WHERE a.name LIKE %:name%")
    List<Agant_orange> searchByName(@Param("name") String name);

    void deleteById(Long id);

    public Optional<Agant_orange> findById(Long id);

}
