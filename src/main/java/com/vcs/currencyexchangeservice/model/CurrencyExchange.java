package com.vcs.currencyexchangeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyExchange {

	private long id;
	private String from;
	private String to;
	private double conversionMultiple;	
	private String environment;
	
	public CurrencyExchange(long id, String from, String to, double conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
}
