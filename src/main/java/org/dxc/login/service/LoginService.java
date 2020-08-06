package org.dxc.login.service;

import org.dxc.login.model.LoginBean;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	

	public boolean validateLogin(LoginBean loginBean) {
		
		// TODO Auto-generated method stub
		if(loginBean.getUsername().equals(loginBean.getPassword()))
			return true;
			else
				return false;
	}

}
