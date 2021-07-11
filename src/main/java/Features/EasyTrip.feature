 Feature: Login into EasyTrip
 
 Scenario Outline: Click on LogIn button
 
 Given User Navigate to Login Page
 When Validate the title of the Page
 Then Click on My Account 
 Then Click on Sign in button
 Then Enter	"<Email>" and "<Password>"
 Then Click on Log in button
 
 Examples:
 | Email | Password|
  |Test@gmail.com|Password@123|
  
# Scenario: Navgate different services
#  
# Given User Navigate to Login Page
# When Validate the title of the Page
# Then Click on Flights 
# Then Click on Hotels 
# Then Click on Train
# Then Click on Bus
# Then Click on Cab
# Then Click on giftcard 
# 
# 