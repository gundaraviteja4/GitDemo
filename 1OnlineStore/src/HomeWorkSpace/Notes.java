package HomeWorkSpace;
public class Notes {

	
	// for formatting the structure - Ctrl+Shift+F
	// while defining variables and method names should be 1st letter small and 1st letter of 2nd word should be Capital ex: sumCount
	// validating xpath in console $x("")
	//validating css in console $("")
	//xpath syntax //tagname[@attribute='value']
	// css syntax tagname[attribute='value']
	//css another syntax- tagname#id
	//css another syntax- tagname.classname
	// Regular Expression-xpath syntax //tagname[contains(@attribute,'value')]   --- if the subtext is common and other part is changing then we use this one
	// Regular expression syntax-css syntax   tagname[attribute*='value']
	
	//Static drop down is identified/defined if it uses select attribute
	/*  Every object may not have ID, className or name- Xpath and CSS Preferred
	Alpha numeric id may vary on every refresh- check
	Confirm the link object with anchor "a" tag
	Classes should not have spaces- Compound classes cannot be accepted
	Multiple values - Selenium identifies the first one- Scans from top left
	Double quotes inside double quotes are not accepted
	Xpath/CSS  can be defined in n number of ways
	Rightclick copy on blue highlighted html code to generate xpath
	Firepath depreciated from firefox- 
	when xpath starts with html-Not reliable- Switch browser to get another one
	There is no direct way to get CSS in chrome. You will find it in tool bar
	Degrade browser to less firefox 55 to get Firepath
	$("") - for css ,    $x("")   or xpath
	//tagName[@attribute='value']  - xpath syntax
	tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS
	//tagName[contains(@attribute,'value')]  - xpath regular expression
	tagName[Atrribute*='value'] - Css regular expression   */
	// 2 types of Alerts - Web Alerts and Java Alerts
	// Web Alerts are find using driver  - through xpath, css etc
	// Java Alerts are find using alert method - need to switch from driver to alert class/method

	//To Create Maven Project run in cmd prompt: 		mvn archetype:generate -DgroupId=qaclickacademy -DartifactID=MavenArtifact -DarchetypeArtifactId=maven-archetype-quickstart -DInteractiveMode=false


	//	GoTo the folder in cmd prompt and to create .Class files run: mvn eclipse:eclipse
}
