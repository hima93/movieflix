package io.egen.app.entity;
import javax.persistence.*;



import java.util.List;
import java.util.UUID;

@Entity
@Table
@NamedQueries({ @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m ORDER BY m.title ASC"),
	
     	@NamedQuery(name = "Movie.findTopMovies", query = "SELECT TOP(10) FROM Movie m  WHERE m.type=:ptype order by m.imdbRating DESC"),
    	@NamedQuery(name = "Movie.findTopTvSeries", query = "SELECT TOP(10) FROM Movie m  WHERE m.type=:ptype order by m.imdbRating DESC"),
    	@NamedQuery(name = "Movie.findByType", query = "SELECT m FROM Movie m WHERE m.year=:ptype"),
		@NamedQuery(name = "Movie.findByYear", query = "SELECT m FROM Movie m WHERE m.year=:pYear"),
		@NamedQuery(name = "Movie.findById", query = "SELECT m FROM Movie m WHERE m.id=:pId"),
		@NamedQuery(name = "Movie.sortByYear", query = "Select m from Movie m order by m.year DESC"),
		@NamedQuery(name = "Movie.sortByimdbRating", query = "Select m from Movie m order by m.imdbRating DESC"),
		@NamedQuery(name = "Movie.sortByimdbVotes", query = "Select m from Movie m order by m.imdbVotes DESC")
	
})
public class Movie {


	@Id
	private String id;

	private String title;
	private int year;
	private String rated;
	private String released;
	private String runTime;
	
	@ManyToMany
	private List<Genre> genre;
	private String director;
	
	@ManyToMany
	private List<Writer> writer;
	
	@ManyToMany
	private List<Actor> Actor;
		
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String poster;
	private int metascore;
	private float imdbRating;
	private double imdbVotes;
	private String imdbID;
	private String type;
	

	public Movie()
	{
		id = UUID.randomUUID().toString();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getRated() {
		return rated;
	}


	public void setRated(String rated) {
		this.rated = rated;
	}


	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}


	public String getRunTime() {
		return runTime;
	}


	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

	public List<Genre> getGenre() {
		return genre;
	}


	public void setGenre(List<Genre> genre) {
		this.genre = genre;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public List<Writer> getWriter() {
		return writer;
	}

	public void setWriter(List<Writer> writer) {
		this.writer = writer;
	}

	public List<Actor> getActor() {
		return Actor;
	}

	public void setActor(List<Actor> actor) {
		Actor = actor;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}


	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getMetascore() {
		return metascore;
	}
	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}
	public float getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(float imdbRating) {
		this.imdbRating = imdbRating;
	}
	public double getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(double imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", rated=" + rated + ", released=" + released
				+ ", runTime=" + runTime + ", genre=" + genre + ", director=" + director + ", writer=" + writer
				+ ", Actor=" + Actor + ", plot=" + plot + ", language=" + language + ", country=" + country
				+ ", awards=" + awards + ", poster=" + poster + ", metascore=" + metascore + ", imdbRating="
				+ imdbRating + ", imdbVotes=" + imdbVotes + ", imdbID=" + imdbID + ", type=" + type + "]";
	}
	
	
}