package br.com.mercadolivre.controller;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadolivre.modelo.Produto;
import br.com.mercadolivre.request.ImagemRequest;
import br.com.mercadolivre.request.UploaderFake;


@RestController
@RequestMapping("/produtos")
public class ImagemProdutoController {

    @PersistenceContext
    private EntityManager manager;

    @Autowired
    private UploaderFake uploaderFake;

    @PostMapping("/{id}/imagem")
    @Transactional
    public ResponseEntity<?> adicionarImagens(@PathVariable("id") Long id,
                                                            @Valid ImagemRequest form) {

        Produto produto = manager.find(Produto.class, id);

        if(!produto.pertenceAoClienteLogado()) {
            return ResponseEntity.badRequest().build();
        }

        Set<String> links = uploaderFake.envia(form.getImagens());

        produto.associaImagens(links);

        manager.merge(produto);

        return (ResponseEntity<?>) ResponseEntity.ok();
    }
}