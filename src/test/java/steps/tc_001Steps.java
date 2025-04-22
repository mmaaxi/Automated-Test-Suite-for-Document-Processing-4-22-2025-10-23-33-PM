package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Tc_001Page;

public class Tc_001Steps {
    WebDriver driver;
    Tc_001Page page = new Tc_001Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.goToDocumentUploadPage();
    }

    @When("El usuario selecciona la opción 'cargar documentos'")
    public void el_usuario_selecciona_la_opcion_cargar_documentos() {
        page.selectDocumentUploadOption();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_unica_y_carga_multiple() {
        Assert.assertTrue(page.isSingleAndMultipleUploadOptionVisible());
    }

    @Given("El usuario visualiza opciones de carga")
    public void el_usuario_visualiza_opciones_de_carga() {
        Assert.assertTrue(page.isUploadOptionsVisible());
    }

    @When("El usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.selectSingleFileUploadOption();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        Assert.assertTrue(page.isSingleFileUploadBoxEnabled());
    }

    @When("El usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.selectMultipleFileUploadOption();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_correspondientes_a_cada_documento_requerido() {
        Assert.assertTrue(page.areMultipleFileUploadBoxesVisible());
    }
}