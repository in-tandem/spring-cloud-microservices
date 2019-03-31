package com.org.somak.horrorapp.monster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.somak.horrorapp.monster.entity.Monster;

@Repository
public interface MonsterRepository extends JpaRepository<Monster,String>{

}
