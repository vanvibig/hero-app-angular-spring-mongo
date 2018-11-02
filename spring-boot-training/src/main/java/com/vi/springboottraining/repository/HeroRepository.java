package com.vi.springboottraining.repository;

import com.vi.springboottraining.model.Hero;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;


public interface HeroRepository extends MongoRepository<Hero, String> {

    public Hero[] findAllByNameContaining(String name);

    public void deleteById(String id);
}
