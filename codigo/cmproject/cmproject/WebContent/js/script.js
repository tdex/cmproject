$(document).ready(function(){

	$("#btAlugar").click(function(){
		$(this).hide();
		$("#alugarDados").show();
	});

	$("#alugar").click(function(){
		confirm("confirmar aluguel?");
	})
	
	$("#imprimir").click(function(){
		$(this).hide();
		window.print();
	})
});