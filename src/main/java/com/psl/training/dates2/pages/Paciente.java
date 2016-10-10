package com.psl.training.dates2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

/**
* Created by robinson.coronado on October 9th -2016
*/
public class Paciente {
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[1]/input")
	private WebElement name_paciente;

	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[2]/input")
	private WebElement apellido_paciente;

	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[3]/input")
	private WebElement tele_paciente;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[4]/select")
	private WebElement tipo_cedula;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[5]/input")
	private WebElement identification;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/a")
	private WebElement btn_guardar;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[6]/label")
	private WebElement lbl_prepagada;
		
	public void GoPacienteForm(WebDriver driver,String Url)
	{
		driver.get(Url+ "addPatient");
	}
	
	public void FillPaciente(String nombre,String apellido,Integer Id,String idType,String telephono)
	{
	  name_paciente.sendKeys(nombre);
	  apellido_paciente.sendKeys(apellido);
	  tele_paciente.sendKeys(telephono);
	  tipo_cedula.sendKeys(idType);
	  identification.sendKeys(Id.toString());
	  lbl_prepagada.click();
	  btn_guardar.click();
	}
	

}
