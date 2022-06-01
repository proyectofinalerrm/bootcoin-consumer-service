package com.pe.project.bootcoin.consumer.document;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bootcoin_transaction")
public class BootCoinConsumerDocument {

	private String bootCoinTrasanctonId;
	private Double amount;
	private Date dateTransaction;
	private String sourcebootcoinId;
	private String destinationbootcoinId;
	
}
