package controllers;

import models.Configuration;
import play.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by conicoll on 2015-12-18.
 */
public class Application extends Controller
{

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result main() {
        Configuration config = new Configuration();
        config.baseUrl = Play.application().configuration().getString("baseUrl");
        config.googleAnalyticsKey = Play.application().configuration().getString("google.analytics.key");

        return ok(views.html.worm.mainapp.render(config));
    }

}