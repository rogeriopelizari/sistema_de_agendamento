import { useEffect, useState } from "react";

export default function Clientes() {
  const [clientes, setClientes] = useState([]);

  useEffect(() => {
    // Faz a requisição para o backend
    fetch("http://localhost:8080/clientes")
      .then(res => res.json())
      .then(data => setClientes(data))
      .catch(err => console.error("Erro ao carregar clientes:", err));
  }, []); // [] = executa apenas uma vez ao carregar

  return (
    <div>
      <h2>Lista de Clientes</h2>
      <ul>
        {clientes.map(cliente => (
          <li key={cliente.id}>
            {cliente.nome} - {cliente.email}
          </li>
        ))}
      </ul>
    </div>
  );
}
