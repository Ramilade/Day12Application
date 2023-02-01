package sem3.day1_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sem3.day1_2.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
