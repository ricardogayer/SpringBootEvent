package com.mwave.evento;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
@Log4j2
@AllArgsConstructor
public class ClienteController {

    private ClienteService clienteService;

    @PostMapping("cliente")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        log.info("Antes da chamada do ClienteService");
        Cliente c = clienteService.saveCliente(cliente);
        log.info("Depois da chamado do ClienteService");
        return c;
    }


}
