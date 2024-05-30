package tech.buildrun.spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.spring_security.entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
