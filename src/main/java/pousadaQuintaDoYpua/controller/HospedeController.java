package pousadaQuintaDoYpua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pousadaQuintaDoYpua.model.Hospede;
import pousadaQuintaDoYpua.service.HospedeService;

import java.util.List;

@RestController
@RequestMapping("/api/hospedes")
public class HospedeController {

    @Autowired
    private HospedeService hospedeService;

    @GetMapping
    public List<Hospede> listarTodos() {
        return hospedeService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospede> buscarPorId(@PathVariable Integer id) {
        return hospedeService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Hospede salvar(@RequestBody Hospede hospede) {
        hospedeService.salvar(hospede);
        return hospede;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Integer id) {
        hospedeService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
