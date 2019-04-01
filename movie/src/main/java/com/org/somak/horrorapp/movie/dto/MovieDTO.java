package com.org.somak.horrorapp.movie.dto;

import java.util.Date;
import java.util.List;

public class MovieDTO {

	private String movieName;
	private Date releaseDate;
	private Boolean launchedInDVD;
	private Boolean streaming;
	private String movieDescription;
	private List<String> movieTags;
	
	
	public MovieDTO() {
		super();
	}
	
	public MovieDTO(String movieName, Date releaseDate, Boolean launchedInDVD, Boolean streaming,
			String movieDescription, List<String> movieTags) {
		super();
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.launchedInDVD = launchedInDVD;
		this.streaming = streaming;
		this.movieDescription = movieDescription;
		this.movieTags = movieTags;
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
	public List<String> getMovieTags() {
		return movieTags;
	}
	public void setMovieTags(List<String> movieTags) {
		this.movieTags = movieTags;
	}
	
	
}
