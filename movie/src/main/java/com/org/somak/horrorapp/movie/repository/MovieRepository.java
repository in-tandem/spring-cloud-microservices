package com.org.somak.horrorapp.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.somak.horrorapp.movie.entity.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, String>{

}
