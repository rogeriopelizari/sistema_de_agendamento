import { useEffect, useState } from "react";

export default function Agendamentos() {
  const [agendamentos, setAgendamentos] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  // BASE URL do backend
  const API_BASE_URL = process.env.REACT_APP_API_URL || "http://localhost:8080";

  useEffect(() => {
    // Requisição de agendamentos
    fetch(`${API_BASE_URL}/agendamentos`)
      .then(res => {
        if (!res.ok) throw new Error("Erro ao buscar agendamentos");
        return res.json();
      })
      .then(data => setAgendamentos(data))
      .catch(err => setError(err.message))
      .finally(() => setLoading(false));
    }, [API_BASE_URL]);


    if (loading) return <p>Carregando...</p>;
  if (error) return <p style={{ color: "red" }}>Erro: {error}</p>;

  return (
    <div>
      <h2>Agendamentos</h2>
      <ul>
        {agendamentos.map(a => (
          <li key={a.id}>
            {a.descricao} - {new Date(a.dataHora).toLocaleString()} - Cliente: {a.cliente.nome}
          </li>
        ))}
      </ul>
    </div>
  );
}