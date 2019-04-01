package com.org.somak.horrorapp.movie.entity;

import java.util.function.Function;

import com.org.somak.horrorapp.movie.dto.MovieDTO;

public class DomainDTOMapper {

	public static final Function<MovieEntity, MovieDTO> entityDTOConverter = (entity) -> {
		return new MovieDTO(entity.getMovieName(),

				entity.getReleaseDate(),
				
				entity.getLaunchedInDVD(),
				
				entity.getStreaming(),
				
				entity.getMovieDescription(),
				null
				);

	};

	public static final Function<MovieDTO, MovieEntity> dtoEntityConverter = (dto) -> {

		return new MovieEntity(dto.getMovieName(),

				dto.getReleaseDate(),
				
				dto.getLaunchedInDVD(),
				
				dto.getStreaming(),
				
				dto.getMovieDescription()
				);

	};

}
