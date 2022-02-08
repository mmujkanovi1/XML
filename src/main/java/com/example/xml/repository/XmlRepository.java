package com.example.xml.repository;

import com.example.xml.model.Xml;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XmlRepository extends JpaRepository<Xml,Long> {
}
