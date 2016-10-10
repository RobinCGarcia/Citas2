package com.psl.training.dates2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

/**
* Created by robinson.coronado on October 9th -2016
*/
public class Doctor 
{
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="identification_type")
	private WebElement identification_type;
	
	@FindBy(id="telephone")
	private WebElement telephone;
	
	@FindBy(id="identification")
	private WebElement Identification;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div/div[3]/div/a")
	private WebElement btn_guardar;
	
	public void GoDoctorForm(WebDriver driver,String Url)
	{
		driver.get(Url + "addDoctor");
	}

	public void FillDoctor(String nombre,String apellido,Integer Id,String idType,String telephono)
	{
	  name.sendKeys(nombre);
	  last_name.sendKeys(apellido);
	  Identification.sendKeys(Id.toString());
	  identification_type.sendKeys(idType);
	  telephone.sendKeys(telephono);
	  btn_guardar.click();
	}

}