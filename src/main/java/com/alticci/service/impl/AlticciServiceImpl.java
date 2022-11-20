package com.alticci.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alticci.entity.AlticciEntity;
import com.alticci.repositories.AlticciRepository;
import com.alticci.service.AlticciService;

@Service
public class AlticciServiceImpl implements AlticciService {

	@Autowired
	private AlticciRepository alticciRepository;

	@Override
	public AlticciEntity saveValueAlticci(AlticciEntity entity) {
		AlticciEntity entitie = responseValueAlticci(entity);
		AlticciEntity entities = new AlticciEntity();
		entities.setIndex(entitie.getIndex());
		entities.setValue(entitie.getValue());
		return alticciRepository.save(entities);
	}

	@Override
	public List<AlticciEntity> findAllValueAlticci() {
		return alticciRepository.findAll();
	}

	@Override
	public AlticciEntity findValueAlticci(Long index) {
		Optional<AlticciEntity> entity = alticciRepository.findById(index);
		return entity.orElse(null);
	}

	public AlticciEntity responseValueAlticci(AlticciEntity entity) {

		AlticciEntity entities = new AlticciEntity();

		if (entity.getIndex() == 0) {
			entities.setIndex(entity.getIndex());
			entities.setValue(entity.getIndex());
		} else if (entity.getIndex() == 1) {
			entities.setIndex(entity.getIndex());
			entities.setValue(entity.getIndex());
		} else if (entity.getIndex() == 2) {
			entities.setIndex(entity.getIndex());
			entities.setValue(entity.getIndex() - 1);
		} else if (entity.getIndex() > 2) {
			Long value = (entity.getIndex() - 3) + (entity.getIndex() - 2);
			entities.setIndex(entity.getIndex());
			entities.setValue(value);
		}
		return entities;
	}
}
