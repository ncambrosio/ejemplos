Proyecto que alberga un prototipo simple:

Spring 4 MVC
Angular.js

Configuración Spring: 
	code-based configuration (extendiendo 'AbstractAnnotationConfigDispatcherServletInitializer') 
	+ applicationContext.xml
	+ applicationProperties.xml

Añadido ejemplo de como funciona sesiones en SpringMVC
 	- visto en: https://www.intertech.com/Blog/understanding-spring-mvc-model-and-session-attributes/
 	
Añadido listener para configurar el tiempo máximo de sessión programaticamente
	- ver: MainSessionListener.java
	- ver: MaingConfiguracion.onStartUp()