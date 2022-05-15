package com.springudemy.springstart.componant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponantDao {
	@Autowired
	private ComponantJdbcConnection componantJdbcconnection;

	public ComponantJdbcConnection getComponantJdbcconnection() {
		return componantJdbcconnection;
	}

	public void setComponantJdbcconnection(ComponantJdbcConnection componantJdbcconnection) {
		this.componantJdbcconnection = componantJdbcconnection;
	}
	
	
	
}
