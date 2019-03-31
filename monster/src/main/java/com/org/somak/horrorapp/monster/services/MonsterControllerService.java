package com.org.somak.horrorapp.monster.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.org.somak.horrorapp.monster.config.MonsterConfiguration;
import com.org.somak.horrorapp.monster.dto.MonsterDTO;
import com.org.somak.horrorapp.monster.entity.DomainDTOMapper;
import com.org.somak.horrorapp.monster.exception.ExceptionBean;
import com.org.somak.horrorapp.monster.exception.MonsterException;
import com.org.somak.horrorapp.monster.repository.MonsterRepository;

@RestController
@RequestMapping("/core/monster")
public class MonsterControllerService {

	@Autowired
	private MonsterRepository repository;

	@Autowired
	private MonsterConfiguration configuration;
	
	
	@RequestMapping(path = "/getInfo/{name}", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public MonsterDTO getMonsterDetails(@PathVariable("name") String monsterName) throws MonsterException {

		MonsterDTO dto = null;

		try {

			dto = DomainDTOMapper.converter.apply(repository.getOne(monsterName));
		} catch (Exception ex) {
			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_001", ex.getMessage());
			throw new MonsterException(bean);
		}

		return dto;
	}

	@RequestMapping(path="/getAll/", method = RequestMethod.GET, produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<MonsterDTO> getAllMonsters() throws MonsterException {

		try {

			return repository
					.findAll()
					.stream()
					.map(DomainDTOMapper.converter)
					.collect(Collectors.toList());
				
		}
		catch(Exception e) {
			
			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_002", e.getMessage());
			throw new MonsterException(bean);
		}		
		
		
	}

	@RequestMapping(path="/getAll/dead", method = RequestMethod.GET, produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<MonsterDTO> getAllDeadMonsters() throws MonsterException {

		try {

			return repository
					.findAllDeadMonsters()
					.stream()
					.map(DomainDTOMapper.converter)
					.collect(Collectors.toList());
				
		}
		catch(Exception e) {
			
			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_003", e.getMessage());
			throw new MonsterException(bean);
		}		
		
	}

	@RequestMapping(path="/getAll/alive", method = RequestMethod.GET, produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<MonsterDTO> getAllAliveMonsters() throws MonsterException {

		System.out.println("Default variable alive value:"+configuration.getAlive());
		try {

			return repository
					.findAllAliveMonsters()
					.stream()
					.map(DomainDTOMapper.converter)
					.collect(Collectors.toList());
				
		}
		catch(Exception e) {
			
			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_004", e.getMessage());
			throw new MonsterException(bean);
		}		
		
	}

	@RequestMapping(path="/getAll/legendary", method = RequestMethod.GET, produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<MonsterDTO> getLegendaryMonsters() throws MonsterException {

		try {

			return repository
					.findAllLegendaryMonsters()
					.stream()
					.map(DomainDTOMapper.converter)
					.collect(Collectors.toList());
				
		}
		catch(Exception e) {
			
			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_005", e.getMessage());
			throw new MonsterException(bean);
		}		
	}

	@RequestMapping(path="/create", method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createMonster(MonsterDTO monster) throws MonsterException{
		
		try {
			
			repository.save(DomainDTOMapper.dtoEntityConverter.apply(monster));
		}
		catch(Exception e) {

			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_006", e.getMessage());
			throw new MonsterException(bean);
		}
	}
}
