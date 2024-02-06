import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CONFLICT;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/v1")
public class SimulaPagamentoController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private SimulaPagamentoService service;

    @RequestMapping(path = "/simulapagamento/{contract}/{quantidadeparcelas}", method = RequestMethod.GET)
    public ResponseEntity<SimulacaoDTO> simulaParcelamento(@PathVariable String contrato, @PathVariable Integer quantidadeparcelas) {

        log.trace("Entering simulacao");
        SimulacaoDTO simulacao = service.simulaParcelamento(contrato, quantidadeParcelas);
        if (simulacao.isEmpty()) {
            return new ResponseEntity<>(NO_CONTENT);
        }
        return new ResponseEntity<SimulacaoDTO>(simulacao, OK);
    }




}