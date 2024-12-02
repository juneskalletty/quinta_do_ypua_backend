package pousadaQuintaDoYpua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pousadaQuintaDoYpua.model.Hospede;
import pousadaQuintaDoYpua.repository.HospedeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HospedeService {
    @Autowired
    private HospedeRepository hospedeRepository;

    public List<Hospede> listarTodos() {
        return hospedeRepository.findAll();
    }

    public Optional<Hospede> buscarPorId(Integer id) {
        return hospedeRepository.findById(id);
    }

    public void salvar(Hospede hospede) {
        hospedeRepository.save(hospede);
    }

    public void excluir(Integer id) {
        hospedeRepository.deleteById(id);
    }
}
