package com.maxopus.soap.client;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.charter.enterprise.address.EnterpriseAddressDataService;
import com.charter.enterprise.address.EnterpriseAddressServiceException_Exception;
import com.charter.enterprise.address.FindStreetAddressesRequest;
import com.charter.enterprise.address.FindStreetAddressesResponse;
import com.charter.enterprise.address.ObjectFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class HelloWorldClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldClient.class);

	@Autowired
    private EnterpriseAddressDataService helloWorldClientProxyBean;
	
	@SuppressWarnings("unchecked")
	public String findAddress() {
		ObjectFactory factory = new ObjectFactory();
		FindStreetAddressesRequest req = factory.createFindStreetAddressesRequest();
		try {
			FindStreetAddressesResponse res = helloWorldClientProxyBean.findAddresses(req, null);
			ObjectMapper oMapper = new ObjectMapper(); 
			Map<String, Object> map = oMapper.convertValue(res, Map.class);
			System.out.println("Client returning success : " + map);
			return "success";
		} catch (EnterpriseAddressServiceException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}		
	}
}
