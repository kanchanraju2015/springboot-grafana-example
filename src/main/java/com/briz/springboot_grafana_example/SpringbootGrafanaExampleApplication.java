package com.briz.springboot_grafana_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



// pom.xml file- web,actuator and prometheus dependency must for grafana 
// also see the application.properties for actuator and prometheus 
// first start springboot application as well as prometheus server 9090 get the dashboard for query
// prometheus.exe is in D drive my system prometheus must be running for grafana 
// start the grafana server at port number 3000 see the ui
// c:/program files and under bin folder grafana-server.exe 
// set the data source and create the dashboard for data visualization 
@SpringBootApplication
public class SpringbootGrafanaExampleApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootGrafanaExampleApplication.class, args);
	}
}
