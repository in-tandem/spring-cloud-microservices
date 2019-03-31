package com.org.somak.horrorapp.monster.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.somak.horrorapp.monster.entity.Monster;

@Repository
public interface MonsterRepository extends JpaRepository<Monster,String>{
	
	
	public default List<Monster> findAllAliveMonsters(){
		return findAll()
				.stream()
				.filter(Monster::getIsAlive)
				.collect(Collectors.toList());
	}
	
	public default List<Monster> findAllDeadMonsters(){
		return findAll()
				.stream()
				.filter((entity)->{
					
					return !entity.getIsAlive();
				})
				.collect(Collectors.toList());
	}
	
	public default List<Monster> findAllLegendaryMonsters(){
		return findAll()
				.stream()
				.filter(Monster::getIsLegend)
				.collect(Collectors.toList());
	}

}
