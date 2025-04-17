package com.xfinity.orderservice.oduprocessor.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xfinity.orderservice.oduprocessor.model.OrderRequest;
import org.springframework.stereotype.Component;

@Component
public class XmlToOrderMapper {

    private final XmlMapper xmlMapper = new XmlMapper();

    public OrderRequest map(String xml) throws JsonProcessingException {
        return xmlMapper.readValue(xml, OrderRequest.class);
    }
}
