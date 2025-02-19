package com.sai.Security.Service;

import java.util.*;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JWTService {

	private String secretKey = "CF781A";
	public String generateToken(String username) {
		
		Map<String, Object> claims = new HashMap<>();
		
		return Jwts.builder()
				.claims()
				.add(claims)
				.subject(username)
				.issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis()+60*60*30))
				.and()
				.signWith(getKey())
				.compact();
	}
	
	private Object getKey() {
		byte [] keyBytes = Decoders.BASE64.decode(secretKey);
		return Keys.hmacShakeyFor(keyBytes);
	}

	 

}
 