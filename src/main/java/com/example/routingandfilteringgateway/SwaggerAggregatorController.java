/**
 * 
 */
package com.example.routingandfilteringgateway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * @author user
 *
 */
@Component
@Primary
@EnableAutoConfiguration
public class SwaggerAggregatorController implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources= new ArrayList<>();
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName("service1");
        swaggerResource.setLocation("/service1/v2/api-docs");
        swaggerResource.setSwaggerVersion("2.0");
        
        SwaggerResource swaggerResource1 = new SwaggerResource();
        swaggerResource1.setName("service2");
        swaggerResource1.setLocation("/service2/v2/api-docs");
        swaggerResource1.setSwaggerVersion("2.0");

        resources.add(swaggerResource);
        resources.add(swaggerResource1);
        return resources;
    }
}
