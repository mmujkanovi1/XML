package com.example.xml.controller;


import com.example.xml.mapper.MapStructMapper;
import com.example.xml.repository.XmlRepository;
import com.example.xml.response.XmlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/xml")
public class XmlController {

    @Autowired
    private XmlRepository xmlRepository;

    @Autowired
    private MapStructMapper mapStructMapper;

    @GetMapping("/{id}")
    public ResponseEntity<XmlResponse> getXmls(@PathVariable Long id) {

        return new ResponseEntity<>(
                mapStructMapper.getXmlResponseFromXml(xmlRepository.findById(id).get()),
                HttpStatus.OK
        );



    }

}
