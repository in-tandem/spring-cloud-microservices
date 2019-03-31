package com.org.somak.horrorapp.monster.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="monster.micro.service")
public class MonsterConfiguration {

	private Boolean alive;
	
	private Boolean legendary;

	public Boolean getAlive() {
		return alive;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public Boolean getLegendary() {
		return legendary;
	}

	public void setLegendary(Boolean legendary) {
		this.legendary = legendary;
	}
	
	
}
