package com.mwave.evento;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteService {

    private final ApplicationEventPublisher publisher;

    public Cliente saveCliente(Cliente cliente) {
        cliente.setId(100l);
        cliente.setNascimento(LocalDate.now());
        log.info("Salvando o cliente...");

        publisher.publishEvent(new ClienteEvent(cliente));

        return cliente;
    }

}
