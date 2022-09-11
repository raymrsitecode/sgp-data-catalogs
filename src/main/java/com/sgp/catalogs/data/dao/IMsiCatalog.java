package com.sgp.catalogs.data.dao;

import java.util.List;

import com.sgp.catalogs.data.entity.MsiEntity;

public interface IMsiCatalog {

	public void executeCreateMsiCatalog(MsiEntity msiEntity);
	public List<MsiEntity> executeGetMsiCatalog();
}
