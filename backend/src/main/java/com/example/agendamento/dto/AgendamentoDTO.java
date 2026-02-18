package com.example.agendamento.dto;

import java.time.LocalDateTime;

public class AgendamentoDTO {

    private Long id;
    private String descricao;
    private LocalDateTime dataHora;
    private Long clienteId;

    // Construtor vazio
    public AgendamentoDTO() {}

    // Construtor completo
    public AgendamentoDTO(Long id, String descricao, LocalDateTime dataHora, Long clienteId) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.clienteId = clienteId;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }
}