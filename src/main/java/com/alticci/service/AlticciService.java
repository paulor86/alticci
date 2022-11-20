package com.alticci.service;

import java.util.List;

import com.alticci.entity.AlticciEntity;

public interface AlticciService {

	public AlticciEntity saveValueAlticci(AlticciEntity enttity);

	public AlticciEntity findValueAlticci(Long index);

	public List<AlticciEntity> findAllValueAlticci();

}
