package com.sap.hg.server.model;

import java.util.ArrayList;
import java.util.List;


public class Invoices {
	
	private List<Invoice> invoiceList;
	

	public List<Invoice> getInvoicesList() {
	        if(invoiceList == null) {
	        	invoiceList = new ArrayList<>();
	        }
	        return invoiceList;
	    }
	 
	 public void setInvoiceList(List<Invoice> invoiceList) {
	        this.invoiceList = invoiceList;
	    }
}
