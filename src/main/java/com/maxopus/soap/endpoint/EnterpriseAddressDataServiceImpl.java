package com.maxopus.soap.endpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maxopus.enterprise.services.EnterpriseAddressDataService;
import com.maxopus.enterprise.services.EnterpriseAddressServiceException;
import com.maxopus.enterprise.services.address.ObjectFactory;
import com.maxopus.enterprise.services.address.StreetAddress;
import com.maxopus.enterprise.services.address.StreetAddressRequest;
import com.maxopus.enterprise.services.address.StreetAddressResponse;
import com.maxopus.enterprise.services.common.StandardInputHeader;

public class EnterpriseAddressDataServiceImpl implements  EnterpriseAddressDataService{

	@Override
	public StreetAddressResponse findAddresses(StreetAddressRequest parameters, 
											   StandardInputHeader charterHeaderInput) throws EnterpriseAddressServiceException {
		ObjectFactory factory = new ObjectFactory();
		ObjectMapper oMapper = new ObjectMapper(); 
		@SuppressWarnings("unchecked")
		Map<String, Object> map = oMapper.convertValue(parameters, Map.class);
		System.out.println("Endpoint received request : " + map);
		StreetAddressResponse response = factory.createStreetAddressResponse();
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
		streetAddress.setId(new Long(167));
		streetAddress.setSourceSystemAddressId("a566h");
		streetAddress.setType("Service");
		streetAddress.setServiceabilityMatch("Exact");
		streetAddress.setAddressLine1Text("12443 Whisper Bend Dr");
		streetAddress.setAddressLine2Text("Apt #1");
		streetAddress.setCityName("Saint Louis");
		streetAddress.setTerritoryCode("MO");
		streetAddress.setFullPostalCodeText("12345");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(2));
		streetAddress.setSourceSystemAddressId("ab");
		streetAddress.setType("Billing");
		streetAddress.setServiceabilityMatch("Nearby");
		streetAddress.setAddressLine1Text("12443 Whispering Oaks Dr");
		streetAddress.setAddressLine2Text("Apt #2");
		streetAddress.setCityName("Saint Louis");
		streetAddress.setTerritoryCode("MO");
		streetAddress.setFullPostalCodeText("12345");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(3));
		streetAddress.setSourceSystemAddressId("abc");
		streetAddress.setType("Billing");
		streetAddress.setServiceabilityMatch("Nearby");
		streetAddress.setAddressLine1Text("12443 Whispering Hills Ln");
		streetAddress.setAddressLine2Text("Apt A");
		streetAddress.setCityName("Saint Louis");
		streetAddress.setTerritoryCode("MO");
		streetAddress.setFullPostalCodeText("12345");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(4));
		streetAddress.setSourceSystemAddressId("abcd");
		streetAddress.setType("Billing");
		streetAddress.setServiceabilityMatch("Nearby");
		streetAddress.setAddressLine1Text("12443 Whisper Ct");
		streetAddress.setAddressLine2Text("Apt B");
		streetAddress.setCityName("Alto");
		streetAddress.setTerritoryCode("NM");
		streetAddress.setFullPostalCodeText("12346");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(5));
		streetAddress.setSourceSystemAddressId("abcde");
		streetAddress.setType("Service");
		streetAddress.setServiceabilityMatch("Exact");
		streetAddress.setAddressLine1Text("12443 Whisper Dr");
		streetAddress.setAddressLine2Text("Apt B");
		streetAddress.setCityName("Adams");
		streetAddress.setTerritoryCode("KY");
		streetAddress.setFullPostalCodeText("12347");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(6));
		streetAddress.setSourceSystemAddressId("abcdef");
		streetAddress.setType("Service");
		streetAddress.setServiceabilityMatch("Exact");
		streetAddress.setAddressLine1Text("12443 Whisper Ct");
		streetAddress.setAddressLine2Text("Apt #123");
		streetAddress.setCityName("Abrams");
		streetAddress.setTerritoryCode("WI");
		streetAddress.setFullPostalCodeText("12348");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(7));
		streetAddress.setSourceSystemAddressId("abcdefg");
		streetAddress.setType("Service");
		streetAddress.setServiceabilityMatch("Exact");
		streetAddress.setAddressLine1Text("12443 Whisper Way");
		streetAddress.setAddressLine2Text("Apt C");
		streetAddress.setCityName("Abrams");
		streetAddress.setTerritoryCode("WI");
		streetAddress.setFullPostalCodeText("12349");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(8));
		streetAddress.setSourceSystemAddressId("abcdefgh");
		streetAddress.setType("Billing");
		streetAddress.setServiceabilityMatch("Nearby");
		streetAddress.setAddressLine1Text("12443 Whisper Ln");
		streetAddress.setAddressLine2Text("Apt F");
		streetAddress.setCityName("Anderson");
		streetAddress.setTerritoryCode("SC");
		streetAddress.setFullPostalCodeText("12350");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(9));
		streetAddress.setSourceSystemAddressId("abcdefghi");
		streetAddress.setType("Billing");
		streetAddress.setServiceabilityMatch("Nearby");
		streetAddress.setAddressLine1Text("12443 Whisper Ln");
		streetAddress.setAddressLine2Text("Apt #321");
		streetAddress.setCityName("Antelop");
		streetAddress.setTerritoryCode("CA");
		streetAddress.setFullPostalCodeText("12351");
		streetAddress.setCountryCode("US");
		streetAddressList.add(streetAddress);
		
		streetAddress = new StreetAddress();
		streetAddress.setId(new Long(10));
		streetAddress.setSourceSystemAddressId("abcdefghij");
		streetAddress.setType("Service");
		streetAddress.setServiceabilityMatch("Exact");
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
