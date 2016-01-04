package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.F;
import play.libs.F.Promise;
import play.libs.ws.WS;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.util.*;

import static play.libs.Json.toJson;

/**
 * Created by conicoll on 2015-12-18.
 */
public class Characters extends Controller
{

    public Promise<Result> getCharacters()
    {
        String webUrl = "http://localhost:8080/api/worm";
        Promise<WSResponse> characters = WS.url(webUrl).get();
        return characters.map(new F.Function<WSResponse, Result>() {
            @Override
            public Result apply(WSResponse wsResponse) throws Throwable {
                JsonNode json = wsResponse.asJson();
                //return ok(json);
                return ok(views.html.characters.render());
            }
        });
    }
}