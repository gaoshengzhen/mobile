package com.sh.action;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.service.TmobilesService;
import com.sh.vo.Tcharge;
import com.sh.vo.Tmobiles;


@Controller
public class TmobilesAction {
	@Autowired
	TmobilesService t;
	
	@RequestMapping("resource")
	public String resource(String mobile_number1,String mobile_type) {
	
    	List<Tmobiles> l = new ArrayList<Tmobiles>(10000000);
		if(mobile_number1!=null&&mobile_type!=null) {
			String[] s =mobile_number1.split(",");
			
			BigInteger min=new BigInteger(s[0]);
			BigInteger max=new BigInteger(s[1]);
			BigInteger b = max.subtract(min);
		
			BigInteger x= new BigInteger("1");
			for(int i = 0;i<b.intValue();i++) {
				min = min.add(x);
				//System.out.println(min.toString());
				l.add(new Tmobiles(min.toString(),mobile_type,null,null));
			}
			t.save(l);
			min=null;
			max=null;
			b=null;
		}
		return "admin/resource";
	}
	
	
	
    
}
