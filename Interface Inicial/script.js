// Script para ativar o terminal e simular a execução do código
const executarBtn = document.getElementById("executar-btn");
const terminal = document.getElementById("terminal");
const terminalLog = document.getElementById("terminal-log");
theme: "monokai",

executarBtn.addEventListener("click", () => {
  // Exibe o terminal
  terminal.style.display = "block";

  // Obtém o código do editor
  const codigo = codeEditor.getValue(); // Para o CodeMirror

  // Limpa o log anterior
  terminalLog.innerHTML = "";
  logResultado("Executando código...");

  // Envia o código para o backend (PHP)
  fetch("seu-script.php", {
    method: "POST",
    headers: {
      "Content-Type": "application/x-www-form-urlencoded",
    },
    body: new URLSearchParams({
      codigo: codigo, // Envia o código no corpo da requisição
    }),
  })
    .then((response) => {
      if (!response.ok) throw new Error("Erro ao se comunicar com o servidor.");
      return response.text(); // Lê a resposta do servidor como texto
    })
    .then((resultado) => {
      logResultado(resultado); // Mostra o resultado retornado no terminal
    })
    .catch((error) => {
      logResultado(`Erro: ${error.message}`);
    });
});

// Função para adicionar mensagens ao terminal
function logResultado(mensagem) {
  const linha = document.createElement("div");
  linha.textContent = mensagem;
  terminalLog.appendChild(linha);
}

// Inicializando o CodeMirror no textarea
const codeEditor = CodeMirror.fromTextArea(document.getElementById("code-area"), {
  lineNumbers: true, // Mostra os números das linhas
  mode: "javascript", // Define a linguagem para destacar
  theme: "monokai", // Tema para o editor
  tabSize: 2, // Tamanho do tab
});
