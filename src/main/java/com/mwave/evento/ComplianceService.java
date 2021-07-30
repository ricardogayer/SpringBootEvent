package com.mwave.evento;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ComplianceService {

    @Async
    @EventListener
    public void onEvent(ClienteEvent clienteEvent) {
        log.info("Recebendo um evento na classe ComplianceService...");
        Cliente cliente = clienteEvent.getCliente();
        log.info("Cliente: " + cliente.getNome());
    }

}
