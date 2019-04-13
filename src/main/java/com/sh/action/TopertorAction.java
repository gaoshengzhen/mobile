package com.sh.action;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.service.TopertorService;
import com.sh.vo.Tcharge;
import com.sh.vo.Topertor;

@Controller
public class TopertorAction {
	
	@Autowired
	TopertorService t;
	
    @RequestMapping("/index")
	public String login(Topertor to) {
		
		Topertor user = t.login(to);
		if(user!=null) {
			if(user.getIs_admin()==0)
				return "user/usershow";
			else
				return "admin/adminoption";
		}
		
		return "index";	
	}
    @RequestMapping("/")
    public String lll() {
    	return "index";
    }
    @RequestMapping("newOperator")
    public String newOperator(Topertor to) {
    	    //System.out.println(to);
    	
    		Topertor user = t.add(to);
    		
    			return "admin/newOperator";

    }
    @RequestMapping(value = "id",method = RequestMethod.POST)
    @ResponseBody
    public Integer id(int id){
    	return t.getByid(id);
    }
    @RequestMapping(value = "name",method = RequestMethod.POST)
    @ResponseBody
    public Integer name(String name){
    	return t.getByname(name);
    }
   

    @RequestMapping("Logout")
   	public String Logout() {

   		return "index";
   	}
    
    
    @RequestMapping("saveInfo")
   	public String saveInfo() {

   		return "admin/saveInfo";
   	}
    
    @RequestMapping("modifyOperator")
   	public String modifyOperator(Map<String,Object> map) {

    	List<Topertor> list = t.getAll();
    	map.put("list", list);	
   		return "admin/modifyOperator";
   	}
    
    @RequestMapping(value = "del",method = RequestMethod.POST)
    @ResponseBody
    public String url(int id){
    	
    	t.del(id);
        
        return "/admin/modifyOperator";
    }

}
