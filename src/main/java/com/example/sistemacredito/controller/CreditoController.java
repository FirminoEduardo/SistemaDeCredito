package com.example.sistemacredito.controller;

import com.example.sistemacredito.model.Cliente;
import com.example.sistemacredito.service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/credito")
public class CreditoController {

    @Autowired
    CreditoService creditoService;

    @PostMapping("/avaliar")
    public int avaliar(@RequestBody Cliente cliente) {
        return creditoService.avaliarCredito(cliente);
    }
}
