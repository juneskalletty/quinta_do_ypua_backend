package pousadaQuintaDoYpua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pousadaQuintaDoYpua.model.Reserva;
import pousadaQuintaDoYpua.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> listarTodos() {
        return reservaService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> buscarPorId(@PathVariable Integer id) {
        return reservaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reserva salvar(@RequestBody Reserva reserva) {
        reservaService.salvar(reserva);
        return reserva;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Integer id) {
        reservaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
