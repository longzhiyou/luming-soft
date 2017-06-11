package com.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@SpringBootApplication
public class LumingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LumingApplication.class, args);
	}

	@Bean
	public ScriptEngineManager getScriptEngineManager(){
		return new ScriptEngineManager();
	}

	@Bean
	public ScriptEngine getScriptEngine(ScriptEngineManager scriptEngineManager){
		return scriptEngineManager.getEngineByName("groovy");

	}
}
