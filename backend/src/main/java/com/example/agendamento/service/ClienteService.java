package com.example.agendamento.service;

import com.example.agendamento.entity.Cliente;
import com.example.agendamento.repository.ClienteRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.listAll();
    }

    @Transactional
    public Cliente criar(Cliente cliente) {
        clienteRepository.persist(cliente);
        return cliente;
    }
}