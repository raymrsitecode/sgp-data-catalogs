package com.sgp.catalogs.data.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sgp.catalogs.data.entity.MsiEntity;
import com.sgp.catalogs.data.repository.MsiRepository;


@Repository
public class MsiCatalogImpl  implements IMsiCatalog {

	@Autowired
	private MsiRepository msiRepository;
	
	
	@Override
	public void executeCreateMsiCatalog(MsiEntity msiEntity) {
		
		msiRepository.save(msiEntity);
		
	}


	@Override
	public List<MsiEntity> executeGetMsiCatalog() {
		// TODO Auto-generated method stub
		return (List<MsiEntity>) msiRepository.findAll();
	}

}
