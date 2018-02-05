package com.example.licence.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.licence.models.License;
import com.example.licence.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository){
		this.licenseRepository = licenseRepository;
	}

	public String genLicense(){
		return String.format("%06d",this.all().size()+1);
	}
	
	public ArrayList<License> all(){
		return (ArrayList<License>) licenseRepository.findAll();
	}
	
	public License findByIndex(long id){
		return licenseRepository.findOne(id);
	}
	
	public void create(License license){
		license.setNumber(this.genLicense());
		licenseRepository.save(license);
	}
	public void update(License license){licenseRepository.save(license);}
	public void destroy(long id){licenseRepository.delete(id);}
}