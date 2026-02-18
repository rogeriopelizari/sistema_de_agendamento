package com.example.agendamento.repository;

import com.example.agendamento.entity.Agendamento;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AgendamentoRepository implements PanacheRepository<Agendamento> {}
