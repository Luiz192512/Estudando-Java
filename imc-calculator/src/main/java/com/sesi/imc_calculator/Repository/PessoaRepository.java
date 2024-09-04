package com.sesi.imc_calculator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.imc_calculator.Model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	

}
