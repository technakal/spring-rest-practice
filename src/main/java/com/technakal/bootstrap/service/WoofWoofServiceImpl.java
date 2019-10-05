package com.technakal.bootstrap.service;

import com.technakal.bootstrap.entity.WoofWoof;
import com.technakal.bootstrap.repository.WoofWoofRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WoofWoofServiceImpl implements WoofWoofService {

  @Autowired
  WoofWoofRepository woofWoofRepository;


  @Override
  public List<WoofWoof> retrieveAllWoofWoofs() {
    return (List<WoofWoof>)woofWoofRepository.findAll();
  }

  @Override
  public List<String> retrieveAllBreeds() {
    return woofWoofRepository.findAllBreed();
  }

  @Override
  public List<String> retrieveAllNames() {
    return woofWoofRepository.findAllName();
  }

  @Override
  public String retrieveBreedById(Long id) {
    return woofWoofRepository.findBreedById(id);
  }
}
