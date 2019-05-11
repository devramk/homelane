package com.fifa.dreamteam.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_attribute_data")
public class PlayerAttributeData {

  private Long acceleration;
  private Long aggression;
  private Long agility;
  private Long balance;
  private Long ballControl;
  private Long composure;
  private Long crossing;
  private Long curve;
  private Long dribbling;
  private Long finishing;
  private Long freeKickAccuracy;
  private Long gkDiving;
  private Long gkHandling;
  private Long gkKicking;
  private Long gkPositioning;
  private Long gkReflexes;
  private Long headingAccuracy;
  @Id
  private Integer id;
  private Long interceptions;
  private Long jumping;
  private Long longPassing;
  private Long longShots;
  private Long marking;
  private Long penalties;
  private Long positioning;
  private Long reactions;
  private Long shortPassing;
  private Long shotPower;
  private Long slidingTackle;
  private Long sprintSpeed;
  private Long stamina;
  private Long standingTackle;
  private Long strength;
  private Long vision;
  private Long volleys;


  public Long getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(Long acceleration) {
    this.acceleration = acceleration;
  }


  public Long getAggression() {
    return aggression;
  }

  public void setAggression(Long aggression) {
    this.aggression = aggression;
  }


  public Long getAgility() {
    return agility;
  }

  public void setAgility(Long agility) {
    this.agility = agility;
  }


  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public Long getBallControl() {
    return ballControl;
  }

  public void setBallControl(Long ballControl) {
    this.ballControl = ballControl;
  }


  public Long getComposure() {
    return composure;
  }

  public void setComposure(Long composure) {
    this.composure = composure;
  }


  public Long getCrossing() {
    return crossing;
  }

  public void setCrossing(Long crossing) {
    this.crossing = crossing;
  }


  public Long getCurve() {
    return curve;
  }

  public void setCurve(Long curve) {
    this.curve = curve;
  }


  public Long getDribbling() {
    return dribbling;
  }

  public void setDribbling(Long dribbling) {
    this.dribbling = dribbling;
  }


  public Long getFinishing() {
    return finishing;
  }

  public void setFinishing(Long finishing) {
    this.finishing = finishing;
  }


  public Long getFreeKickAccuracy() {
    return freeKickAccuracy;
  }

  public void setFreeKickAccuracy(Long freeKickAccuracy) {
    this.freeKickAccuracy = freeKickAccuracy;
  }


  public Long getGkDiving() {
    return gkDiving;
  }

  public void setGkDiving(Long gkDiving) {
    this.gkDiving = gkDiving;
  }


  public Long getGkHandling() {
    return gkHandling;
  }

  public void setGkHandling(Long gkHandling) {
    this.gkHandling = gkHandling;
  }


  public Long getGkKicking() {
    return gkKicking;
  }

  public void setGkKicking(Long gkKicking) {
    this.gkKicking = gkKicking;
  }


  public Long getGkPositioning() {
    return gkPositioning;
  }

  public void setGkPositioning(Long gkPositioning) {
    this.gkPositioning = gkPositioning;
  }


  public Long getGkReflexes() {
    return gkReflexes;
  }

  public void setGkReflexes(Long gkReflexes) {
    this.gkReflexes = gkReflexes;
  }


  public Long getHeadingAccuracy() {
    return headingAccuracy;
  }

  public void setHeadingAccuracy(Long headingAccuracy) {
    this.headingAccuracy = headingAccuracy;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Long getInterceptions() {
    return interceptions;
  }

  public void setInterceptions(Long interceptions) {
    this.interceptions = interceptions;
  }


  public Long getJumping() {
    return jumping;
  }

  public void setJumping(Long jumping) {
    this.jumping = jumping;
  }


  public Long getLongPassing() {
    return longPassing;
  }

  public void setLongPassing(Long LongPassing) {
    this.longPassing = LongPassing;
  }


  public Long getLongShots() {
    return longShots;
  }

  public void setLongShots(Long LongShots) {
    this.longShots = LongShots;
  }


  public Long getMarking() {
    return marking;
  }

  public void setMarking(Long marking) {
    this.marking = marking;
  }


  public Long getPenalties() {
    return penalties;
  }

  public void setPenalties(Long penalties) {
    this.penalties = penalties;
  }


  public Long getPositioning() {
    return positioning;
  }

  public void setPositioning(Long positioning) {
    this.positioning = positioning;
  }


  public Long getReactions() {
    return reactions;
  }

  public void setReactions(Long reactions) {
    this.reactions = reactions;
  }


  public Long getShortPassing() {
    return shortPassing;
  }

  public void setShortPassing(Long shortPassing) {
    this.shortPassing = shortPassing;
  }


  public Long getShotPower() {
    return shotPower;
  }

  public void setShotPower(Long shotPower) {
    this.shotPower = shotPower;
  }


  public Long getSlidingTackle() {
    return slidingTackle;
  }

  public void setSlidingTackle(Long slidingTackle) {
    this.slidingTackle = slidingTackle;
  }


  public Long getSprintSpeed() {
    return sprintSpeed;
  }

  public void setSprintSpeed(Long sprintSpeed) {
    this.sprintSpeed = sprintSpeed;
  }


  public Long getStamina() {
    return stamina;
  }

  public void setStamina(Long stamina) {
    this.stamina = stamina;
  }


  public Long getStandingTackle() {
    return standingTackle;
  }

  public void setStandingTackle(Long standingTackle) {
    this.standingTackle = standingTackle;
  }


  public Long getStrength() {
    return strength;
  }

  public void setStrength(Long strength) {
    this.strength = strength;
  }


  public Long getVision() {
    return vision;
  }

  public void setVision(Long vision) {
    this.vision = vision;
  }


  public Long getVolleys() {
    return volleys;
  }

  public void setVolleys(Long volleys) {
    this.volleys = volleys;
  }

}
