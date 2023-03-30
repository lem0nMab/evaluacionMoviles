<?php

// Datos de conexión a la base de datos
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "myuca";

// Crear conexión a la base de datos
$conn = mysqli_connect($servername, $username, $password, $dbname);

// Verificar si la conexión es exitosa
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

// Función para mostrar los registros de una tabla
function mostrar($coordinador) {
    global $conn;
    $sql = "SELECT * FROM coordinador WHERE DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(), fechaNac)), '%Y')+0 >= 60";
    $result = mysqli_query($conn, $sql);
    $rows = array();
    while($r = mysqli_fetch_assoc($result)) {
        $rows[] = $r;
    }
    return json_encode($rows);
}
echo mostrar('coordinador');

?>