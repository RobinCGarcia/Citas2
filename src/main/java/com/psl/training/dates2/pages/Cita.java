package com.psl.training.dates2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

/**
* Created by robinson.coronado on October 9th -2016
*/
public class Cita {

	@FindBy(id="datepicker")
	private WebElement datepicker;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[2]/input")
	private WebElement Paciente;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[3]/input")
	private WebElement Doctor;

	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea")
	private WebElement Observaciones;

	@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")
	private WebElement select_value;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/a")
	private WebElement btn_guardar;

	@FindBy(css=".panel-title")
	private WebElement title_exito;
	
	
	
	
	public void GoCitaForm(WebDriver driver,String Url)
	{
		driver.get(Url+ "appointmentScheduling");
	}
	
	public void FillCita(Integer IdPaciente,Integer IdDoctor,String Observacion)
	{
	   datepicker.click();
	   select_value.click();
	   Paciente.sendKeys(IdPaciente.toString());
	   Doctor.sendKeys(IdDoctor.toString());
	   Observaciones.sendKeys(Observacion);
	   btn_guardar.click();

	}
	
	public Boolean AssertCita()
	{
		
		 String TextReturn=  title_exito.getText();
		System.out.println("Que tengo:"+ TextReturn);
	
		 String Val = "Guardado:";
		 if (TextReturn == Val)
		 {
			 return true;
		 }else return false;
	}
	
	
}
