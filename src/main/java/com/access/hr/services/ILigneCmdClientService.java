package com.access.hr.services;

import java.util.List;

import com.access.hr.entities.LigneCmdClient;

public interface ILigneCmdClientService {

	public LigneCmdClient save(LigneCmdClient entity);

	public LigneCmdClient update(LigneCmdClient entity);

	public List<LigneCmdClient> selectAll();

	public List<LigneCmdClient> selectAll(String sortField, String sort);

	public LigneCmdClient getById(Long id);

	public void remove(Long id);

	public LigneCmdClient findOne(String paramName, Object paramValue);

	public LigneCmdClient findOne(String[] paramNames, Object[] paramValue);

	public int findCountBy(String paramName, Object paramValue);
}
