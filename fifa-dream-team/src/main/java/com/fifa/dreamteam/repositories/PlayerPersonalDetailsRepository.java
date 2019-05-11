package com.fifa.dreamteam.repositories;

import com.fifa.dreamteam.entities.PlayerPersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerPersonalDetailsRepository extends JpaRepository<PlayerPersonalDetails, Integer> {
  List<PlayerPersonalDetails> findByName(String name);
  List<PlayerPersonalDetails> findByClub(String club);
}
