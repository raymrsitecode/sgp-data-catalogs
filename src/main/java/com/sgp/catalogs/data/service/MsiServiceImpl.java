package com.sgp.catalogs.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgp.catalogs.data.dao.IMsiCatalog;
import com.sgp.catalogs.data.entity.MsiEntity;

@Service
public class MsiServiceImpl implements IMsiService {

	@Autowired
	private IMsiCatalog msiCatalog;
	
	@Override
	public void executeCreateMsiCatalog(MsiEntity msiEntity) {	
		msiCatalog.executeCreateMsiCatalog(msiEntity);
	}

	@Override
	public List<MsiEntity> executeGetMsiCatalog() {
		// TODO Auto-generated method stub
		return msiCatalog.executeGetMsiCatalog();
	}

}
