package com.alticci.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AlticciDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long index;
	private Long value;

}
