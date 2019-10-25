package be.thomasmore.team14.player.repository;

import be.thomasmore.team14.player.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Player findPlayerByGamerTag(@Param("gamerTag") String gamerTag);
    Player findPlayerByRealName(@Param("realName") String realName);
}
