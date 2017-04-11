function mostrarInformacion(identificador) {
    var divCargar = document.getElementById("respuesta");
    divCargar.innerHTML = "";
    var objetoId = document.getElementById(identificador);
    var nombre = $("#" + identificador).attr("name");
    var imagen = document.createElement("img");
    imagen.setAttribute("src", "imagenes/cargando.gif");
    imagen.heigth = 100;
    imagen.width = 100;
    divCargar.appendChild(imagen);
    var valor = 0;
    console.log(objetoId);
    console.log(nombre);
    console.log("entro en mostrar informacion - " + identificador);
    $.post(nombre, {
        valor: valor
    },
    function(data, status) {
        $("#respuesta").html(data);
    });
}

