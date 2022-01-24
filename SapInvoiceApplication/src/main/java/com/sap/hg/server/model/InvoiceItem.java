package com.sap.hg.server.model;

public class InvoiceItem {
	  private String InvoiceNumber;
	  private double ItemNumber;
	  private String Country;
	  private String TaxCode;
	  private double Amount;
	  private double NetComputedAmount;
	  
	public String getInvoiceNumber() {
		return InvoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}
	public double getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(double itemNumber) {
		ItemNumber = itemNumber;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getTaxCode() {
		return TaxCode;
	}
	public void setTaxCode(String taxCode) {
		TaxCode = taxCode;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public double getNetComputedAmount() {
		return NetComputedAmount;
	}
	public void setNetComputedAmount(double netComputedAmount) {
		NetComputedAmount = netComputedAmount;
	}
	  
}
