package com.sh.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sh.vo.Tcharge;

@Repository
public interface TchargeDao {
	
	
	public Tcharge getById(@Param("charge_code")String charge_code);

	public void update(@Param("charge")int charge,@Param("id")int id);
}
