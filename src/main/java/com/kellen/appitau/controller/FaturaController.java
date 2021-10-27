package com.kellen.appitau.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kellen.appitau.modelo.Conta;
import com.kellen.appitau.modelo.Fatura;
import com.kellen.appitau.modelo.Totais;
import com.kellen.appitau.modelo.Transacao;

@Controller
public class FaturaController {

	@RequestMapping("/fatura")
	@ResponseBody
	public List<Fatura> imprimirFatura() throws JsonParseException, JsonMappingException, IOException {

		ArrayList<Fatura> listaDeFaturas = new ArrayList<>();

		Double creditoInicial = 0.0, debitoInicial = 40000.0;
		
		Conta contaKellen = new Conta("Kellen Thaisa", 20000.0);
		Totais gastosIniciais = new Totais(creditoInicial, debitoInicial);
		Transacao primeiraTransacao = new Transacao("Itau Contrata a Kellen", 9000.0, "Internacional");
		Transacao segundaTransacao = new Transacao("Itau Contrata a Kellen", 9000.0, "Nacional");

		Fatura faturaKellen = new Fatura();
		faturaKellen.setTotais(gastosIniciais);
		faturaKellen.setConta(contaKellen);
		faturaKellen.fazerTransacao(primeiraTransacao);
		faturaKellen.fazerTransacao(segundaTransacao);

		listaDeFaturas.add(faturaKellen);

		return listaDeFaturas;


//		faturaKellen.filter();
		
//		ObjectMapper mapper = new ObjectMapper(); 
//		
//		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
//
//		File faturaJsonFile = new ClassPathResource("dado.json").getFile();
//		
//		TypeReference<HashMap<String,Object>> typeRef = new TypeReference<HashMap<String,Object>>() {};
//		
//
//		
//	    HashMap<String,Object> map;
//	    map = mapper.readValue(faturaJsonFile, typeRef); 
//	    
//	    
//	    System.out.println("Mapa: " + map.toString());	    
//
//        
//        for (Map<String, Object> entry : map) {
//            if(entry;chave.equals("conta")){
//                Conta conta = mapper.convertValue(entry.get("conta"), Conta.class);
//                Fatura fatura = new Fatura(conta);
//                faturas.add(fatura);
//            }
//        }

//		//converter arquivo json em objeto java
//		ArrayList<Fatura> faturaArquivoLido = mapper.readValue(faturaJsonFile, 
//				new TypeReference<ArrayList<Fatura>>(){});
//
//		
//		
		// Fazer uma função que leia do arquivo.
		// Inicializar as faturas.

//		arquivoFaturaRaw = lerArquivo("Caminho para o arquivo");
//		faturaJSON = JSON(arquivoFaturaRaw);
//		
//		for (Fatura faturaJSON : faturasJSON) {
//			faturas.add(new Fatura(faturaJSON.getNomeCliente(), faturaJSON.getLimite(), faturaJSON.getSaldoDisponivel()));
//		}

//		Fatura faturaAntonio = new Fatura("Antonio Coutinho", new BigDecimal(200), new BigDecimal(500));
//		Fatura faturaMaria = new Fatura("Maria do Bairro", new BigDecimal(2000), new BigDecimal(5000));
//
//		faturas.add(faturaMaria);
//		faturas.add(faturaAntonio);
//		faturas.add(new Fatura("Kellen Banco Itaú vai passar", new BigDecimal(3000), new BigDecimal(10000)));
//		
//		return faturaArquivoLido;

	}
}
