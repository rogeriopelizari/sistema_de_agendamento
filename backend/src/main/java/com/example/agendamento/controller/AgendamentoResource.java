package com.example.agendamento.controller;

import com.example.agendamento.entity.Agendamento;
import com.example.agendamento.service.AgendamentoService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/agendamentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AgendamentoResource {

    @Inject
    AgendamentoService agendamentoService;

    // GET /agendamentos
    @GET
    public List<Agendamento> getAll() {
        return agendamentoService.listarTodos();
    }

    // POST /agendamentos?clienteId=1
    @POST
    public Agendamento create(@QueryParam("clienteId") Long clienteId, Agendamento agendamento) {
        return agendamentoService.criar(agendamento, clienteId);
    }
}
