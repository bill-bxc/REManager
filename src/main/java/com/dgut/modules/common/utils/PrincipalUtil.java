package com.dgut.modules.common.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class PrincipalUtil {
	
	public static String getPrincipal(){
		String userName = null;
		if(SecurityContextHolder.getContext().getAuthentication() != null){
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
			if (principal instanceof UserDetails) {
				userName = ((UserDetails)principal).getUsername();
			} else {
				userName = principal.toString();
			}
		}
		return userName;
	}
}
