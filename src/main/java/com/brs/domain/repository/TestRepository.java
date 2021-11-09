package com.brs.domain.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.brs.domain.entity.Test;

@Repository
public class TestRepository {
	
	@PersistenceContext
	 EntityManager em;
	
	public int save(Test test) {
		em.persist(test);
		return test.getId();
	}

}
