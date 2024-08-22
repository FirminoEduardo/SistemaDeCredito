package com.example.sistemacredito.repository;

import com.example.sistemacredito.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
