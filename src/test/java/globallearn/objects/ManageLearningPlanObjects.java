package globallearn.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globallearn.testbase.ManageLearnPlanTestBase;

public class ManageLearningPlanObjects extends ManageLearnPlanTestBase{

	public ManageLearningPlanObjects(WebDriver driver) {
		ManageLearnPlanTestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "pre-username")
	public WebElement loginUsernameField;

	@FindBy(id = "proceed-username-button")
	public WebElement loginNextButton;

	@FindBy(id = "password")
	public WebElement loginPasswordField;

	@FindBy(id = "login-button")
	public WebElement loginButton;
	
	@FindBy(xpath = "//span[text()='Course Management']")
	public WebElement courseManagement;
	
	@FindBy(xpath = "//h2[text()='Course Management']")
	public WebElement courseManagementTitle;
	
	@FindBy(id = "createNewCourse")
	public WebElement addCourseButton;
	
	@FindBy(xpath = "//h4[text()='Create a Course']")
	public WebElement createACoursePopup;
	
	@FindBy(xpath = "//h4[text()='Blank']")
	public WebElement blankCourse;
	
	@FindBy(id = "createcourse")
	public WebElement nextButton;
	
	@FindBy(id = "fullname")
	public WebElement courseFullName;
	
	@FindBy(id = "shortname")
	public WebElement courseShortName;
	
	@FindBy(id = "id_ctypes")
	public WebElement courseType;
	
	@FindBy(id = "duecondition_1")
	public WebElement noDueDate;
	
	@FindBy(id = "course_summary")
	public WebElement courseDescription;
	
	@FindBy(id = "id_certificate")
	public WebElement issueCertificateInCourse;
	
	@FindBy(id = "id_category")
	public WebElement courseCatolog;
	
	@FindBy(id = "submitsinglebtn")
	public WebElement saveCourseButton;
	
	@FindBy(xpath = "//h4[text()='Course created']")
	public WebElement courseCreatedPopup;
	
	@FindBy(xpath = "//h3[text()='Course was created successfully.']")
	public WebElement courseCreatedSuccess;
	
	@FindBy(xpath = "//button[text()='View Course']")
	public WebElement viewCourseButton;
	
	@FindBy(xpath = "//div//parent::h1")
	public WebElement courseNameInCoursePage;
	
	@FindBy(xpath = "//button[text()='Turn editing on']")
	public WebElement turnEditingOnButton;
	
	@FindBy(xpath = "//a[text()=' Add Activity ']")
	public WebElement addAnActivity;
	
	@FindBy(xpath = "//span[text()='Add An Activity or Resource']")
	public WebElement addAnActivityorResource;
	
	@FindBy(xpath = "//h5[text()='Add An Activity or Resource']")
	public WebElement addAnActivityorResourcePopup;
	
	@FindBy(xpath = "(//div[text()='File'])[1]")
	public WebElement fileActivity;
	
	@FindBy(xpath = "//h2[text()='Editing File']")
	public WebElement editingFilePage;
	
	@FindBy(id = "id_name")
	public WebElement fileNameTextBox;
	
	@FindBy(xpath = "//div[text()='You can drag and drop files here to add them.']//child::div")
	public WebElement uploadFile;
	
	@FindBy(xpath = "//h3[text()='File picker']")
	public WebElement filePickerPopup;
	
	@FindBy(xpath = "//span[text()='Recent files']")
	public WebElement recentFiles;
	
	@FindBy(xpath = "//a//following-sibling::p")
	public WebElement documentFile;
	
	@FindBy(xpath = "//button[text()='Select this file']")
	public WebElement selectThisFileButton;
	
	@FindBy(id = "id_submitbutton2")
	public WebElement saveAndReturnToCourseButton;
	
	@FindBy(xpath = "//span[text()='Test File ']")
	public WebElement fileNameInCoursePage;

	@FindBy(xpath = "//h2[text()='Course Completion Status']")
	public WebElement courseCompletionStatus;
    
	@FindBy(xpath = "//span[text()='Company Dashboard']")
	public WebElement companyDashboard;
	
