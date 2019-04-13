package com.sh.action;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.service.TchargeService;
import com.sh.vo.Tcharge;

@Controller
public class TchargeAction {
	
	@Autowired
	TchargeService tc;
	
    @RequestMapping("charge")
   	public String charge(Integer T1,String D1) {
    	
   	if(D1==null) {
    		D1="A";
    	}
    	Tcharge t = tc.getById(D1);
    	if(T1!=null) {
    		//map.put("map", t.getCharge());
    		tc.charg(T1, t.getId());
    	}  		
   		return "admin/charge";
   	}
    @RequestMapping(value = "url",method = RequestMethod.POST)
    @ResponseBody
    public Integer url(String D1){
    	Tcharge t = tc.getById(D1);
        
        return t.getCharge();
    }
}
