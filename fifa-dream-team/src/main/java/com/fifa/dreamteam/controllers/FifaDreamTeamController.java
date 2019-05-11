package com.fifa.dreamteam.controllers;

import com.fifa.dreamteam.services.FifaDreamTeamServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/dreamTeam")
public class FifaDreamTeamController {
  @Autowired
  private FifaDreamTeamServices fifaDreamTeamServices;

  @PostMapping(value = "/get/player")
  public Map<String, Object> getPlayerInfoByName(@RequestBody Map<String, Object> request) {
    return fifaDreamTeamServices.getPlayerInfoByName(request);
  }

  @PostMapping(value = "/list/club/players")
  public Map<String, Object> getClubPlayersList(@RequestBody Map<String, Object> request) {
    return fifaDreamTeamServices.getPlayersListForClub(request);
  }
}
