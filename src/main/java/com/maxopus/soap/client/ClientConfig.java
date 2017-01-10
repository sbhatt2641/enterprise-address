package com.maxopus.soap.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maxopus.enterprise.services.EnterpriseAddressDataService;
import com.maxopus.enterprise.services.EnterpriseServiceAbilityDataService;

@Configuration
public class ClientConfig {

    @Value("${address.service.url}")
    private String addressService;

    @Value("${serviceAbility.service.url}")
    private String serviceAbilityService;
    
    @Bean(name = "soapAddressClientProxyBean")
    public EnterpriseAddressDataService addressPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(EnterpriseAddressDataService.class);
        jaxWsProxyFactoryBean.setAddress(addressService);

        return (EnterpriseAddressDataService) jaxWsProxyFactoryBean.create();
    }
    
    @Bean(name = "soapServiceAbilityClientProxyBean")
    public EnterpriseServiceAbilityDataService serviceAbilityPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(EnterpriseServiceAbilityDataService.class);
        jaxWsProxyFactoryBean.setAddress(serviceAbilityService);

        return (EnterpriseServiceAbilityDataService) jaxWsProxyFactoryBean.create();
    }
}
