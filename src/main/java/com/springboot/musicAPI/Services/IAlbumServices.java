package com.springboot.musicAPI.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.musicAPI.Entity.AlbumEntity;
@Service
public interface IAlbumServices {
    List<AlbumEntity> buscarTodos();
    void guardar(AlbumEntity albumEntity);
    void eliminar(int idAlbum);
}
