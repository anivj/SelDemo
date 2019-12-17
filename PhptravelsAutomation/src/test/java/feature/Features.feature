@TestDemo
Feature: login verification

	Scenario Outline: Valid Login
		Given Launch the browser and Navigate login page
		When User Enter the username <"username"> and password <"password">
		And Click on Login button
		Then Verify Home is displayed 
		
		Examples:
		|username|password|
		|ddd|fubf|
		|ddd|fubf|
		|ddd|fubf|
		