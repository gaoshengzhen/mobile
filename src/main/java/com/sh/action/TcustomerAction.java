package com.sh.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.service.TcustomerService;
import com.sh.vo.ListTmobiles;
import com.sh.vo.Tcustomer;

@Controller
public class TcustomerAction {
	@Autowired
	TcustomerService s;
	
	 @RequestMapping("newCustomer")
	   	public String newCustomer(Tcustomer l) {
          //System.out.println(l);
	   		return "admin/newCustomer";
	   	}
	    @RequestMapping("newCustomer2")
	   	public String newCustomer2(Tcustomer l,Map<String,Object> map) {
	    	if(s.add(l)!=null) {
	    		map.put("m", s.add(l));
	    	}else
	    		map.put("m", l);
	    	System.out.println(s.add(l));
	   		return "admin/newCustomer2";
	   	}
	    @RequestMapping("newUser")
	   	public String newUser(Tcustomer l,Map<String,Object> map) {

	    	
	    	if(s.add(l)==null) {
	    		s.insert(l);
	    	}
	    	map.put("userid", s.getid(l));
	    	System.out.println(l);
	   		return "admin/newUser";
	   	}
}
