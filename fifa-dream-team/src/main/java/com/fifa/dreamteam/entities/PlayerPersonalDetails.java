package com.fifa.dreamteam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_personal_data")
public class PlayerPersonalDetails {
  @Id
  private Integer id;

  @Column(name = "Name")
  private String name;

  @Column(name = "Age")
  private Integer age;

  @Column(name = "Photo")
  private String photo;

  @Column(name = "Nationality")
  private String nationality;

  @Column(name = "Flag")
  private String flag;

  @Column(name = "Overall")
  private Integer overall;

  @Column(name = "Potential")
  private Integer potential;

  @Column(name = "Club")
  private String club;

  @Column(name = "Club_Logo")
  private String clubLogo;

  @Column(name = "Value")
  private String value;

  @Column(name = "Wage")
  private String wage;

  @Column(name = "Special")
  private Integer special;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public Integer getOverall() {
    return overall;
  }

  public void setOverall(Integer overall) {
    this.overall = overall;
  }

  public Integer getPotential() {
    return potential;
  }

  public void setPotential(Integer potential) {
    this.potential = potential;
  }

  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }

  public String getClubLogo() {
    return clubLogo;
  }

  public void setClubLogo(String clubLogo) {
    this.clubLogo = clubLogo;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getWage() {
    return wage;
  }

  public void setWage(String wage) {
    this.wage = wage;
  }

  public Integer getSpecial() {
    return special;
  }

  public void setSpecial(Integer special) {
    this.special = special;
  }
}
