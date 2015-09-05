/**
 * somente numeros entrada
 */
function somenteNumeros(e){ /*permite apenas numeros*/
	var tecla=(window.event)?event.keyCode:e.which;

	if ((tecla>47 && tecla<58)) return true;
	else{
		if(tecla!= 8) return false;
		else return true;
	}
}