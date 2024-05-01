package com.springboot.musicAPI.Services.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.musicAPI.Entity.AlbumEntity;
import com.springboot.musicAPI.Repository.AlbumRepository;
import com.springboot.musicAPI.Services.IAlbumServices;

@Service
public class AlbumServices implements  IAlbumServices{

    @Autowired
    private AlbumRepository repoAlbum;

    @Override
    public List<AlbumEntity> buscarTodos() {
        return repoAlbum.findAll();
    }

    @Override
    public void guardar(AlbumEntity albumEntity) {
        repoAlbum.save(albumEntity);
    }

    @Override
    public void eliminar(int idAlbum) {
        repoAlbum.deleteById(idAlbum);
    }

}
