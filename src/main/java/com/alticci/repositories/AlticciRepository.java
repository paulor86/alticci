package com.alticci.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alticci.entity.AlticciEntity;

public interface AlticciRepository extends JpaRepository<AlticciEntity, Long> {

}
