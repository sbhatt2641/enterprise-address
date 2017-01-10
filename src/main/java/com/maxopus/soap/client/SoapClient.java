package com.maxopus.soap.client;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maxopus.enterprise.services.EnterpriseAddressDataService;
import com.maxopus.enterprise.services.EnterpriseAddressServiceException;
import com.maxopus.enterprise.services.EnterpriseServiceAbilityDataService;
import com.maxopus.enterprise.services.EnterpriseServiceAbilityServiceException;
import com.maxopus.enterprise.services.address.StreetAddressRequest;
import com.maxopus.enterprise.services.address.StreetAddressResponse;
import com.maxopus.enterprise.services.serviceability.ServiceabilityByPostalCodeResponse;
import com.maxopus.enterprise.services.address.ObjectFactory;

@Component
public class SoapClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(SoapClient.class);

	@Autowired
    private EnterpriseAddressDataService soapAddressClientProxyBean;
	
	@Autowired
    private EnterpriseServiceAbilityDataService soapServiceAbilityClientProxyBean;
	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String findAddresses() {
		ObjectFactory addressFactory = new ObjectFactory();
		com.maxopus.enterprise.services.common.ObjectFactory commonFactory = new com.maxopus.enterprise.services.common.ObjectFactory();
		try {
			StreetAddressResponse res = soapAddressClientProxyBean.findAddresses(addressFactory.createStreetAddressRequest(), commonFactory.createStandardInputHeader());
			ObjectMapper oMapper = new ObjectMapper(); 
			Map<String, Object> map = oMapper.convertValue(res, Map.class);
			System.out.println("Client returning success : " + map);
			return "success";
		} catch (EnterpriseAddressServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}		
	}
	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String findServiceabilityByPostalCode() {
		com.maxopus.enterprise.services.serviceability.ObjectFactory serviceFactory = new com.maxopus.enterprise.services.serviceability.ObjectFactory();
		com.maxopus.enterprise.services.common.ObjectFactory commonFactory = new com.maxopus.enterprise.services.common.ObjectFactory();
		try {
			ServiceabilityByPostalCodeResponse res = soapServiceAbilityClientProxyBean.findServiceabilityByPostalCode(serviceFactory.createServiceabilityByPostalCodeRequest(), commonFactory.createStandardInputHeader());
			ObjectMapper oMapper = new ObjectMapper(); 
			Map<String, Object> map = oMapper.convertValue(res, Map.class);
			System.out.println("Client returning success : " + map);
			return "success";
		} catch (EnterpriseServiceAbilityServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}		
	}
}

