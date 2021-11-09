package com.brs.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Test {
	
	@Id
	private int id;

}
