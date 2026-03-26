package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.voting_system.model.Votes;

public interface VotesRepository extends JpaRepository<Votes, Long> {

}
