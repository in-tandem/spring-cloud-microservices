package com.org.somak.horrorapp.movie.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_movie")
public class MovieEntity {

	@Id
	@Column(name="name")
	private String movieName;
	
	@Column(name="release_date")
	private Date releaseDate;
	
	@Column(name="in_dvd")
	private Boolean launchedInDVD;
	
	@Column(name="in_streaming")
	private Boolean streaming;
	
	@Column(name="description")
	private String movieDescription;
	
	
	public MovieEntity() {
		super();
	}
	
	public MovieEntity(String movieName, Date releaseDate, Boolean launchedInDVD, Boolean streaming,
			String movieDescription) {
		super();
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.launchedInDVD = launchedInDVD;
		this.streaming = streaming;
		this.movieDescription = movieDescription;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Boolean getLaunchedInDVD() {
		return launchedInDVD;
	}
	public void setLaunchedInDVD(Boolean launchedInDVD) {
		this.launchedInDVD = launchedInDVD;
	}
	public Boolean getStreaming() {
		return streaming;
	}
	public void setStreaming(Boolean streaming) {
		this.streaming = streaming;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	
	
	
}

