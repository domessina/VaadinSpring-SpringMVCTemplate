###enTrain
==============

Template for a simple Vaadin application that  works with SpringMVC and SpringWebFlow for dedicated URL
localhost:8080/spring ------->uses Spring MVC and JSP resolver
localhost:8080/vaadin/main--->uses VaadinSpringServlet

Workflow
========

Jetty
-----

To compile the entire project, run "mvn install".

To run the application, run "mvn jetty:run" and open http://localhost:8080/ .

Debugging client side code
  - run "mvn vaadin:run-codeserver" on a separate console while the application is running
  - activate Super Dev Mode in the debug window of the application

To produce a deployable production mode WAR:
- change productionMode to true in the servlet class configuration (nested in the UI class)
- run "mvn clean package"
- test the war file with "mvn jetty:run-war"


Tomcat
-------

Create a run configuration for local tomcat in you IDE
