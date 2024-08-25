package com.Repository;

import org.hibernate.type.EntityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;

@Repository
public interface contratRepositoryy extends JpaRepository<Entity, EntityType> {
}
