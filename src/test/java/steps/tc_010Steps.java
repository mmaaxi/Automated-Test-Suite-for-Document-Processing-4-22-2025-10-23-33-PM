package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    @Given("el usuario ha iniciado sesión y navega al formulario de carga de documentos")
    public void usuarioEnElFormularioDeCarga() {
        page = PageFactory.initElements(driver, tc_010Page.class);
        page.loginAndNavigateToUploadForm();
    }

    @When("el usuario completa la carga de documentos necesarios")
    public void usuarioCompletaCargaDeDocumentos() {
        page.uploadDocuments();
    }

    @When("el usuario inicia el procesamiento de documentos")
    public void usuarioIniciaProcesoDeDocumentos() {
        page.processDocuments();
    }

    @Then("el sistema debe generar el 'Slip de salida'")
    public void sistemaGeneraSlipDeSalida() {
        page.verifySlipGenerated();
    }

    @Then("el sistema debe guardar los documentos originales en el historial de la solicitud")
    public void sistemaGuardaDocumentosEnHistorial() {
        page.verifyDocumentsInHistory();
    }

    @Then("el sistema debe guardar los datos extraídos en el historial de la solicitud")
    public void sistemaGuardaDatosExtraidosEnHistorial() {
        page.verifyDataExtractedInHistory();
    }
}