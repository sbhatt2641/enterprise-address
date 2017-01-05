package com.maxopus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.maxopus.soap.client.HelloWorldClient;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringCxfApplicationTest {

	@Autowired
    private HelloWorldClient helloWorldClient;

    @Test
    public void testSayHello() {

        assertThat(helloWorldClient.findAddress()).isEqualTo("success");
    }
}
