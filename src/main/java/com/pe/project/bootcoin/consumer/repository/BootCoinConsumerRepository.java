package com.pe.project.bootcoin.consumer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.pe.project.bootcoin.consumer.document.BootCoinConsumerDocument;

@Repository
public interface BootCoinConsumerRepository extends ReactiveMongoRepository<BootCoinConsumerDocument, String> {

}
