package com.fifa.dreamteam.services;

import com.fifa.dreamteam.entities.PlayerAttributeData;
import com.fifa.dreamteam.entities.PlayerPersonalDetails;
import com.fifa.dreamteam.entities.PlayerPositionData;
import com.fifa.dreamteam.repositories.PlayerAttributeDataRepository;
import com.fifa.dreamteam.repositories.PlayerPersonalDetailsRepository;
import com.fifa.dreamteam.repositories.PlayerPositionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
public class FifaDreamTeamServices {
  @Autowired
  private PlayerAttributeDataRepository playerAttributeDataRepository;

  @Autowired
  private PlayerPersonalDetailsRepository playerPersonalDetailsRepository;

  @Autowired
  private PlayerPositionDataRepository playerPositionDataRepository;

  public Map<String, Object> getPlayerInfoByName(Map<String, Object> request) {
    Map<String, Object> response = new HashMap<>();
    try {
      String name = request.get("name").toString();
      List<PlayerPersonalDetails> playerPersonalDetailsList = playerPersonalDetailsRepository.findByName(name);
      if(!CollectionUtils.isEmpty(playerPersonalDetailsList)) {
        Optional<PlayerAttributeData> playerAttributeData = playerAttributeDataRepository.findById(playerPersonalDetailsList.get(0).getId());
        Optional<PlayerPositionData> playerPositionData = playerPositionDataRepository.findById(playerPersonalDetailsList.get(0).getId());
        Map<String, Object> playerData = new HashMap<>();
        playerData.put("personalData", playerPersonalDetailsList.get(0));
        playerData.put("playerAttribute", playerAttributeData.orElse(null));
        playerData.put("playerPOsition", playerPositionData.orElse(null));
        response.put("status", 1);
        response.put("data", playerData);
      } else {
        response.put("status", 0);
        response.put("message", "No data found");
      }
    } catch (Exception e) {
      e.printStackTrace();
      response.put("status", 0);
      response.put("message", "Something went wrong");
    }
    return response;
  }

  public Map<String, Object> getPlayersListForClub(Map<String, Object> request) {
    Map<String, Object> response = new HashMap<>();
    try {
      String clubName = request.get("clubName").toString();
      List<Map<String, Object>> playersList = new ArrayList<>();
      List<PlayerPersonalDetails> playerPersonalDetailsList = playerPersonalDetailsRepository.findByClub(clubName);
      if(!CollectionUtils.isEmpty(playerPersonalDetailsList)) {
        for(PlayerPersonalDetails details: playerPersonalDetailsList) {
          Optional<PlayerAttributeData> playerAttributeData = playerAttributeDataRepository.findById(details.getId());
          Optional<PlayerPositionData> playerPositionData = playerPositionDataRepository.findById(details.getId());
          Map<String, Object> playerData = new HashMap<>();
          playerData.put("personalData", details);
          playerData.put("playerAttribute", playerAttributeData.orElse(null));
          playerData.put("playerPOsition", playerPositionData.orElse(null));
          playersList.add(playerData);
          playerData = null;
        }
        response.put("status", 1);
        response.put("playersList", playersList);
      } else {
        response.put("status", 0);
        response.put("message", "No data found");
      }
    } catch (Exception e) {
      e.printStackTrace();
      response.put("status", 0);
      response.put("message", "Something went wrong");
    }
    return response;
  }

}
