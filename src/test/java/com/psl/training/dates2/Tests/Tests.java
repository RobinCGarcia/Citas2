package com.psl.training.dates2.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Random;

import com.psl.training.dates2.pages.Cita;
import com.psl.training.dates2.pages.Doctor;
import com.psl.training.dates2.pages.Paciente;

/**
* Created by robinson.coronado on October 9th -2016
*/
public class Tests {
	
	
	WebDriver driver;
	String Url;
	Random RandomGenerator = new Random();
	int rndIdDoctor = RandomGenerator.nextInt(1000);
	int rndIdPaciente = RandomGenerator.nextInt(1000);

	@BeforeMethod
	public void Before()
	{
		driver = new FirefoxDriver();
		Url = "http://automatizacion.herokuapp.com/pperez/";
	}
	
	@AfterMethod
	public void After()
	{
		Assert.assertEquals("Guardado:", driver.findElement(By.cssSelector(".panel-title")).getText());
		driver.quit();
	}
	
	@Test(priority=1)
	public void AddDoctor(){
	    Doctor doctor =   PageFactory.initElements(driver, Doctor.class);
		doctor.GoDoctorForm(driver,Url);
		doctor.FillDoctor("Robin", "C. Garcia", rndIdDoctor, "Cédula de ciudadanía","2187439");	
		
	}
	
	@Test(priority=2)
    public void AddPaciente(){
    	Paciente paciente = PageFactory.initElements(driver, Paciente.class);
    	paciente.GoPacienteForm(driver,Url);
    	paciente.FillPaciente("Sebastian", "Perez", rndIdPaciente, "Cédula de ciudadanía", "3214578");
   }	
	
	@Test(priority=3)
	public void AddCita(){
		Cita cita = PageFactory.initElements(driver, Cita.class);
		cita.GoCitaForm(driver,Url);
		cita.FillCita(rndIdPaciente, rndIdDoctor, "Testing by Robin C Garcia");
	}
	
}
