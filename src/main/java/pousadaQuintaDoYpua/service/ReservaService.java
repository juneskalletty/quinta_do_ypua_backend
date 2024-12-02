package pousadaQuintaDoYpua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pousadaQuintaDoYpua.model.Reserva;
import pousadaQuintaDoYpua.repository.ReservaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listarTodos() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> buscarPorId(Integer id) {
        return reservaRepository.findById(id);
    }

    public void salvar(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    public void excluir(Integer id) {
        reservaRepository.deleteById(id);
    }
}
