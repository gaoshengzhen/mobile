package com.sh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sh.vo.Tmobiles;

@Repository
public interface TmobilesDao {
	
	public void save(@Param("tmobiles")List<Tmobiles> t);

}
