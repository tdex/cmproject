/**
 * coloca simbolos de cpf . e - 
 */
function formataCpf(campoCpf){
	var cpf = campoCpf.value;
	if (cpf.length == 3){
		campoCpf.value = cpf + ".";
	}
	if (cpf.length == 7){
		campoCpf.value = cpf + ".";
	}
	if (cpf.length == 11){
		campoCpf.value = cpf + "-";
	}
}