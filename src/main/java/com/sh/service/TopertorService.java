package com.sh.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.TopertorDao;
import com.sh.vo.Topertor;

@Service
public class TopertorService {
	
	@Autowired
	TopertorDao d;
	
	
	public Topertor login(Topertor to) {
		
		return d.login(to);
	}
	@Transactional
	public Topertor add(Topertor to) {
		int id = to.getOperator_id();
		if(d.getById(id)==null&&d.getByName(to.getOperator_name())==null) {
			d.add(to);
			return to;
		}else {
			return null;
		}
	}
	
	public Integer getByid(int id) {
		if(d.getById(id)!=null) {
			return 1;
		}
		return 0;
	}
	public Integer getByname(String name) {
		if(d.getByName(name)!=null) {
			return 1;
		}
		return 0;
	}
	public List<Topertor> getAll(){
		return d.getAll();
	}
	
	public void del(int id) {
		d.del(id);
	}

}
