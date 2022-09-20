package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Filme;
import br.iesp.edu.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    public FilmeService service;

    @PostMapping
    public Filme salvar(Filme filme) {
        return service.salvar(filme);
    }

    @PutMapping
    public Filme atualizar(Filme filme) {
        return service.atualizar(filme);
    }

    @DeleteMapping
    public void excluir(Filme filme) {
        service.excluir(filme);
    }

    public List<Filme> listarFilme() {
        return service.listarFilmes();
    }
}
