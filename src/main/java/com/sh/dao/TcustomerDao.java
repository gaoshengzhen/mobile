package com.sh.dao;

import org.springframework.stereotype.Repository;

import com.sh.vo.Tcustomer;

@Repository
public interface TcustomerDao {
	
	public void insert(Tcustomer t);
    public Tcustomer getById(Tcustomer t);
}
