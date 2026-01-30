package io.github.yhugorocha.observabilidade.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class PedidoMetrics {

    private final Counter pedidosCriados;

    public PedidoMetrics(MeterRegistry registry) {
        this.pedidosCriados = Counter.builder("pedidos_criados_total")
                .description("Total de pedidos criados")
                .register(registry);
    }

    public void incrementar() {
        pedidosCriados.increment();
    }
}
