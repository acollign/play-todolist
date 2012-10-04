package controllers;

import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

import models.Task;

public class Application extends Controller {

  static Form<Task> taskForm = form(Task.class);

  public static Result index() {
    return redirect(routes.Application.tasks());
  }

  public static Result tasks() {
    return TODO;
  }
  
  public static Result newTask() {
    return TODO;
  }
  
  public static Result deleteTask(Long id) {
    return TODO;
  }
}