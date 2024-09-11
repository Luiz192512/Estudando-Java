package com.sesi.Atas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.Atas.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

