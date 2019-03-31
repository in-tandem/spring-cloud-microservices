package com.org.somak.horrorapp.monster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
	
	@RequestMapping(path="/getInfo/{name}", method=RequestMethod.GET, produces = "application/json")
	public MonsterDTO getMonsterDetails(@PathVariable("name")  String monsterName) throws MonsterException {
		
		MonsterDTO dto = null;
		
		try {
			
			dto = DomainDTOMapper.converter.apply( repository.getOne(monsterName));
		}
		catch(Exception ex) {
			System.out.println("Something failed");
			ExceptionBean bean = new ExceptionBean("MONSTER_001", ex.getMessage());
			throw new MonsterException(bean);
		}
		
		return dto;
	}
	
	
}
