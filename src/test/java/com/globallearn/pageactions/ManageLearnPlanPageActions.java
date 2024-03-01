package com.globallearn.pageactions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageLearnPlanPageActions {

	public static void clickElement(WebDriver driver, WebElement webElement) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			webElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void sendKeys(WebDriver driver, WebElement webElement, String testDataValue) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(webElement));
			webElement.sendKeys(testDataValue);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void waitUntilElementVisible(WebDriver driver, WebElement webElement) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(webElement));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDownMethod(WebElement element, String text) {
		try {
			Select s = new Select(element);
			s.selectByVisibleText(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void javaScriptClicker(WebDriver driver, WebElement webElement) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", webElement);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void jsScrollDown(WebDriver driver, WebElement webElement) {
		try {
			JavascriptExecutor jsExecutorDown = (JavascriptExecutor) driver;
			jsExecutorDown.executeScript("arguments[0].scrollIntoView(true)", webElement);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void assertElementVisibility(WebDriver driver, WebElement webElement) {

		try {

			boolean elementVisibleResult = webElement.isDisplayed();
			assertTrue(elementVisibleResult);
			System.out.print(elementVisibleResult);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
