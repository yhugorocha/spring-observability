package io.github.yhugorocha.observabilidade.service;

import io.github.yhugorocha.observabilidade.metrics.PedidoMetrics;
import io.github.yhugorocha.observabilidade.model.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class PedidoService {

    private static final Logger log = LoggerFactory.getLogger(PedidoService.class);
    private final PedidoMetrics pedidoMetrics;

    public PedidoService(PedidoMetrics pedidoMetrics) {
        this.pedidoMetrics = pedidoMetrics;
    }

    public Pedido criar(Pedido pedido) {
        log.info("Criando pedido {}", pedido.getDescricao());
        this.simularErroAleatorio();
        pedidoMetrics.incrementar();
        return pedido;
    }

    public Pedido buscar(Long id) {
        log.info("Buscando pedido {}", id);
        return new Pedido(id, "Pedido Teste");
    }

    private void simularErroAleatorio() {
        int chance = ThreadLocalRandom.current().nextInt(100);

        if (chance < 10) {
            throw new RuntimeException("Erro simulado para testes de observabilidade");
        }
    }
}