package pousadaQuintaDoYpua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pousadaQuintaDoYpua.model.Acomodacao;
import pousadaQuintaDoYpua.service.AcomodacaoService;

import java.util.List;

@RestController
@RequestMapping("/api/acomodacoes")
public class AcomodacaoController {

    @Autowired
    private AcomodacaoService acomodacaoService;

    @GetMapping
    public List<Acomodacao> listarTodos() {
        return acomodacaoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Acomodacao> buscarPorId(@PathVariable Integer id) {
        return acomodacaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Acomodacao salvar(@RequestBody Acomodacao acomodacao) {
        acomodacaoService.salvar(acomodacao);
        return acomodacao;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Integer id) {
        acomodacaoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
