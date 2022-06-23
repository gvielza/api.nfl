package apinfl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import apinfl.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
