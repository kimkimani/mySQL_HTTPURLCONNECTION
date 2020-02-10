package com.example.kim.mysql;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;

public class Connector {
    public static Object  ( String urlAddress)
    {

        try {
            URI uri= new URI(urlAddress);
            HttpURLConnection conn =( HttpURLConnection) url.openConnectio();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(15000);
            conn.setDoInput(true);
            return conn;

        }catch (MalformedURLException e){
            e.printStackTrace();
            return "Error"+e.getMessage();
        }catch (IOException e){
            e.printStackTrace();
            return "Error"+e.getMessage();

        }


    }



}



