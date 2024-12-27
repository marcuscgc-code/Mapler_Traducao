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

const editor = document.getElementById("editor");

// Padrões de destaque (palavras-chave, variáveis, números, etc.)
const patterns = {
  keyword: /\b(variaveis|inicio|fim|inteiro|real|booleano)\b/g,
  var: /\b[a-zA-Z_]\w*\b/g,
  number: /\b\d+\b/g,
  type: /\b(inteiro|real|booleano)\b/g,
};

// Função para realçar o texto
function highlightSyntax(text) {
  let highlightedText = text
    .replace(patterns.keyword, '<span class="keyword">$1</span>')
    .replace(patterns.type, '<span class="type">$1</span>')
    .replace(patterns.number, '<span class="number">$&</span>')
    .replace(patterns.var, '<span class="var">$&</span>');
  return highlightedText;
}

// Evento para atualizar o realce enquanto o usuário digita
editor.addEventListener("input", () => {
  const text = editor.textContent; // Obtém o texto puro do editor
  const highlightedText = highlightSyntax(text);

  // Atualiza o editor com o texto realçado
  editor.innerHTML = highlightedText;

  // Move o cursor para o final
  moveCaretToEnd(editor);
});

// Função para mover o cursor para o final do texto
function moveCaretToEnd(element) {
  const range = document.createRange();
  const selection = window.getSelection();
  range.selectNodeContents(element);
  range.collapse(false);
  selection.removeAllRanges();
  selection.addRange(range);
}

// Inicializando o CodeMirror no textarea
const codeEditor = CodeMirror.fromTextArea(document.getElementById("code-area"), {
  lineNumbers: true, // Mostra os números das linhas
  mode: "javascript", // Define a linguagem para destacar (exemplo: JavaScript)
  theme: "monokai", // Define um tema para o editor
  tabSize: 2, // Tamanho do tab
});

// Para capturar o conteúdo do editor
document.getElementById("executar-btn").addEventListener("click", () => {
  const codigo = codeEditor.getValue(); // Obtém o código digitado
  console.log(codigo); // Exibe no console (ou envie para seu terminal)
});


require.config({ paths: { vs: "https://unpkg.com/monaco-editor@latest/min/vs" } });

require(["vs/editor/editor.main"], function () {
  const editor = monaco.editor.create(document.getElementById("editor-container"), {
    value: `variaveis\n  a, b: inteiro;\n\ninicio\n  a <- 10;\n  b <- 5;\nfim`,
    language: "javascript", // Altere para sua linguagem (ex: "python", "html", etc.)
    theme: "vs-dark", // Tema escuro
  });

  // Capturando o código digitado
  document.getElementById("executar-btn").addEventListener("click", () => {
    const codigo = editor.getValue();
    console.log(codigo); // Exibe no console (ou envie para o terminal)
  });
});
