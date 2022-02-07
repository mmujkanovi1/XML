package com.example.xml.service;

import com.example.xml.client.XmlClient;
import com.example.xml.response.XmlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class XmlService {

    @Autowired
    private XmlClient xmlClient;

    @Value("${filePath}")
    private String FILE_PATH;

    public void createFile() throws IOException {
        XmlResponse xml = xmlClient.getXml();
        Path newFilePath = Paths.get(FILE_PATH + xml.getNameOfFile());
        Files.createFile(newFilePath);
        File file = new File(FILE_PATH + xml.getNameOfFile());
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(xml.getXml());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
