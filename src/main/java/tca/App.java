package tca;

import static spark.Spark.*;

public class App {

	//---------------
	//--- Conectando
	//---------------
	public static void main(String[] args) {
	
	    port(getHerokuAssignedPort());

		get("/", (request,response) -> {
			
			String mensagem  = "<html><body><center>";
			       mensagem += "<br><br><br>";
			       mensagem += "<br><br><br>";
			       
			       mensagem += "<hr><br>";
			       
			       mensagem += "<font face=verdana size=3><b>";
			       mensagem += "PizzaDigital Inc.";
			       mensagem += "</b></font>";
			       
			       mensagem += "<br><br>";
			       
			       mensagem += "<font face=verdana size=1>";
			       mensagem += "RESTful Web Service: Java + Spark + MongoDB";
			       mensagem += "</b></font>";
			       
			       mensagem += "<br><br>";
			       
			       mensagem += "<font face=verdana size=1>";
			       mensagem += (new java.util.Date()).toGMTString();
			       mensagem += "</b></font>";
			       
			       mensagem += "<br><br><hr>";
			       
			       mensagem += "</center></body></html>";
			       
			return mensagem;
			
		});
		
		post("/" ,(request, response) -> "Acionou o  POST");
	}
	
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}
