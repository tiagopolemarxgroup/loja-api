package com.api.loja.service;

import com.api.loja.model.Categoria;
import com.api.loja.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public void salvar(){
        Categoria categoria = new Categoria(1L, "suplimentos");
        categoriaRepository.save(categoria);

    }
    public List<Categoria> listAll(){
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }
}
