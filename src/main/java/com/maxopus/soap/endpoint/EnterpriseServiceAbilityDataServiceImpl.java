package com.maxopus.soap.endpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maxopus.enterprise.services.EnterpriseServiceAbilityDataService;
import com.maxopus.enterprise.services.EnterpriseServiceAbilityServiceException;

import com.maxopus.enterprise.services.common.StandardInputHeader;
import com.maxopus.enterprise.services.serviceability.LineOfBusinessServiceability;
import com.maxopus.enterprise.services.serviceability.ObjectFactory;
import com.maxopus.enterprise.services.serviceability.ServiceabilityByPostalCodeRequest;
import com.maxopus.enterprise.services.serviceability.ServiceabilityByPostalCodeResponse;
import com.maxopus.enterprise.services.serviceability.ServiceabilityFeature;
import com.maxopus.enterprise.services.serviceability.ServiceabilityResult;

public class EnterpriseServiceAbilityDataServiceImpl implements EnterpriseServiceAbilityDataService {

	@Override
	public ServiceabilityByPostalCodeResponse findServiceabilityByPostalCode(ServiceabilityByPostalCodeRequest parameters, 
																			 StandardInputHeader charterHeaderInput) throws EnterpriseServiceAbilityServiceException {
		ObjectFactory factory = new ObjectFactory();
		ObjectMapper oMapper = new ObjectMapper(); 
		@SuppressWarnings("unchecked")
		Map<String, Object> map = oMapper.convertValue(parameters, Map.class);
		System.out.println("Endpoint received request : " + map);
		ServiceabilityByPostalCodeResponse response = factory.createServiceabilityByPostalCodeResponse();
		ServiceabilityResult serviceabilityResult = factory.createServiceabilityResult();
		serviceabilityResult.getLineOfBusinessServiceabilities().addAll(lineOfBusinessServiceabilities());
		response.setServiceabilityResult(serviceabilityResult);
		return response;
	}

	
	/**
	 *  
	 * @return
	 */
	private List<LineOfBusinessServiceability> lineOfBusinessServiceabilities(){
		 
		List<LineOfBusinessServiceability> lineOfBusinessServiceabilities = new ArrayList<LineOfBusinessServiceability>();
		
		LineOfBusinessServiceability lineOfBusinessServiceability = new LineOfBusinessServiceability();
		lineOfBusinessServiceability.setName("Data");
		lineOfBusinessServiceability.setServiceable(true);
		
		List<ServiceabilityFeature> serviceabilityFeatures = new ArrayList<ServiceabilityFeature>();
		ServiceabilityFeature serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Data Feature Name 1");
		serviceabilityFeature.setValue("Data Feature Value 1");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Data Feature Name 2");
		serviceabilityFeature.setValue("Data Feature Value 2");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Data Feature Name 3");
		serviceabilityFeature.setValue("Data Feature Value 3");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		lineOfBusinessServiceability.getServiceabilityFeatures().addAll(serviceabilityFeatures);
		lineOfBusinessServiceabilities.add(lineOfBusinessServiceability);
		
		/* One */
		
		lineOfBusinessServiceability = new LineOfBusinessServiceability();
		lineOfBusinessServiceability.setName("Voice");
		lineOfBusinessServiceability.setServiceable(true);
		
		serviceabilityFeatures = new ArrayList<ServiceabilityFeature>();
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Voice Feature Name 1");
		serviceabilityFeature.setValue("Voice Feature Value 1");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Voice Feature Name 2");
		serviceabilityFeature.setValue("Voice Feature Value 2");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Voice Feature Name 3");
		serviceabilityFeature.setValue("Voice Feature Value 3");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		lineOfBusinessServiceability.getServiceabilityFeatures().addAll(serviceabilityFeatures);
		lineOfBusinessServiceabilities.add(lineOfBusinessServiceability);
		
		/* Two  */
		
		lineOfBusinessServiceability = new LineOfBusinessServiceability();
		lineOfBusinessServiceability.setName("Video");
		lineOfBusinessServiceability.setServiceable(false);
		
		serviceabilityFeatures = new ArrayList<ServiceabilityFeature>();
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Video Feature Name 1");
		serviceabilityFeature.setValue("Video Feature Value 1");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Video Feature Name 2");
		serviceabilityFeature.setValue("Video Feature Value 2");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		serviceabilityFeature = new ServiceabilityFeature();
		serviceabilityFeature.setName("Video Feature Name 3");
		serviceabilityFeature.setValue("Video Feature Value 3");
		serviceabilityFeatures.add(serviceabilityFeature);
		
		lineOfBusinessServiceability.getServiceabilityFeatures().addAll(serviceabilityFeatures);
		lineOfBusinessServiceabilities.add(lineOfBusinessServiceability);
		
		/* Three  */
		
		return lineOfBusinessServiceabilities;
	 }
}
