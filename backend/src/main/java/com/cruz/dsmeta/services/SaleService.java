package com.cruz.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruz.dsmeta.domain.Sale;
import com.cruz.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales(){
		
		return repository.findAll();
	}
}