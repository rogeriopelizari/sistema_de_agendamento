# Meu App

Descrição curta do projeto:
> Aplicação fullstack com backend em Node.js e frontend em React, pronta para rodar com Docker ou localmente.

---

## 🏗 Estrutura do Projeto

meu-app/
├─ backend/ # Backend Node.js
├─ frontend/ # Frontend React
├─ docker-compose.yml
├─ README.md


---

## ⚡ Tecnologias

- Backend: Node.js, Express, Sequelize/Mongoose
- Frontend: React, Vite/Create React App
- Banco de dados: PostgreSQL/MySQL/MongoDB
- Docker & Docker Compose

---

## 🚀 Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- [Node.js](https://nodejs.org/) (>=18)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

---

## 🔧 Configuração do ambiente

1. Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
cd meu-app

---

2. Copie os arquivos de exemplo .env para criar os seus:

cp backend/.env.example backend/.env
cp frontend/.env.example frontend/.env

---

3. Preencha os valores de acordo com seu ambiente local:
# backend/.env
DB_HOST=localhost
DB_USER=root
DB_PASSWORD=1234
DB_NAME=meu_app

# frontend/.env
REACT_APP_API_URL=http://localhost:5000

⚠️ Nunca compartilhe o arquivo .env real no repositório

---

🐳 Rodando com Docker

Construir e subir os containers:

docker-compose up --build

Acesse o frontend em: http://localhost:3000
O backend estará disponível em: http://localhost:5000

Para parar os containers:
docker-compose down

---

💻 Rodando sem Docker
Backend:
cd backend
npm install
npm run dev

Frontend:
cd frontend
npm install
npm start


Certifique-se de que as variáveis do .env estão configuradas corretamente.

---

📝 Scripts úteis
Comando	Descrição

npm install	Instala dependências
npm start	Roda o projeto em modo produção
npm run dev	Roda o projeto em modo desenvolvimento

docker-compose up --build	Roda toda a stack com Docker
docker-compose down	Para a stack

📄 Estrutura de variáveis de ambiente
Backend (.env)
DB_HOST=
DB_USER=
DB_PASSWORD=
DB_NAME=
PORT=

Frontend (.env)
REACT_APP_API_URL=

---

🤝 Contribuindo
1. Fork este repositório
2. Crie uma branch: git checkout -b feature/nova-funcionalidade
3. Commit suas alterações: git commit -m "Adiciona nova funcionalidade"
4. Push para a branch: git push origin feature/nova-funcionalidade
5. Abra um Pull Request
>>>>>>> 83e8d4c (Estrutura inicial da app)
