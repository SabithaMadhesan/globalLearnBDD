package globallearn.stepdefinitions;

import com.globallearn.pageactions.ManageLearnPlanPageActions;

import globallearn.objects.ManageLearningPlanObjects;
import globallearn.testbase.ManageLearnPlanTestBase;
import globallearn.testdata.ManageLearnPlanTestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageLearnPlanStepDefinitions extends ManageLearnPlanTestBase {

	ManageLearningPlanObjects manageLearnPlanObjects;

	@Given("GL application should open in chrome browser")
	public void gl_application_should_open_in_chrome_browser() {
		try {
			browserLaunch();
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);

		} catch (Exception e) {

			System.out.println("Exception while launching application: " + e);
		}
	}

	@When("Enter company admin username and password in login page")
	public void enter_company_admin_username_and_password_in_login_page() {
		try {
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.loginUsernameField,
					ManageLearnPlanTestData.companyAdminUsername);

			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.loginNextButton);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.loginPasswordField,
					ManageLearnPlanTestData.companyAdminPassword);
		} catch (Exception e) {
			System.out.println("Exception while entering the credentials: " + e);
		}

	}

	@When("click on signin button")
	public void click_on_signin_button() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.loginButton);
		} catch (Exception e) {
			System.out.println("Exception while click on signin button: " + e);
		}
	}

	@Then("validate the gl home page after successfull login")
	public void validate_the_gl_home_page_after_successfull_login() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.courseCompletionStatus);
			System.out.println("GL login Successful.");
		} catch (Exception e) {
			System.out.println("Exception while validating The gl home page: " + e);
		}

	}

	@When("Click on Course Management and course management page should be open")
	public void click_on_course_management_and_course_management_page_should_be_open() {
		try {
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);
			ManageLearnPlanPageActions.javaScriptClicker(driver, manageLearnPlanObjects.courseManagement);
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.courseManagementTitle);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.courseManagementTitle);

		} catch (Exception e) {

		}
	}

	@When("Click on Add course button and Create a course popup should be open")
	public void click_on_add_course_button_and_create_a_course_popup_should_be_open() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.addCourseButton);
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.createACoursePopup);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.createACoursePopup);

		} catch (Exception e) {

		}
	}

	@When("Select the course type and click on Next button and create a course page should be open")
	public void select_the_course_type_and_click_on_next_button_and_create_a_course_page_should_be_open() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.blankCourse);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.nextButton);
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.courseFullName);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.createACoursePopup);

		} catch (Exception e) {

		}
	}

	@When("Enter the course fullname and course short name")
	public void enter_the_course_fullname_and_course_short_name() {
		try {
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.courseFullName,
					ManageLearnPlanTestData.courseFullName);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.courseShortName,
					ManageLearnPlanTestData.courseShortName);
		} catch (Exception e) {

		}
	}

	@When("Select the Course type and Due date and Issue Certificate")
	public void select_the_course_type_and_due_date_and_issue_certificate() {
		try {
			ManageLearnPlanPageActions.dropDownMethod(manageLearnPlanObjects.courseType,
					ManageLearnPlanTestData.courseType);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.noDueDate);
			ManageLearnPlanPageActions.jsScrollDown(driver, manageLearnPlanObjects.courseDescription);
			ManageLearnPlanPageActions.dropDownMethod(manageLearnPlanObjects.issueCertificateInCourse,
					ManageLearnPlanTestData.certificate);
		} catch (Exception e) {

		}
	}

	@When("Select the Course catolog and click on save button")
	public void select_the_course_catolog_and_click_on_save_button() {
		try {
			ManageLearnPlanPageActions.dropDownMethod(manageLearnPlanObjects.courseCatolog,
					ManageLearnPlanTestData.catologName);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.saveCourseButton);
		} catch (Exception e) {

		}
	}

	@When("Validate the Course created popup and Course created Success message.")
	public void validate_the_course_created_popup_and_course_created_success_message() {
		try {
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.courseCreatedPopup);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.courseCreatedSuccess);
		} catch (Exception e) {

		}
	}

	@Then("Click on view course button and validate the Course page")
	public void click_on_view_course_button_and_validate_the_course_page() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.viewCourseButton);
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.courseNameInCoursePage);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.courseNameInCoursePage);
		} catch (Exception e) {

		}
	}

	@When("Click on turn editing on button and select the Add An Activity or Resource from Add activity dropdown")
	public void click_on_turn_editing_on_button_and_select_the_add_an_activity_or_resource_from_add_activity_dropdown() {
		try {
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.turnEditingOnButton);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.addAnActivity);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.addAnActivityorResource);
		} catch (Exception e) {

		}
	}

	@When("Validate the Add An Activity or Resource popup and click on File Activity")
	public void validate_the_add_an_activity_or_resource_popup_and_click_on_file_activity() {
		try {
			ManageLearnPlanPageActions.waitUntilElementVisible(driver,
					manageLearnPlanObjects.addAnActivityorResourcePopup);
			ManageLearnPlanPageActions.assertElementVisibility(driver,
					manageLearnPlanObjects.addAnActivityorResourcePopup);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.fileActivity);
		} catch (Exception e) {

		}
	}

	@When("Enter the File name and click on Upload document icon")
	public void enter_the_file_name_and_click_on_upload_document_icon() {
		try {
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.editingFilePage);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.editingFilePage);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.fileNameTextBox,
					ManageLearnPlanTestData.fileName);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.uploadFile);
		} catch (Exception e) {

		}
	}

	@When("Validate the File Picker popup and click on Recent files")
	public void validate_the_file_picker_popup_and_click_on_recent_files() {
		try {
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.filePickerPopup);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.filePickerPopup);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.recentFiles);
		} catch (Exception e) {

		}
	}

	@When("Click on document name and click on select this file button")
	public void click_on_document_name_and_click_on_select_this_file_button() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.documentFile);
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.selectThisFileButton);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.selectThisFileButton);
		} catch (Exception e) {

		}
	}

	@Then("Click on save and Return to course button and validate the File activity in course page")
	public void click_on_save_and_return_to_course_button_and_validate_the_file_activity_in_course_page() {
		try {
			ManageLearnPlanPageActions.waitUntilElementVisible(driver,
					manageLearnPlanObjects.saveAndReturnToCourseButton);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.saveAndReturnToCourseButton);
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.fileNameInCoursePage);
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.fileNameInCoursePage);
		} catch (Exception e) {

		}
	}

	@When("Click on Company Dashboard and Company Dashboard page should be open")
	public void click_on_company_dashboard_and_company_dashboard_page_should_be_open() {
		try {
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);
			ManageLearnPlanPageActions.javaScriptClicker(driver, manageLearnPlanObjects.companyDashboard);
		} catch (Exception e) {
			System.out.println("Exception while click on Company Dashboard: " + e);
		}
	}

	@When("Validate the Company Dashboard Page and Click on Manage Learning Plans from Training Management")
	public void validate_the_company_dashboard_page_and_click_on_manage_learning_plans_from_training_management() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.companyManagement);
			ManageLearnPlanPageActions.javaScriptClicker(driver, manageLearnPlanObjects.manageLearningPlans);
		} catch (Exception e) {
			System.out.println("Exception while click on Manage Learning Plans: " + e);
		}

	}

	@When("Validate the Manage Learning Plans Page and Click on Add Learning Plan button")
	public void validate_the_manage_learning_plans_page_and_click_on_add_learning_plan_button() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.totalCourses);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.addLearningPlan);
		} catch (Exception e) {
			System.out.println("Exception while click on Add Learning Plans: " + e);
		}
	}

	@Then("Validate the Create A Learning Plan Popup after clicking on Add Learning Plan button")
	public void validate_the_create_a_learning_plan_popup_after_clicking_on_add_learning_plan_button() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.createALearningPlan);
			System.out.println("Create A Learning Plan Popup Open Successfully");
		} catch (Exception e) {
			System.out.println("Exception while validating The Create a Learning plan Popup : " + e);
		}
	}

	@When("Enter the Learning Plan full name and Short name")
	public void enter_the_learning_plan_full_name_and_short_name() {
		try {
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.lpFullName,
					ManageLearnPlanTestData.lpFullName);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.lpShortName,
					ManageLearnPlanTestData.lpShortName);
		} catch (Exception e) {
			System.out.println("Exception while entering fullname and shortname: " + e);
		}
	}

	@When("choose the Status and click Issue certificate is on")
	public void choose_the_status_and_click_issue_certificate_is_on() {
		try {
			ManageLearnPlanPageActions.dropDownMethod(manageLearnPlanObjects.lpStatus, ManageLearnPlanTestData.status);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.issueCertificate);
		} catch (Exception e) {
			System.out.println("Exception while choose the Status and click Issue certificate is on: " + e);
		}
	}

	@When("enter Learning Plan ID Number and Training area and credits and lp code")
	public void enter_learning_plan_id_number_and_training_area_and_credits_and_lp_code() {
		try {
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.idNumber, ManageLearnPlanTestData.idNum);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.trainingArea,
					ManageLearnPlanTestData.trainArea);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.credits,
					ManageLearnPlanTestData.credits);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.lpCode, ManageLearnPlanTestData.lpCode);
		} catch (Exception e) {
			System.out.println(
					"Exception while enter Learning Plan ID Number and Training area and credits and lp code: " + e);
		}
	}

	@When("select the lp picture and click save button")
	public void select_the_lp_picture_and_click_save_button() {
		try {
			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.lpPicture);

			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.lpPicture);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.lpSaveButton);
		} catch (Exception e) {
			System.out.println("Exception while select the lp picture and click save button: " + e);
		}
	}

	@Then("Validate the Learning Plan was created Successfully message appears")
	public void validate_the_learning_plan_was_created_successfully_message_appears() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.lpCreatedSuccessfully);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.closeIcon);
			System.out.println("Learning plan created successfully");
		} catch (Exception e) {
			System.out.println(
					"Exception while Validate the Learning Plan was created Successfully message appears: " + e);
		}

	}

	@When("search and click on manage learning plan")
	public void search_and_click_on_manage_learning_plan() {
		try {
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.lpSearchBox);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.lpSearchBox,
					ManageLearnPlanTestData.lpFullName);

			ManageLearnPlanPageActions.waitUntilElementVisible(driver, manageLearnPlanObjects.createdLPName);

			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.lpName);
		} catch (Exception e) {
			System.out.println("Exception while search and click on manage learning plan: " + e);
		}
	}

	@When("click Add Step button and enter Title")
	public void click_add_step_button_and_enter_title() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.addStepButton);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.stepTitle,
					ManageLearnPlanTestData.stepTitle);
		} catch (Exception e) {
			System.out.println("Exception while click Add Step button and enter Title: " + e);
		}
	}

	@When("click on Map Course button and search course in Map Course popup")
	public void click_on_map_course_button_and_search_course_in_map_course_popup() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.mapCourseButton);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.searchLPCourse,
					ManageLearnPlanTestData.courseFullName);
		} catch (Exception e) {
			System.out
					.println("Exception while click on Map Course button and search course in Map Course popup: " + e);
		}
	}

	@When("select the Course and click on Add button")
	public void select_the_course_and_click_on_add_button() {
		try {
			ManageLearnPlanPageActions.dropDownMethod(manageLearnPlanObjects.PotentialCourse,
					ManageLearnPlanTestData.courseFullName);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.courseAddButton);
		} catch (Exception e) {
			System.out.println("Exception while select the Course and click on Add button: " + e);
		}
	}

	@When("click on submit and click on confirm in popup")
	public void click_on_submit_and_click_on_confirm_in_popup() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.submitButton);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.confirmButton);

		} catch (Exception e) {
			System.out.println("Exception while click on submit and click on confirm in popup: " + e);
		}
	}

	@When("Validate the Course mapped Successfully message appears and Close the popup")
	public void validate_the_course_mapped_successfully_message_appears_and_close_the_popup() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.courseMapSuccess);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.closeIcon);
		} catch (Exception e) {
			System.out.println(
					"Exception while Validate the Course mapped Successfully message appears and Close the popup: "
							+ e);
		}
	}

	@When("click on required and save button")
	public void click_on_required_and_save_button() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.courseRequired);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.saveButton);

		} catch (Exception e) {
			System.out.println("Exception while click on required and save button: " + e);
		}
	}

	@Then("Validate the Update Successfully message for Step1")
	public void validate_the_update_successfully_message_for_step1() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.updateSuccessMessage);
			System.out.println("Update Successfully message appeared");
		} catch (Exception e) {
			System.out.println("Exception while Validate the Update Successfully message for Step1: " + e);
		}
	}

	@When("click on Manage Learning Plans in bread crumbs")
	public void click_on_manage_learning_plans_in_bread_crumbs() {
		try {
			manageLearnPlanObjects = new ManageLearningPlanObjects(driver);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.breadCManageLearningPlan);
		} catch (Exception e) {
			System.out.println("Exception while click on Manage Learning Plans in bread crumbs: " + e);

		}

	}

	@When("search and click on checkbox nearby the learning plan")
	public void search_and_click_on_checkbox_nearby_the_learning_plan() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.lpSearchBox);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.lpSearchBox,
					ManageLearnPlanTestData.lpFullName);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.learningPlanCheckBox);
		} catch (Exception e) {
			System.out.println("Exception while search and click on checkbox nearby the learning plan: " + e);

		}
	}

	@When("click on Map learner button and search learner in Map Learner popup")
	public void click_on_map_learner_button_and_search_learner_in_map_learner_popup() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.mapLearnerButton);
			ManageLearnPlanPageActions.sendKeys(driver, manageLearnPlanObjects.mapUserSearchBox,
					ManageLearnPlanTestData.learnermail);

		} catch (Exception e) {
			System.out.println(
					"Exception while click on Map learner button and search learner in Map Learner popup: " + e);

		}
	}

	@When("select the learner and click on Add button")
	public void select_the_learner_and_click_on_add_button() {
		try {
			ManageLearnPlanPageActions.dropDownMethod(manageLearnPlanObjects.potentialusersList,
					ManageLearnPlanTestData.learnerName);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.addUserButton);
		} catch (Exception e) {
			System.out.println("Exception while select the learner and click on Add button: " + e);

		}
	}

	@When("click on submit button and click on confirm in popup")
	public void click_on_submit_button_and_click_on_confirm_in_popup() {
		try {
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.submitButton);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.confirmButton);
		} catch (Exception e) {
			System.out.println("Exception while click on submit button and click on confirm in popup: " + e);

		}
	}

	@When("Validate the learner mapped Successfully message appears and Close the popup")
	public void validate_the_learner_mapped_successfully_message_appears_and_close_the_popup() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.learnerMappedSuccess);
			ManageLearnPlanPageActions.clickElement(driver, manageLearnPlanObjects.mapLearnerCloseIcon);
		} catch (Exception e) {
			System.out.println(
					"Exception while Validate the learner mapped Successfully message appears and Close the popup: "
							+ e);

		}
	}

	@Then("Validate the User presented in Users Column")
	public void validate_the_user_presented_in_users_column() {
		try {
			ManageLearnPlanPageActions.assertElementVisibility(driver, manageLearnPlanObjects.validateUserColumn);
			System.out.println("Learner Mapped Successfully");
		} catch (Exception e) {
			System.out.println("Exception while Validate the User presented in Users Column: " + e);

		}
	}

}
