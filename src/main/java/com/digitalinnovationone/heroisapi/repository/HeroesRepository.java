package com.digitalinnovationone.heroisapi.repository;

import com.digitalinnovationone.heroisapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
