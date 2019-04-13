package mobile;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.dao.TopertorDao;
import com.sh.service.TchargeService;
import com.sh.service.TcustomerService;
import com.sh.service.TmobilesService;
import com.sh.service.TopertorService;
import com.sh.vo.Tcustomer;
import com.sh.vo.Tmobiles;
import com.sh.vo.Topertor;

public class Test {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	@org.junit.Test
	public void test() {
		//TopertorDao dao = context.getBean(TopertorDao.class);
		TcustomerService dao = context.getBean(TcustomerService.class);
//		Topertor t= new Topertor();
//		t.setOperator_name("gao");
//		t.setOperator_pwd("1234567");
//		t.setOperator_id(255);
//		t.setIs_admin(0);
//		dao.add(t);
		
//		System.out.println(dao.getAll());
		
//		TchargeService t = context.getBean(TchargeService.class);
//		System.out.println(t.getById("C"));
//		t.charg(30, 3);
		
//		List<Tmobiles> l = new ArrayList<Tmobiles>();
//		//Tmobiles t = new Tmobiles();
//		BigInteger l1 = new BigInteger("17371372323");
//		//t.setMobile_number(l1);
//		t.setMobile_type("SIM");
//		//l.add(t);
//		l.add(t);
//		l.add(t);
//		dao.save(l);

		
		Tcustomer t = new Tcustomer();
		//t.setCustomer_birthday("1998/11/11");
		t.setId_number("612525222666662222");
		t.setId_type("居民身份证");
		System.out.println(dao.add(t));
		//System.out.println(dao.add(t));
	}
}
