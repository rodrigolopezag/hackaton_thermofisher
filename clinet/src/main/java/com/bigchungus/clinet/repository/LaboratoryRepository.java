package com.bigchungus.clinet.repository;

import com.bigchungus.clinet.model.Laboratory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryRepository extends MongoRepository<Laboratory, String> {

}
