package controllers;

import play.*;
import play.mvc.*;
import play.libs.OAuth2;
import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static String fuck() {
        ////new OAuth2().retrieveAccessToken();
        return "fuck";
    }


}