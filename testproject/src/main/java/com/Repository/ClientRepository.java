package com.Repository;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.entites.clients;
import com.google.gwt.thirdparty.guava.common.primitives.Longs;

public interface ClientRepository extends JpaRepository<clients, Longs> {

    Optional findById(Long id);

    public void deleteById(Long id);
}
   