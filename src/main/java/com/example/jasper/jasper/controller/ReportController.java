package com.example.jasper.jasper.controller;

import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.jasper.jasper.model.Product;
import com.example.jasper.jasper.repository.ProductRepository;
import com.example.jasper.jasper.service.ProductService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequiredArgsConstructor
public class ReportController {
    private final ProductService productService;

    @GetMapping("/")
    public void showProducts(HttpServletResponse response) throws JRException, IOException{
        
        JasperExportManager.exportReportToPdfStream(productService.generateReport(), response.getOutputStream());
        response.setContentType("application/pdf");
        response.addHeader("Content-Disposition", "inline; filename=jasper.pdf;");
    }
}
