package com.tcs.orderservice.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.orderservice.domain.User;

@Service
public class UserClientImpl implements UserClient{
	
	private final String URI_USER_ID = "http://localhost:8811/users/";
	
	@Autowired
	RestTemplate restTemplate;

	
	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Map < String, String > params = new HashMap < > ();
        params.put("id", String.valueOf(id));
        User user = restTemplate.getForObject(URI_USER_ID, User.class, params);
        

		return user;
	}

}
