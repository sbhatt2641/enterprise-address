package com.maxopus.soap.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.charter.enterprise.address.EnterpriseAddressDataService;


@Configuration
public class ClientConfig {

    @Value("${helloworld.service.address}")
    private String helloworldServiceAddress;

    @Bean(name = "helloWorldClientProxyBean")
    public EnterpriseAddressDataService opportunityPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(EnterpriseAddressDataService.class);
        jaxWsProxyFactoryBean.setAddress(helloworldServiceAddress);

        return (EnterpriseAddressDataService) jaxWsProxyFactoryBean.create();
    }
}
