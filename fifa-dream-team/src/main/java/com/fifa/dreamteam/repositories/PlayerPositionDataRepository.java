package com.fifa.dreamteam.repositories;

import com.fifa.dreamteam.entities.PlayerPositionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerPositionDataRepository extends JpaRepository<PlayerPositionData, Integer> {
}
