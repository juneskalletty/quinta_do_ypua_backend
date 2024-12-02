package pousadaQuintaDoYpua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pousadaQuintaDoYpua.model.Acomodacao;
import pousadaQuintaDoYpua.repository.AcomodacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AcomodacaoService {
    @Autowired
    private AcomodacaoRepository acomodacaoRepository;

    public List<Acomodacao> listarTodos() {
        return acomodacaoRepository.findAll();
    }

    public Optional<Acomodacao> buscarPorId(Integer id) {
        return acomodacaoRepository.findById(id);
    }

    public void salvar(Acomodacao acomodacao) {
        acomodacaoRepository.save(acomodacao);
    }

    public void excluir(Integer id) {
        acomodacaoRepository.deleteById(id);
    }
}
