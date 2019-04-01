package com.org.somak.horrorapp.movie.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.somak.horrorapp.movie.config.MovieMicroServiceConfiguration;
import com.org.somak.horrorapp.movie.dto.MovieDTO;
import com.org.somak.horrorapp.movie.entity.DomainDTOMapper;
import com.org.somak.horrorapp.movie.exception.ExceptionBean;
import com.org.somak.horrorapp.movie.exception.MovieException;
import com.org.somak.horrorapp.movie.repository.MovieRepository;


@RestController
@RequestMapping("/core/movie")
public class MovieRegistryController {

	private static final String CLASS_NAME = MovieRegistryController.class.getName();
	
	@Autowired
	private MovieMicroServiceConfiguration configuration;
	
	@Autowired
	private MovieRepository repository;
	
	
	@RequestMapping(method=RequestMethod.GET, path="/getAll", produces=MediaType.APPLICATION_JSON)
	public List<MovieDTO> getAllMovies() throws MovieException{
		try {
			System.out.println(CLASS_NAME+" defaulttag value:"+configuration.getDefaulttag());
			
			return repository.findAll()
						.stream()
						.map(DomainDTOMapper.entityDTOConverter)
						.map((MovieDTO dto)->{
							if(dto.getMovieTags()==null) {
								dto.setMovieTags(Arrays.asList(configuration.getDefaulttag()));
								
							}
							return dto;
							}			
								
						)
						.collect(Collectors.toList());
		}
		catch(Exception e) {
			System.out.println("somethign failed in movie registry controller");
			throw new MovieException(new ExceptionBean("MOVIE_ERROR_01",e.getMessage()));
		}
	}
}
