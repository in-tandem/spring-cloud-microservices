package com.org.somak.horrorapp.monster.entity;

import java.util.function.Function;

import com.org.somak.horrorapp.monster.dto.MonsterDTO;

public class DomainDTOMapper {

	public static final Function<Monster, MonsterDTO> converter = (entity) -> {
		return new MonsterDTO(entity.getMonsterName(),

				entity.getMonsterDescription(),

				entity.getIsAlive(),

				entity.getIsLegend());

	};

	public static final Function<MonsterDTO, Monster> dtoEntityConverter = (dto) -> {
		return new Monster(dto.getMonsterName(),

				dto.getMonsterDescription(),

				dto.getIsAlive(),

				dto.getIsLegend());

	};
}
