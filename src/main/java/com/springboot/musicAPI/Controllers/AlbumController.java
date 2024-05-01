package com.springboot.musicAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springboot.musicAPI.Entity.AlbumEntity;
import com.springboot.musicAPI.Services.IAlbumServices;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    private IAlbumServices  servAlbum;

    @GetMapping("/albums")
    public List<AlbumEntity> buscarTodos(){
        return servAlbum.buscarTodos();
    }

    @PostMapping("/albums")
    public AlbumEntity guardar(@RequestBody AlbumEntity albumEntity){
        servAlbum.guardar(albumEntity);
        return albumEntity;
    }

    @PutMapping("/albums")
    public AlbumEntity actualizar(@RequestBody AlbumEntity albumEntity) {
        servAlbum.guardar(albumEntity);
        return albumEntity;
    }

    @DeleteMapping("/albums/{id}")
    public String eliminar(@PathVariable("id") int idAlbum) {
    	servAlbum.eliminar(idAlbum);
        return "Se ha borrado el álbum con ID: "+ idAlbum;
    }
}
