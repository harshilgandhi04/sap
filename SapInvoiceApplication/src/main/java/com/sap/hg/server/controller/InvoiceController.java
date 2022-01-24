package com.sap.hg.server.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.sap.hg.server.dao.InvoiceDAO;
import com.sap.hg.server.model.Invoice;
import com.sap.hg.server.model.InvoiceHeader;
import com.sap.hg.server.model.Invoices;

public class InvoiceController {
	
	public Invoice addInvoice(Invoice invoice) {
		return invoice;
		
	}
	@Autowired
    private InvoiceDAO invoiceDao;
    
    @GetMapping(path="/", produces = "application/json")
    public Invoices getInvoices() 
    {
        return InvoiceDAO.getAllInvoices();
    }
    
    @PostMapping(path= "/addInvoice", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addInvoice(
                        @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
                        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
                        @RequestBody Invoice invoice) 
                 throws Exception 
    {       
        //Generate resource id
        int id = invoiceDao.getAllInvoices().getInvoicesList().size() + 1;
        Invoice.setInvoiceNumber(id);
        
        //add resource
        invoiceDao.addInvoice(invoice);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(invoice.getId())
                                    .toUri();
        
        //Send location in response
        return ResponseEntity.created(location).build();
    }

}
