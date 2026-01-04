package com.example.tp13.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tp13.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {}