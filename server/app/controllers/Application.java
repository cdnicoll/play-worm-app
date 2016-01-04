package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created by conicoll on 2015-12-18.
 */
public class Application extends Controller
{

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

}