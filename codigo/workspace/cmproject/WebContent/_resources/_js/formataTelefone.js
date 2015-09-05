/**
 * pontuação de telefone 
 */
	function formataTelefone(campoTelefone){
		
	if (campoTelefone.value.length == 0){
		campoTelefone.value =  "("+campoTelefone.value;
	}
	if (campoTelefone.value.length==3) {
		campoTelefone.value= campoTelefone.value+")";
	};
	if (campoTelefone.value.length==8) {
		campoTelefone.value=campoTelefone.value+"-";
	};
    
}