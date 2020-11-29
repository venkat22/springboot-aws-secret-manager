package com.sma.aws.properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mak Sophea
 * @date : 1/3/2020
 **/
@RestController
@EnableSwagger2

@RequestMapping(value = "/api/test")

public class TestController {

    @Value(value = "${application.id}")
    private String applicationId;

    @Value(value = "${environment}")
    private String environment;

    @Value(value="${categories.types:#{null}}")
    private String[] categoryTypes;

    @RequestMapping(value = "v1", method = RequestMethod.GET)
    public Map<String, Object> getProperties(HttpServletRequest request) {

        final Map<String, Object> map = new HashMap<>();
        map.put("applicationId", applicationId);
        map.put("environment", environment);
        map.put("types", categoryTypes);
        return map;
    }


}
