package com.org.somak.horrorapp.monster.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_monster")
public class Monster {

	@Id
	@Column(name = "name")
	private String monsterName;

	@Column(name = "description")
	private String monsterDescription;

	@Column(name = "alive")
	private Boolean isAlive;

	@Column(name = "legend")
	private Boolean isLegend;

	public Monster() {
		
	}
	
	public Monster(String monsterName, String monsterDescription, Boolean isAlive) {
		super();
		this.monsterName = monsterName;
		this.monsterDescription = monsterDescription;
		this.isAlive = isAlive;
	}

	public Monster(String monsterName, String monsterDescription, Boolean isAlive, Boolean isLegend) {
		super();
		this.monsterName = monsterName;
		this.monsterDescription = monsterDescription;
		this.isAlive = isAlive;
		this.isLegend = isLegend;
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

}
