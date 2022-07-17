package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service /* Anotation pra registrar o SaleService como um componente do sistema */
public class SaleService {
	
	@Autowired /*Anotation que faz uma notação automática */
	private SaleRepository repository;
	
	public List <Sale> findSales() {
		return repository.findAll();
	}

}
