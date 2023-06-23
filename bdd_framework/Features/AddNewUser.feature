Feature: add new user

Scenario: add new user with info
	Given launch browser
	When user open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	Then user enter username "Admin" and password as "admin123"
	And user click on loginbtn
	Then page title should be "OrangeHRM"
	And user click on admin tab
	Then click on Addbtn
	Then select user role as "Admin"
	Then enter employee name as "li"
	And select status as "Enabled"
	Then enter username as "AniketGG"
	Then enter password as "Aniket123@"
	Then enter confirm password as "Aniket123@"
	Then click on savebtn