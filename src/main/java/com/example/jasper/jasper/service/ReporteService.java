package com.example.jasper.jasper.service;

import com.example.jasper.jasper.model.Product;

import net.sf.jasperreports.engine.JRException;
import java.io.IOException;
import java.util.List;

public interface ReporteService {
    String generateReport(String fileFormat) throws JRException, IOException;
    List<Product> findAllProducts();
}
