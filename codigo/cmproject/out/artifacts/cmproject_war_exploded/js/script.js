$().ready(function(){

    if(window.location.pathname == "/cmproject_war_exploded/alugar.xhtml"){
        var algDesctiption = $('#alg-description');

        var hash = window.location.hash;

        if(hash == "#toyota"){
            algDesctiption.find("h2").text("Toyota Corolla");
            algDesctiption.find("p").text("Equipada com motor 1.8 e câmbio CVT que simula sete velocidades, o novo Corolla GLi Upper sai de fábrica com ar-condicionado, trio elétrico, computador de bordo com sete funções, sistema de som com conectividade USB para  Bluetooth, vidros e retrovisores com acionamento elétrico, volante multifuncional, rodas de liga leve de 16 polegadas e bancos em couro. Além dos mandatórios freios ABS, o modelo vem com cinco airbags de série (frontais, laterais dianteiros e para os joelhos do motorista). Controles eletrônicos de estabilidade e de tração, contudo, continuam indisponíveis para o médio.");
            algDesctiption.find("img").attr("src", "img/carros/COROLLA.jpg");
        }

        else if(hash == "#m4"){
            algDesctiption.find("h2").text("BMW M4");
            algDesctiption.find("p").text("O novo BMW M4 Coupé foi inspirado na longa tradição da marca de produzir carros esportivos de altíssimo desempenho, tornando-se o mais novo ícone da divisão M. Com design particularmente sofisticado e esportivo e construção leve com uso de fibra de carbono, é a última palavra em dinâmica e esportividade. Na pista ou nas ruas, a experiência de pilotar essa máquina é única.");
            algDesctiption.find("img").attr("src", "img/carros/bmwM4.jpg");
        }

        else if(hash == "#camaro"){
            algDesctiption.find("h2").text("Camaro");
            algDesctiption.find("p").text("É impossível passar desapercebido dirigindo um Camaro. A aparência forte e robusta da traseira e dianteira com design renovado produz uma percepção mais larga, baixa e contemporânea. São tantos detalhes que fica impossível perceber todos ao primeiro olhar, mas o conjunto final de design e performance do Camaro SS 2014 causa fortes emoções em qualquer um que atravesse o seu caminho.");
            algDesctiption.find("img").attr("src", "img/carros/camaro.jpg");
        }

        else if(hash == "#adventure"){
            algDesctiption.find("h2").text("Fiat Idea Adventure");
            algDesctiption.find("p").text("O Novo Fiat Idea 2015 chega muito mais bonito por dentro e por fora. Com uma nova grade frontal, as versões Attractive e Essence ganham linhas mais elegantes com moldura nos faróis de neblina e grade inferior em formato de colméia. Já a versão Adventure conta com uma grade exclusiva.");
            algDesctiption.find("img").attr("src", "img/carros/fiat%20adventure.jpg");
        }

        else if(hash == "#gallardo"){
            algDesctiption.find("h2").text("Lamborghini Gallardo");
            algDesctiption.find("p").text("Lançado em 2004 pela Lamborghini, o Gallardo é o modelo de entrada do fabricante italiano. O super-esportivo foi o primeiro veículo da marca a ser equipado com um motor V10. No mesmo ano, a polícia italiana recebeu de presente algumas unidades do Gallardo para atuar no patrulhamento rodoviário do país, em homenagem aos 152 anos da instituição.");
            algDesctiption.find("img").attr("src", "img/carros/gallardo.jpg");
        }
    }
});