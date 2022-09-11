package com.sgp.catalogs.data.service;

import java.util.List;

import com.sgp.catalogs.data.entity.MsiEntity;

public interface IMsiService {

	
	public void executeCreateMsiCatalog(MsiEntity msiEntity);
	public List<MsiEntity> executeGetMsiCatalog();
}
