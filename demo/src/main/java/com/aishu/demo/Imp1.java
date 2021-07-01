package com.aishu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Imp1 implements AppImp {
	@Autowired
	private Phone phone;
	
   
	public Phone getPhone() {
		return phone;
	}


	public void setPhone(Phone phone) {
		this.phone = phone;
	}


	public void method()
    {
    	System.out.println("Poofy "+ phone);
    }
	
}
