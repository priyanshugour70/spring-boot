package com.gour.priyanshu.runner;

import com.gour.priyanshu.dao.IRoleRepository;
import com.gour.priyanshu.dao.IUserRepository;
import com.gour.priyanshu.entity.Role;
import com.gour.priyanshu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IUserRepository urepo;

	@Autowired
	private IRoleRepository rrepo;

	@Override
	public void run(String... args) throws Exception {

		Role r1 = new Role(503, "ADMIN");
		Role r2 = new Role(504, "GUEST");
		
		rrepo.save(r1);
		rrepo.save(r2);
		
		User u1 = new User(10, "SYED", r1);
		User u2 = new User(11, "SAM",  r2);
		User u3 = new User(12, "RAM",  r1);
		
		urepo.save(u1);
		urepo.save(u2);	
		urepo.save(u3);
		
	}
}
