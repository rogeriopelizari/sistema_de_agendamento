package com.example.agendamento.service;

import com.example.agendamento.entity.Agendamento;
import com.example.agendamento.entity.Cliente;
import com.example.agendamento.repository.AgendamentoRepository;
import com.example.agendamento.repository.ClienteRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;
import jakarta.ws.rs.WebApplicationException;
import java.util.List;

@ApplicationScoped
public class AgendamentoService {

    @Inject
    AgendamentoRepository agendamentoRepository;

    @Inject
    ClienteRepository clienteRepository;

    public List<Agendamento> listarTodos() {
        return agendamentoRepository.listAll();
    }

    @Transactional
    public Agendamento criar(Agendamento agendamento, Long clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId);
        if (cliente == null) {
            throw new WebApplicationException("Cliente não encontrado", 404);
        }

        // Evita loop de duplicidade (opcional, mas recomendado)
        agendamento.setCliente(cliente);
        agendamentoRepository.persist(agendamento);
        return agendamento;
    }
}