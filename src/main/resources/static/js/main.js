//Creo las variables para capturar los datos a enviar
let $btnContinue = document.getElementById('btn-continue');
let $area;
let $factorK;
let $factorN;
let $nIntervalosPrecipitacion;
let $intervaloHorario;


/*Al hacer click en el boton CONTINUAR creo los elementos de una tabla
de inputs para ingresar los datos de precipitacion e hidrograma observados*/
$btnContinue.addEventListener('click',e =>{
    e.preventDefault();
    let $divContainer = document.getElementsByClassName('container')[0];
    let $divFormTabla = document.createElement('form');
    let $tabla = document.createElement('table');
    let $encabezadoTabla = document.createElement('thead');
    let $encabezadoColumnaFecha = document.createElement('th');
    let $encabezadoColumnaPrecipitacion = document.createElement('th');
    let $fila = document.createElement('tr');
    let $cuerpoTabla = document.createElement('tbody');
    
    $tabla.setAttribute('class','table table-hover table-borderless table-sm mt-3');
    
    $divContainer.appendChild($divFormTabla);
    $divFormTabla.appendChild($tabla);
    $tabla.appendChild($encabezadoTabla);
    $tabla.appendChild($cuerpoTabla);
    
    $encabezadoTabla.appendChild($fila);
    $fila.appendChild($encabezadoColumnaFecha);
    $fila.appendChild($encabezadoColumnaPrecipitacion);
    
    $encabezadoColumnaFecha.innerHTML = "Fecha";
    $encabezadoColumnaPrecipitacion.innerHTML = "Altura de precipitacion [mm]";
    
    
    $area = document.getElementById('area').value;
    $factorK = document.getElementById('factor-k').value;
    $factorN = document.getElementById('factor-n').value;
    $nIntervalosPrecipitacion = document.getElementById('intervalos-precip').value;
    $intervaloHorario = document.getElementById('intervalo-h').value;
});
