package com.example.xml.mapper;

import com.example.xml.model.Xml;
import com.example.xml.response.XmlResponse;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper  {

    XmlResponse getXmlResponseFromXml(Xml xml);

}

