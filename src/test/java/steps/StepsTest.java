package steps;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import models.Root;

public class StepsTest {
	Root root = null;
//	@Given("leio uma {string} JSON")
//	public void leio_uma_json(String string) {
//		String json = "{\"integration\": {\"_discriminator\": \"integration\", \"branchName\": \"Matriz S/A\", \"companyBranchCode\": 1, \"companyBranchName\": \"Demonstra S/A - Matriz\", \"companyCode\": 1, \"companyName\": \"Demonstra Ind.& Com. Têxtil S/A\", \"cpfNumber\": \"86088075058\", \"dateWhen\": \"2020-05-04\", \"employee\": {\"_discriminator\": \"employee\", \"birthday\": \"1974-04-03\", \"code\": 4565659, \"company\": {\"_discriminator\": \"company\", \"code\": 1, \"id\": \"6dc28ee5-ed61-4894-9417-b9588d9aead4\", \"name\": \"Demonstra Ind.& Com. Têxtil S/A\"}, \"companyBranch\": {\"_discriminator\": \"companyBranch\", \"code\": 49, \"companyBranchName\": \"unidade clark9 companybranch\", \"dateWhen\": \"1998-02-03\", \"id\": \"4ced36d9-2cd8-40d0-bd0b-a12f5771ff5b\", \"name\": \"unidade clark9 name\", \"subscriptionNumber\": \"44616262000150\", \"subscriptionType\": \"CNPJ\"}, \"contractType\": \"EMPLOYEE\", \"costCenter\": {\"_discriminator\": \"costCenter\", \"code\": \"1401\", \"dateWhen\": \"1998-02-03\", \"id\": \"9219a1ae-f38f-4747-a645-a6fc115bd3b0\", \"name\": \"Recursos Humanos clark\"}, \"cpfNumber\": \"05753579086\", \"ctpsIssuanceDate\": \"1990-01-01\", \"ctpsNumber\": \"000546761\", \"ctpsSerie\": \"216\", \"ctpsSerieDigit\": \"002\", \"ctpsState\": \"SC\", \"department\": {\"_discriminator\": \"department\", \"code\": \"4\", \"dateWhen\": \"1998-02-03\", \"id\": \"4ff34026-415d-47f4-b693-6509908fe427\", \"name\": \"setor clark3\", \"structureCode\": 4}, \"dismissalDate\": \"2021-12-12\", \"employeeType\": \"EMPLOYEE\", \"eSocialCategory\": {\"_discriminator\": \"eSocialCategory\", \"code\": \"Category_101\", \"dateWhen\": \"1998-02-03\", \"id\": \"15eedca5-dbc2-4067-aabe-331a17df41e6\"}, \"eSocialRegistration\": \"123456\", \"externalId\": \"069F59F129124E58820C8C6B04A819C1\", \"genderType\": \"FEMALE\", \"hireDate\": \"1998-02-03\", \"id\": \"ff00e1a3-8a10-4588-94c8-e3ad8c06c0bf\", \"isDeficient\": false, \"jobPosition\": {\"_discriminator\": \"jobPosition\", \"cboCode\": \"142210\", \"code\": \"4\", \"dateWhen\": \"2021-02-03\", \"id\": \"0a075f91-84e9-4f01-8ceb-3c7f97623b13\", \"name\": \"cargo clark3\", \"structureCode\": \"4\"}, \"maritalStatusType\": \"MARRIED\", \"name\": \"Clark Senior rest assured matricula employee\", \"nisNumber\": \"12152212837\", \"numberContractSameHireDate\": 0, \"previousCode\": \"\", \"previousCompany\": {\"code\": \"126389\", \"name\": \"motivo clark senior\"}, \"previousCompanyBranch\": {\"code\": \"126489\", \"companyBranchName\": \"company clark senior branch name\", \"dateWhen\": \"2021-01-30\", \"name\": \"motivo clark senior\", \"subscriptionNumber\": \"2022\", \"subscriptionType\": \"CNPJ\"}, \"reason_leave\": {\"code\": \"CODEREASONLEAVE\", \"endDate\": \"2021-02-28\", \"estimatedEndDate\": \"2021-01-30\", \"id\": \"id_reson_leave\", \"name\": \"motivo clark senior\", \"startDate\": \"2021-01-01\"}, \"rgIssuanceDate\": \"1990-01-02\", \"rgIssuer\": \"SSP\", \"rgNumber\": \"99999\", \"rgState\": \"AC\", \"salaryPremium\": {\"specialRetirementType\": \"SPECIAL_RETIREMENT_AT_TWENTY_YEARS_OF_SERVICE\"}, \"shift\": {\"_discriminator\": \"shift\", \"code\": 2, \"dateWhen\": \"1998-02-03\", \"id\": \"50094acb-6e77-4cd9-be65-6d95c3fd800d\", \"name\": \"08:00 1200-1330 1800/Móvel\"}, \"situationType\": \"WORKING\", \"workstation\": {\"_discriminator\": \"workstation\", \"code\": \"ADM006\", \"dateWhen\": \"2011-04-01\", \"id\": \"02b095e5-7553-418b-b8b8-7c8ccbf423e1\", \"name\": \"Gerente Recursos Humanos\", \"structureCode\": 2}}, \"employeeCode\": 9997, \"employeeName\": \"Clark Senior223\", \"eSocialRegistration\": \"\", \"externalHistoricId\": \"\", \"externalId\": \"069F59F129124E58820C8C6B04A819C1\", \"id\": \"d42c69b0-c475-4df0-9042-9fc383a0a8fa\", \"integrationOrigin\": \"266be465-c996-47af-845d-d7b6599d10a1\", \"integrationSequence\": 1, \"integrationType\": \"EMPLOYEE_CHANGE\", \"operationType\": \"INSERT\", \"previewSendDate\": \"2020-05-06T12:25:15.146675947Z\", \"providerCompanyIdentification\": \"390580\", \"providerEmployeeIdentification\": \"\", \"providerName\": \"\", \"providerPreviousCompanyIdentification\": \"366918\", \"providerPreviousEmployeeIdentification\": \"\", \"providerType\": \"SOC\", \"receiptDate\": \"2020-05-04T18:09:42.262Z\", \"regenerateAttempts\": 1, \"scheduledDate\": \"2020-05-06\", \"sendDate\": \"2020-05-06T12:25:15.146675947Z\", \"statusType\": \"SENT_TO_PROVIDER\"}}";
//		Map<String, Object> map = null;
//		
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		
//		try {
//			map = mapper.readValue(json, new TypeReference<Map<String, Object>>() {});	
//			String result = mapper.writeValueAsString(map);
//			System.out.println("mapToObject RESULT\n" + result);
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		
//		if (map == null) {
//			fail("map=null");
//		}else {
//			Root root = mapper.convertValue(map, Root.class);			
//			root.integration.getEmployee().setName("NOME ALTERADO");
//			assertEquals("NOME ALTERADO", root.integration.getEmployee().getName());
//		}
//	}

	@Given("leio uma {string} JSON")
	public void leio_uma_json(String pendencia) {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			root = mapper.readValue(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\" + pendencia), Root.class);			
		} catch (IOException e) {
			e.printStackTrace();		
		}
		
	}
	
	
	@Dado("preencho os campos {string}, {string}")
	public void preencho_os_campos(String nome, String cpf) {
		root.integration.getEmployee().setName(nome);
		root.integration.getEmployee().setCpfNumber(cpf);
	}
	
	@Given("preencho os campos <nome>, <cpf>")
	public void preencho_os_campos_nome_cpf() {
		
		
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
		
		assertEquals("NOME ALTERADO 1", root.integration.getEmployee().getName());
		assertEquals("12345678901", root.integration.getEmployee().getCpfNumber());
		
	}

}
