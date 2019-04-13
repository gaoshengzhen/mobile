package com.sh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.sh.vo.Topertor;

@Repository
public interface TopertorDao {
	
	public Topertor login(Topertor t);
	public void add(Topertor t);
	public Topertor getById(int operator_id);
	public Topertor getByName(String operator_name);
	public List<Topertor> getAll();
	public void del(int operator_id);
}
