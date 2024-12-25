<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Recebe o código enviado pelo frontend
    $codigo = $_POST['codigo'];

    // Simula a execução do código em Portugol (você pode integrar um interpretador real aqui)
    // Aqui, retornamos um exemplo fixo
    $resultado = "Simulando execução do código:\n\n";
    $resultado .= "Código recebido:\n" . $codigo . "\n\n";
    $resultado .= "Resultado:\nSoma: 15\n";

    // Retorna o resultado como resposta
    echo $resultado;
} else {
    echo "Método não permitido!";
}
?>
