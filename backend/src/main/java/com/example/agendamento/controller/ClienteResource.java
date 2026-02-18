package com.example.agendamento.controller;

import com.example.agendamento.entity.Cliente;
import com.example.agendamento.service.ClienteService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    ClienteService clienteService;

    // GET /clientes
    @GET
    public List<Cliente> getAll() {
        return clienteService.listarTodos();
    }

    // POST /clientes
    @POST
    public Cliente create(Cliente cliente) {
        return clienteService.criar(cliente);
    }
}
