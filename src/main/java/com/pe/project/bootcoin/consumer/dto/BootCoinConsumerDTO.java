package com.pe.project.bootcoin.consumer.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BootCoinConsumerDTO {

	@Id
	private String bootId;
	private String documentNumber;
	private String documentType;
	private String phoneNumber;
	private String email;
	private Double amount;
}
