Feature:
Testcases to validate the GetAllUsers API functionality

Scenario: Testcase to validate the GetAllUsers API success call
	Given User has all the GetAllUsers API specification
	When User makes a GET call to GetAllUsers API
	Then User receives a response with status code 200
	Then User received a response with "page" value 1
	Then User received a response with "per_page" value 6
  Then User received a response with "total" value 12
  Then User received a response with "total_pages" value 2