	@FindBy(xpath = "//h2[text()='Company Management']")
	public WebElement companyManagement;

	@FindBy(id = "managelearningplans")
	public WebElement manageLearningPlans ;

	@FindBy(id = "totalcourses")
	public WebElement totalCourses ;
	
	@FindBy(id = "createNewLearningPlan")
	public WebElement addLearningPlan;
	
	@FindBy(xpath = "(//h4[contains(text(),'Create A Learning Plan')])[2]")
	public WebElement createALearningPlan;
	
	@FindBy(id = "fullname")
	public WebElement lpFullName;
	
	
	@FindBy(id = "shortname")
	public WebElement lpShortName;
	
	@FindBy(id = "status")
	public WebElement lpStatus;
	
	@FindBy(xpath = "//label[text()='Include Issue Certificate']")
	public WebElement issueCertificate;
	
	@FindBy(id = "idnumber")
	public WebElement idNumber;
	
	@FindBy(id = "trainingarea")
	public WebElement trainingArea;
	
	@FindBy(id = "credits")
	public WebElement credits;
	
	@FindBy(id = "lpcode")
	public WebElement lpCode;
	
	@FindBy(xpath = "(//img/parent::div)[4]")
	public WebElement lpPicture;
	
	@FindBy(id = "savelpfrmbtn")
	public WebElement lpSaveButton;
	
	@FindBy(xpath = "//div[contains(text(),' Learning Plan was')]")
	public WebElement lpCreatedSuccessfully;
	
	@FindBy(xpath = "(//i//parent::button)[2]")
	public WebElement closeIcon;
	
	@FindBy(id = "keywords_lp")
	public WebElement lpSearchBox;
	
	@FindBy(xpath = "//a[text()='Sample lp12']")
	public WebElement createdLPName;
	
	@FindBy(xpath = "//td//child::a")
	public WebElement lpName;
	
	@FindBy(id = "addstep")
	public WebElement addStepButton;
	
	@FindBy(id = "steptitle")
	public WebElement stepTitle;
	
	@FindBy(xpath = "//button[text()=' Map Courses']")
	public WebElement mapCourseButton;
	
	@FindBy(id = "searchlpcourses")
	public WebElement searchLPCourse;
	
	@FindBy(id = "potentialcourses")
	public WebElement PotentialCourse;
	
	@FindBy(id = "add_lps_course")
	public WebElement courseAddButton;
	
	@FindBy(xpath = "//input[@class='ctg-btn']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//b[text()='Learning Plans']")
	public WebElement learningPlanText;
	
	@FindBy(xpath = "//input[@class='ctg-btn']")
	public WebElement confirmButton;
	
	@FindBy(xpath = "//p[text()='Courses Mapped / Unmapped successfully']")
	public WebElement courseMapSuccess;
	
	@FindBy(xpath = "//label//parent::td")
	public WebElement courseRequired;
	
	@FindBy(id = "savesteps")
	public WebElement saveButton;
	
	@FindBy(xpath = "//div[text()='Updated successfully']")
	public WebElement updateSuccessMessage;
	
	@FindBy(xpath = "//a[text()='Manage Learning Plans']")
	public WebElement breadCManageLearningPlan;
	
	@FindBy(name = "lpchk")
	public WebElement learningPlanCheckBox;
	
	@FindBy(id = "maplpuserslink")
	public WebElement mapLearnerButton;
	
	@FindBy(id = "searchlpusers")
	public WebElement mapUserSearchBox;
	
	@FindBy(id = "potentialusers")
	public WebElement potentialusersList;
	
	@FindBy(id = "add_user")
	public WebElement addUserButton;
	
	@FindBy(xpath = "//p[text()='Learners Mapped / Unmapped successfully']")
	public WebElement learnerMappedSuccess;
	
	@FindBy(xpath = "(//i//parent::button)[1]")
	public WebElement mapLearnerCloseIcon;
	
	@FindBy(xpath = "//td[text()='1']")
	public WebElement validateUserColumn;
	
	@FindBy(xpath = "//a[text()='Demo Course']")
	public WebElement courseFromMyCourse;
	
	
	
	
	
	
	
	
	
	
	

	
}
