package com.springboot.musicAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.musicAPI.Entity.AlbumEntity;

public interface AlbumRepository extends JpaRepository<AlbumEntity, Integer> {

}
