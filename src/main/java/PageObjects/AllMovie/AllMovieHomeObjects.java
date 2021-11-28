package PageObjects.AllMovie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObjects.BasePage;

public class AllMovieHomeObjects extends BasePage {
	
	public AllMovieHomeObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "site-search-input")
	public WebElement SearchBox_TB;
	
	@FindBy(className = "site-search-button")
	public WebElement SearchIcon_Btn;
	
	@FindBy(xpath = "//h1[contains(text(),'search results')]")
	public WebElement SearchResults_Text;
	
	@FindBy(xpath = "//*[@id='cmn_wrap']//*[@href='https://www.allmovie.com/movie/the-godfather-v20076']")
	public WebElement ResultMovie1_Link;
	
	@FindBy(xpath = "//*[contains(text(),'Genres -') and @class='header-movie-genres']/a")
	public WebElement Genres_Text;
	
	@FindBy(xpath = "//*[contains(text(),'MPAA Rating -')]/span")
	public WebElement MPAARating_Text;
	
	@FindBy(xpath = "//*[@title='Cast & Crew']")
	public WebElement CastAndCrew_Link;
	
	@FindBy(xpath = "//*[@class='director_container']/*[@class='info']//a")
	public WebElement DirectorName_Text;
	
	@FindBy(xpath = "//*[text()='Al Pacino']/parent::div[@class='cast_name artist-name']/following-sibling::div")
	public WebElement AlPacinoCharacterName_Text;
	
	
}
