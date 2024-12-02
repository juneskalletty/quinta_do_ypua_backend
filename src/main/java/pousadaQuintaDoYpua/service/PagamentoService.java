package pousadaQuintaDoYpua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pousadaQuintaDoYpua.model.Pagamento;
import pousadaQuintaDoYpua.repository.PagamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }

    public Optional<Pagamento> buscarPorId(Integer id) {
        return pagamentoRepository.findById(id);
    }

    public void salvar(Pagamento pagamento) {
        pagamentoRepository.save(pagamento);
    }

    public void excluir(Integer id) {
        pagamentoRepository.deleteById(id);
    }
}
