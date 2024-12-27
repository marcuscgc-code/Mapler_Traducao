<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Recebe o código enviado pelo frontend
    $codigo = $_POST['codigo'];

    // Simula a execução do código
    $resultado = "Simulando execução do código:\n\n";
    $resultado .= "Código recebido:\n" . htmlspecialchars($codigo) . "\n\n";
    $resultado .= "Resultado:\nSoma: 15\n";

    // Retorna o resultado
    echo $resultado;
} else {
    echo "Método não permitido!";
}
?>
