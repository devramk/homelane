package com.fifa.dreamteam.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_position_data")
public class PlayerPositionData {

  private Long cam;
  private Long cb;
  private Long cdm;
  private Long cf;
  private Long cm;
  @Id
  private Integer id;
  private Long lam;
  private Long lb;
  private Long lcb;
  private Long lcm;
  private Long ldm;
  private Long lf;
  private Long lm;
  private Long ls;
  private Long lw;
  private Long lwb;
  private String preferredPositions;
  private Long ram;
  private Long rb;
  private Long rcb;
  private Long rcm;
  private Long rdm;
  private Long rf;
  private Long rm;
  private Long rs;
  private Long rw;
  private Long rwb;
  private Long st;


  public Long getCam() {
    return cam;
  }

  public void setCam(Long cam) {
    this.cam = cam;
  }


  public Long getCb() {
    return cb;
  }

  public void setCb(Long cb) {
    this.cb = cb;
  }


  public Long getCdm() {
    return cdm;
  }

  public void setCdm(Long cdm) {
    this.cdm = cdm;
  }


  public Long getCf() {
    return cf;
  }

  public void setCf(Long cf) {
    this.cf = cf;
  }


  public Long getCm() {
    return cm;
  }

  public void setCm(Long cm) {
    this.cm = cm;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Long getLam() {
    return lam;
  }

  public void setLam(Long lam) {
    this.lam = lam;
  }


  public Long getLb() {
    return lb;
  }

  public void setLb(Long lb) {
    this.lb = lb;
  }


  public Long getLcb() {
    return lcb;
  }

  public void setLcb(Long lcb) {
    this.lcb = lcb;
  }


  public Long getLcm() {
    return lcm;
  }

  public void setLcm(Long lcm) {
    this.lcm = lcm;
  }


  public Long getLdm() {
    return ldm;
  }

  public void setLdm(Long ldm) {
    this.ldm = ldm;
  }


  public Long getLf() {
    return lf;
  }

  public void setLf(Long lf) {
    this.lf = lf;
  }


  public Long getLm() {
    return lm;
  }

  public void setLm(Long lm) {
    this.lm = lm;
  }


  public Long getLs() {
    return ls;
  }

  public void setLs(Long ls) {
    this.ls = ls;
  }


  public Long getLw() {
    return lw;
  }

  public void setLw(Long lw) {
    this.lw = lw;
  }


  public Long getLwb() {
    return lwb;
  }

  public void setLwb(Long lwb) {
    this.lwb = lwb;
  }


  public String getPreferredPositions() {
    return preferredPositions;
  }

  public void setPreferredPositions(String preferredPositions) {
    this.preferredPositions = preferredPositions;
  }


  public Long getRam() {
    return ram;
  }

  public void setRam(Long ram) {
    this.ram = ram;
  }


  public Long getRb() {
    return rb;
  }

  public void setRb(Long rb) {
    this.rb = rb;
  }


  public Long getRcb() {
    return rcb;
  }

  public void setRcb(Long rcb) {
    this.rcb = rcb;
  }


  public Long getRcm() {
    return rcm;
  }

  public void setRcm(Long rcm) {
    this.rcm = rcm;
  }


  public Long getRdm() {
    return rdm;
  }

  public void setRdm(Long rdm) {
    this.rdm = rdm;
  }


  public Long getRf() {
    return rf;
  }

  public void setRf(Long rf) {
    this.rf = rf;
  }


  public Long getRm() {
    return rm;
  }

  public void setRm(Long rm) {
    this.rm = rm;
  }


  public Long getRs() {
    return rs;
  }

  public void setRs(Long rs) {
    this.rs = rs;
  }


  public Long getRw() {
    return rw;
  }

  public void setRw(Long rw) {
    this.rw = rw;
  }


  public Long getRwb() {
    return rwb;
  }

  public void setRwb(Long rwb) {
    this.rwb = rwb;
  }


  public Long getSt() {
    return st;
  }

  public void setSt(Long st) {
    this.st = st;
  }

}
