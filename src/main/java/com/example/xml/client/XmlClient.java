package com.example.xml.client;

import com.example.xml.response.XmlResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "${apiUrl}", name = "XML-CLIENT")
public interface XmlClient {

    @RequestMapping(method = RequestMethod.GET)
    XmlResponse getXml();


}


