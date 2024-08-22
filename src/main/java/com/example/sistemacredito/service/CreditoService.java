package com.example.sistemacredito.service;

import com.example.sistemacredito.model.Cliente;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CreditoService {

    public int avaliarCredito(Cliente cliente) {
        int pontuacao = 0;

        //Criterio 1: Renda mensal

        if (cliente.getRendaMensal().compareTo(new BigDecimal("5000")) > 0) {
            pontuacao += 40;
        } else if (cliente.getRendaMensal().compareTo(new BigDecimal("2000")) < 0) {
            pontuacao += 20;
        } else {
            pontuacao += 10;
        }

        //Criterio 2: idade

        if (cliente.getIdade() > 30) {
            pontuacao += 30;
        } else if (cliente.getIdade() > 18) {
            pontuacao += 20;
        } else {
            pontuacao += 10;
        }

        // Critério 3: Histórico de Crédito

        if ("bom".equalsIgnoreCase(cliente.getHistoricoCredito())) {
            pontuacao += 30;
        } else if ("medio".equalsIgnoreCase(cliente.getHistoricoCredito())) {
            pontuacao += 20;
        } else {
            pontuacao += 10;
        }

        return pontuacao;
    }
}
