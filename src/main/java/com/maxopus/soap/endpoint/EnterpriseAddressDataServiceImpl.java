package com.maxopus.soap.endpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.maxopus.enterprise.address.EnterpriseAddressDataService;
import com.maxopus.enterprise.address.EnterpriseAddressServiceException_Exception;
import com.maxopus.enterprise.address.FindStreetAddressesRequest;
import com.maxopus.enterprise.address.FindStreetAddressesResponse;
import com.maxopus.enterprise.address.ObjectFactory;
import com.maxopus.enterprise.address.StandardInputHeader;
import com.maxopus.enterprise.address.StreetAddress;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnterpriseAddressDataServiceImpl implements  EnterpriseAddressDataService{

	@Override
	public FindStreetAddressesResponse findAddresses(FindStreetAddressesRequest parameters,
													 StandardInputHeader charterHeaderInputInfo) throws EnterpriseAddressServiceException_Exception {
		ObjectFactory factory = new ObjectFactory();
		ObjectMapper oMapper = new ObjectMapper(); 
		Map<String, Object> map = oMapper.convertValue(parameters, Map.class);
		System.out.println("Endpoint received request : " + map);
		FindStreetAddressesResponse response = factory.createFindStreetAddressesResponse();
		response.getReturn().addAll(addressList());
		return response;
	}
	
	/**
	 * 
	 * @return
	 */
	private List<StreetAddress> addressList(){
		
		List<StreetAddress> streetAddressList = new ArrayList<StreetAddress>();
		
		StreetAddress streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Bend Dr");
		streetAddress.setAddressLine2Text("Apt #1");
		streetAddress.setCityName("Saint Louis");
		streetAddress.setTerritoryCode("MO");
		streetAddress.setFullPostalCodeText("12345");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whispering Oaks Dr");
		streetAddress.setAddressLine2Text("Apt #2");
		streetAddress.setCityName("Saint Louis");
		streetAddress.setTerritoryCode("MO");
		streetAddress.setFullPostalCodeText("12345");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whispering Hills Ln");
		streetAddress.setAddressLine2Text("Apt A");
		streetAddress.setCityName("Saint Louis");
		streetAddress.setTerritoryCode("MO");
		streetAddress.setFullPostalCodeText("12345");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Ct");
		streetAddress.setAddressLine2Text("Apt B");
		streetAddress.setCityName("Alto");
		streetAddress.setTerritoryCode("NM");
		streetAddress.setFullPostalCodeText("12346");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Dr");
		streetAddress.setAddressLine2Text("Apt B");
		streetAddress.setCityName("Adams");
		streetAddress.setTerritoryCode("KY");
		streetAddress.setFullPostalCodeText("12347");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Ct");
		streetAddress.setAddressLine2Text("Apt #123");
		streetAddress.setCityName("Abrams");
		streetAddress.setTerritoryCode("WI");
		streetAddress.setFullPostalCodeText("12348");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Way");
		streetAddress.setAddressLine2Text("Apt C");
		streetAddress.setCityName("Abrams");
		streetAddress.setTerritoryCode("WI");
		streetAddress.setFullPostalCodeText("12349");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Ln");
		streetAddress.setAddressLine2Text("Apt F");
		streetAddress.setCityName("Anderson");
		streetAddress.setTerritoryCode("SC");
		streetAddress.setFullPostalCodeText("12350");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Ln");
		streetAddress.setAddressLine2Text("Apt #321");
		streetAddress.setCityName("Antelop");
		streetAddress.setTerritoryCode("CA");
		streetAddress.setFullPostalCodeText("12351");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setAddressLine1Text("12443 Whisper Ln NW");
		streetAddress.setAddressLine2Text("Apt #321");
		streetAddress.setCityName("Ashby");
		streetAddress.setTerritoryCode("MN");
		streetAddress.setFullPostalCodeText("12352");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		return streetAddressList;
	}
}
