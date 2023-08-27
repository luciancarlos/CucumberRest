package steps2;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Root;

public class StepsTest2ListOfRequests {
	Root[] root = null;

	@Given("leio uma {string} JSON")
	public void leio_uma_json(String pendencia) {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			root = mapper.readValue(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\teste2.json"), Root[].class);			
		} catch (IOException e) {
			e.printStackTrace();		
		}
		
	}
	
	@Given("preencho os campos {string}, {string}")
	public void preencho_os_campos(String nome, String cpf) {
		
		root[0].integration.getEmployee().setName(nome);
		root[0].integration.getEmployee().setCpfNumber(cpf);	
		
		root[1].integration.getEmployee().setName("NOME ALTERADO 2");
		root[1].integration.getEmployee().setCpfNumber("12345678902");
	}

	@When("envio a requisicao")
	public void envio_a_requisicao() {
		
		enviarRequisicao(root);		
	}

	
	@Then("valido o status code")
	public void valido_o_status_code() {	
		given()
		.then()
			.statusCode(200);		
	}

	@Then("valido o conteudo gravado no banco")
	public void valido_o_conteudo_gravado_no_banco() {
		validarConteudoGravadoNoBanco(root);
	}
	
	private void enviarRequisicao(Object request) {
		
		given()
			.body(request)
		.when()
			.post("localhost");			
	}

	private void validarConteudoGravadoNoBanco(Object request) {		
		
		assertEquals("NOME ALTERADO 1", root[0].integration.getEmployee().getName());
		assertEquals("12345678901", root[0].integration.getEmployee().getCpfNumber());
		
		assertEquals("NOME ALTERADO 2", root[1].integration.getEmployee().getName());
		assertEquals("12345678902", root[1].integration.getEmployee().getCpfNumber());
	}

}