package com.org.somak.horrorapp.monster.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MonsterDTO {

	
	@NotNull
	@NotBlank
	private String monsterName;

	private String monsterDescription;

	private Boolean isAlive;

	private Boolean isLegend;

	private MonsterAttributes attributes;
	
	
	public MonsterDTO(String monsterName, String monsterDescription, Boolean isAlive, Boolean isLegend) {
		super();
		this.monsterName = monsterName;
		this.monsterDescription = monsterDescription;
		this.isAlive = isAlive;
		this.isLegend = isLegend;
	
	}

	public MonsterDTO(String monsterName, String monsterDescription, Boolean isAlive, Boolean isLegend,
			MonsterAttributes attributes) {
		super();
		this.monsterName = monsterName;
		this.monsterDescription = monsterDescription;
		this.isAlive = isAlive;
		this.isLegend = isLegend;
		this.attributes = attributes;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}

	public String getMonsterDescription() {
		return monsterDescription;
	}

	public void setMonsterDescription(String monsterDescription) {
		this.monsterDescription = monsterDescription;
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Boolean getIsLegend() {
		return isLegend;
	}

	public void setIsLegend(Boolean isLegend) {
		this.isLegend = isLegend;
	}

	public MonsterAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(MonsterAttributes attributes) {
		this.attributes = attributes;
	}
	
	

}
