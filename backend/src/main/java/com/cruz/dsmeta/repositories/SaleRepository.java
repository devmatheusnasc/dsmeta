package com.cruz.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cruz.dsmeta.domain.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
