<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $codigo = $_POST['codigo']; // Recebe o código do cliente
    $arquivo = "codigo.por"; // Salva o código em um arquivo
    file_put_contents($arquivo, $codigo);

    // Executa o código usando o interpretador do Portugol (ajuste o comando conforme o ambiente)
    $output = shell_exec("java -jar PortugolStudio.jar $arquivo 2>&1");

    // Retorna o resultado como JSON
    echo json_encode(["saida" => $output]);
    exit;
}
?>
