package com.sh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.TmobilesDao;
import com.sh.vo.Tmobiles;

@Service
public class TmobilesService {
	@Autowired
	TmobilesDao dao;
	@Transactional
	public void save(List<Tmobiles> l) {
		dao.save(l);
	}

}
