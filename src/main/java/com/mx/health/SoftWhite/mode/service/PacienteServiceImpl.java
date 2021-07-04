package com.mx.health.SoftWhite.mode.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.health.SoftWhite.model.dao.IPacienteDao;
import com.mx.health.SoftWhite.model.entity.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteDao pacienteDao;
	
	@Override
	public List<Paciente> findAll() {
		return (List<Paciente>) pacienteDao.findAll();
	}

}
