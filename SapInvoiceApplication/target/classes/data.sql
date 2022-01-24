CREATE TABLE Invoice_Header
(
  InvoiceNumber VARCHAR(20) PRIMARY KEY,
  TotalAmount DECIMAL(10,2) NOT NULL,
  ExternalSystem VARCHAR(250) NULL,
  NetAmount DECIMAL(10,2) DEFAULT NULL
);

CREATE TABLE Invoice_Item
(
  InvoiceNumber VARCHAR(20) NOT NULL,
  ItemNumber DECIMAL(10,2) NOT NULL,
  Country VARCHAR(20) NOT NULL,
  TaxCode VARCHAR(20) NOT NULL,
  Amount DECIMAL(10,2) NOT NULL,
  NetComputedAmount DECIMAL(10,2) NOT NULL
);

CREATE TABLE Tax
(
  Country VARCHAR(20)  NOT NULL,
  TaxCode VARCHAR(20) NOT NULL,
  TaxPercentage INT  NOT NULL,
  PRIMARY KEY(Country, TaxCode)
);

INSERT INTO Tax values('India','Senior',10);
INSERT INTO Tax values('India','Default',30);
INSERT INTO Tax values('Germany','Default',40);
INSERT INTO Tax values('Default','Default',15);