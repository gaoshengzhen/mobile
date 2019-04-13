package com.sh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.TcustomerDao;
import com.sh.vo.Tcustomer;

@Service
public class TcustomerService {
	
	@Autowired
	TcustomerDao dao;
	
	@Transactional
	public Tcustomer add(Tcustomer t) {
		if(dao.getById(t)!=null) {
			return dao.getById(t);
		}else {
			return null;
		}
	}
	@Transactional
	public int getid(Tcustomer t) {
		Tcustomer t1 = dao.getById(t);
		return t1.getCustomer_id();
	}
	@Transactional
	public void insert(Tcustomer t) {
		dao.insert(t);
	}


}
