package com.sh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.TchargeDao;
import com.sh.vo.Tcharge;

@Service
public class TchargeService {

	@Autowired
	TchargeDao dao;
	
	public Tcharge getById(String charge_code) {
		return  dao.getById(charge_code);	
	}
	@Transactional
	public void charg(int charge,int id) {
		dao.update(charge, id);
	}
	
	
}
