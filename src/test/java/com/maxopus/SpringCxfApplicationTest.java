package com.maxopus;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.maxopus.soap.client.SoapClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringCxfApplicationTest {

	@Autowired
    private SoapClient soapClient;

    @Test
    public void testGetAddresses() {

        assertThat(soapClient.findAddresses()).isEqualTo("success");
    }
    
    @Test
    public void testGetAddressbyId() {

        assertThat(soapClient.findAddressById()).isEqualTo("success");
    }
    
    @Test
    public void testGetServiceAbilityByPostalCode() {

        assertThat(soapClient.findServiceabilityByPostalCode()).isEqualTo("success");
    }
}
