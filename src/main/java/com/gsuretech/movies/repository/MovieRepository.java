package com.gsuretech.movies.repository;

import com.gsuretech.movies.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMoviesByImdbId(String imdbId);

    Movie findMovieByTitle(String title);
}
