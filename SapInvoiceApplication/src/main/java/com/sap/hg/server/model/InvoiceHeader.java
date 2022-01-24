package com.sap.hg.server.model;

public class InvoiceHeader {
	
	private int InvoiceNumber;
	private double TotalAmount;
	private String ExternalSystem;
	private double NetAmount;
	private InvoiceItem item;
	
	public int getInvoiceNumber() {
		return InvoiceNumber;
	}
	public void setInvoiceNumber(int id) {
		InvoiceNumber = id;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getExternalSystem() {
		return ExternalSystem;
	}
	public void setExternalSystem(String externalSystem) {
		ExternalSystem = externalSystem;
	}
	public double getNetAmount() {
		return NetAmount;
	}
	public void setNetAmount(double netAmount) {
		NetAmount = netAmount;
	}
	public InvoiceItem getItem() {
		return item;
	}
	public void setItem(InvoiceItem item) {
		this.item = item;
	}

}

