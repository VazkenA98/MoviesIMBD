package IMDB;

import java.util.HashSet;

public class Movies {
    private String title;
    private String description;
    private int movieRating;
    private String premieredate;
    private Genre genre;
    private String actor;
    private String director;
    private String writor;
    private HashSet<String> actors;
    private HashSet<String> directors;
    private HashSet<String> writors;

    public Movies() {
        this.actors = new HashSet<String>();
        this.directors = new HashSet<String>();
        this.writors = new HashSet<String>();
    }

    public Movies(String title, String description,
                  int movieRating, String premieredate,
                  Genre genre, String actor, String director, String writor) {
        this.title = title;
        this.description = description;
        this.movieRating = movieRating;
        this.premieredate = premieredate;
        this.genre = genre;
        this.actor = actor;
        this.director = director;
        this.writor = writor;
        this.actors = new HashSet<String>();
        this.directors = new HashSet<String>();
        this.writors = new HashSet<String>();
        splitForHashSet(actor, director, writor);
    }

    public void splitForHashSet(String actor, String director, String writor) {
        String[] wordsActors = actor.split(",");
        String[] wordsDirectors = director.split(",");
        String[] wordsWtitors = writor.split(",");
        for (String w : wordsActors) {
            actors.add(w);
        }
        for (String w : wordsDirectors) {
            directors.add(w);
        }
        for (String w : wordsWtitors) {
            writors.add(w);
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public String getPremieredate() {
        return premieredate;
    }

    public void setPremieredate(String premieredate) {
        this.premieredate = premieredate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public HashSet<String> getActor() {
        return actors;
    }

    public void setActor(String actor) {
        this.actor = actor;
        actors.add(actor);
    }

    public HashSet<String> getDirector() {
        return directors;
    }

    public void setDirector(String director) {
        this.director = director;
        directors.add(director);
    }

    public HashSet<String> getWritor() {
        return writors;
    }

    public void setWritor(String writor) {
        this.writor = writor;
        writors.add(writor);
    }


    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + "\n" +
                ", description='" + description + "\n" +
                ", movieRating=" + movieRating + "\n" +
                ", premieredate='" + premieredate + "\n" +
                ", genre=" + genre + "\n" +
                ", actors=" + actors + "\n" +
                ", directors=" + directors + "\n" +
                ", writors=" + writors + "\n" +
                '}';
    }
}
