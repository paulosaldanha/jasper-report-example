package com.example.jasper.jasper.service;

import com.example.jasper.jasper.model.Product;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    JasperPrint generateReport() throws JRException, IOException;
    List<Product> findAllProducts();
}
