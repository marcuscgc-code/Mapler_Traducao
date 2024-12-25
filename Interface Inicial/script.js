// Script para ativar o terminal e simular a execução do código
const executarBtn = document.getElementById("executar-btn");
const terminal = document.getElementById("terminal");
const terminalLog = document.getElementById("terminal-log");

executarBtn.addEventListener("click", () => {
  // Exibe o terminal
  terminal.style.display = "block";
//teste
  // Simula o processamento de código
  terminalLog.innerHTML = ""; // Limpa o log anterior
  logResultado("Executando código...");
  setTimeout(() => {
    logResultado("Resultado: a = 10, b = 5");
  }, 1000);
});

// Função para adicionar mensagens ao terminal
function logResultado(mensagem) {
  const linha = document.createElement("div");
  linha.textContent = mensagem;
  terminalLog.appendChild(linha);
}
