package sem3.day1_2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sem3.day1_2.entity.Player;
import sem3.day1_2.repositories.PlayerRepository;

@RestController
@RequestMapping("/api/players")
public class PlayerController {


  PlayerRepository playerRepository;


  public PlayerController(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }


  @GetMapping
  Iterable<Player> getPlayers() {
    var players =  playerRepository.findAll();
    return players;
  }
}
