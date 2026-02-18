import React from "react";
import Clientes from "./Clientes";
import Agendamentos from "./Agendamentos";

function App() {
  return (
    <div>
      <h1>Sistema de Agendamentos</h1>
      <Clientes />
      <Agendamentos />
    </div>
  );
}

export default App;