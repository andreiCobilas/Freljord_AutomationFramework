package com.Freljord.Infrastructure.Helper.Utility;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Resource {

    public static String getResourcePath(String resource) {

        URL url = Resource.class.getResource("/" + resource);

        try {
            return Paths.get(url.toURI()).toFile().getAbsolutePath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
