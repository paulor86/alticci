package com.alticci.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "alticci")
public class AlticciEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long index;
	private Long value;
}
