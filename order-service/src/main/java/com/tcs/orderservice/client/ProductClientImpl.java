package com.tcs.orderservice.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.orderservice.domain.Product;


@Service
public class ProductClientImpl implements ProductClient {
	
	private final String URI_PRODUCTID = "http://localhost:8810/employees/products/";
    //private final String URI_EMPLOYEE_ID = "http://localhost:8081/employees/{id}";
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		Map < String, String > params = new HashMap < > ();
        params.put("id", String.valueOf(productId));
        Product product = restTemplate.getForObject(URI_PRODUCTID, Product.class, params);
        

		return product;
	}

}
