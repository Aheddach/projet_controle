package com.ensa.catalogue_mvc.repository;

import com.ensa.catalogue_mvc.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {}