Spring confifuration:
web.xml
<listener>
   <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>
  
   <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/beans.xml</param-value>
    </context-param>
    
    Servlet code:
    public void init(ServletConfig config) {
		//get the application context
		 context =WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
		 service = (RegitrationService) context.getBean("regitrationService");
	}
  
  pom dependencies:
  		<!-- https://mvnrepository.com/artifact/org.springframework/spring-web -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>5.3.10</version>
</dependency>
		
		    <!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.3.10</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.10</version>
</dependency>

