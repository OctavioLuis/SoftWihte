package com.mx.health.SoftWhite.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.health.SoftWhite.model.entity.Paciente;

public interface IPacienteDao extends CrudRepository<Paciente, Long>{

}
