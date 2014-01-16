package controllers;



import java.util.List;

import play.data.Form;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import models.Employee;

public class Application extends Controller {

	private static String MAGIC = "Hello There";

	
    public static Result index() {
        return ok(index.render("Your new application is ready. "+MAGIC));
    }

    
    public static Result addEmployee() {
    	Employee employee = Form.form(Employee.class).bindFromRequest().get();
    	employee.save();
    	return redirect(routes.Application.index());
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Result getEmployee() {
		List<Employee> employees = new Model.Finder(Long.class, Employee.class).all();
    	return ok(Json.toJson(employees));
    }

}
