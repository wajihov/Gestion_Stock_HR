package com.access.hr.services;

import java.util.List;

import com.access.hr.entities.Categorie;

public interface ICategorieService {
	
	public Categorie save(Categorie entity);

	public Categorie update(Categorie entity);

	public List<Categorie> selectAll();

	public List<Categorie> selectAll(String sortField, String sort);

	public Categorie getById(Long id);

	public void remove(Long id);

	public Categorie findOne(String paramName, Object paramValue);

	public Categorie findOne(String[] paramNames, Object[] paramValue);

	public int findCountBy(String paramName, Object paramValue);

}