package com.bigchungus.clinet.repository;

import com.bigchungus.clinet.model.Study;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends MongoRepository<Study, String>{

}
