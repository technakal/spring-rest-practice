package com.technakal.bootstrap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WoofWoof {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private String breed;

  public WoofWoof() {}

  public WoofWoof(Long id, String name, String breed) {
    this.id = id;
    this.name = name;
    this.breed = breed;
  }

  public WoofWoof(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

}
