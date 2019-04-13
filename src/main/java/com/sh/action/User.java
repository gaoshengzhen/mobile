package com.sh.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sh.service.TcustomerService;
import com.sh.vo.Tcustomer;

@Controller
public class User {
	@Autowired
	TcustomerService s;
	
	@RequestMapping("usershow")
	public String usershow() {
		return "user/usershow";
	}
	@RequestMapping("user_charge")
	public String charge() {
		return "user/charge";
	}
	@RequestMapping("user_newCustomer")
	public String customer(Tcustomer l) {
		return "user/newCustomer";
	}
	@RequestMapping("user_saveInfo")
	public String save(Tcustomer l) {
		return "user/saveInfo";
	}
	@RequestMapping("user_newCustomer2")
	public String customer2(Tcustomer l,Map<String,Object> map) {
		if(s.add(l)!=null) {
    		map.put("m", s.add(l));
    	}else
    		map.put("m", l);
    	System.out.println(s.add(l));
		return "user/newCustomer2";
	}
	@RequestMapping("user_newUser")
	public String newUser(Tcustomer l,Map<String,Object> map) {
		if(s.add(l)==null) {
    		s.insert(l);
    	}
    	map.put("userid", s.getid(l));
		return "user/newUser";
	}

}
