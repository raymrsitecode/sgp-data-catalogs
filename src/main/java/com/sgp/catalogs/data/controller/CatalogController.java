package com.sgp.catalogs.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sgp.catalogs.data.entity.MsiEntity;
import com.sgp.catalogs.data.service.IMsiService;

@RestController
public class CatalogController {

	@Autowired
	private IMsiService msiService;
	
	@PostMapping("/catalog/create")
	public void executeCreateCatalogMsi(@RequestBody MsiEntity msiEntity) {
		msiService.executeCreateMsiCatalog(msiEntity);
	}
	
	
	@GetMapping("/catalog/list")
	public List<MsiEntity> executeGetCatalogMsi(){
		return msiService.executeGetMsiCatalog();	
	}
	
}
