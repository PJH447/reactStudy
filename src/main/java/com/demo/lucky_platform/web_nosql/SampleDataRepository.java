package com.demo.lucky_platform.web_nosql;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleDataRepository extends MongoRepository<SampleDateInfo, String> {

    @Query("{name: {$regex: ?0}}")
    List<SampleDateInfo> findByName(String name);

    @Query("{count: {$gt: ?0}}")
    List<SampleDateInfo> findTest(Integer count);



}
