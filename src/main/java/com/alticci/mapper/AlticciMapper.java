package com.alticci.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.alticci.dto.AlticciDTO;
import com.alticci.entity.AlticciEntity;

@Mapper(componentModel = "spring")
public interface AlticciMapper {

	AlticciMapper INSTANCE = Mappers.getMapper(AlticciMapper.class);

	AlticciEntity toEntity(AlticciDTO dto);

	AlticciDTO toDTO(AlticciEntity entity);

}
