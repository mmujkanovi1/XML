package com.example.xml;

import com.example.xml.model.Xml;
import com.example.xml.repository.XmlRepository;
import com.example.xml.service.XmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class XmlApplication implements CommandLineRunner {

    @Autowired
    private XmlRepository xmlRepository;

    @Autowired
    private XmlService xmlService;

	public static void main(String[] args) {
		SpringApplication.run(XmlApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        System.out.println("STARRT");
        Xml xml=new Xml();
        xml.setNameOfFile("XmlExample");
        xml.setXml("<note>\n" +
                "<to>Tove</to>\n" +
                "<from>Jani</from>\n" +
                "<heading>Reminder</heading>\n" +
                "<body>Don't forget me this weekend!</body>\n" +
                "</note>");
xmlRepository.save(xml);

        xmlService.createFile();

    }
}
