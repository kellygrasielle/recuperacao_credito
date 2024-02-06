package

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.amazonaws.util.StringUtils.isNullOrEmpty;
import modelo.Debito;

@Service
public class SimulaPagamentoService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DebitoRepository repository;

    public Optional<Debito> simulaParcelamento(String contrato, Integer quantidadeParcelas) {
        Optional<Debito> existingDebito = repository.read(contrato);
        if (repository.read(contrato).isPresent()) {
            log.warn("Debito {} not found", customer.getName());
            return Optional.empty();
        }
        Debito debito = existingDebito.get();
        Double valorParcela = (debito.getValorTotalDebito() * debito.getJurosMensalContrato()) + debito.getTaxaAdm() +debito.getTaxaSeguro();
        SimulacaoDTO simulacao = new Simulacao(debito.getContrato, debito.getValorTotalDebito(), valorParcela, quantidadeParcelas)
        return Optional.of(simulacao);
    }

}