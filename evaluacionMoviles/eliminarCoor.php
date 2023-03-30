<?php
    
if($_SERVER["REQUEST_METHOD"] == "POST"){
    require_once 'conexion.php';
    $idC = $_POST["idC"];
    $my_query = "DELETE FROM coordinador WHERE idC =".$idC;
    $result = $mysql->query($my_query);

    if($result == true){
        echo 'Registro eliminado exitosamente';
    } else { 
        echo 'Error';
    }
} else {
    echo 'Error desconocido';
}

?>