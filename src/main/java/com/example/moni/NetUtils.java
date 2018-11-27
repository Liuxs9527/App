package com.example.moni;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetUtils {

    public  static  NetUtils instance;

    public NetUtils() {
    }
    public  static  NetUtils getInstance()
    {
        if(instance==null)
        {
            instance=new NetUtils();
        }
        return  instance;
    }
    public  interface  Callback<T>{
        void  onsuccess(T t);

    }
    public  void getRequest(final String  urlstr, final Class clazz,final Callback callback)
    {
        new AsyncTask<String,Void,Object>()
        {
            @Override
            protected Object doInBackground(String... strings) {
                return getRequest(strings[0],clazz);
            }

            @Override
            protected void onPostExecute(Object o) {
                callback.onsuccess(o);
            }
        }.execute(urlstr);
    }
    public  <T> T getRequest(String urlStr,Class clazz)
    {
        return (T) new Gson().fromJson(getRequest(urlStr),clazz);
    }
    public String getRequest(String urlStr){
        String result = "";
        try {
            URL url = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(5000);
            urlConnection.setConnectTimeout(5000);
            int responseCode = urlConnection.getResponseCode();
            if(responseCode == 200){
                result = stream2String(urlConnection.getInputStream());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    private String stream2String(InputStream inputStream) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        for (String tmp = br.readLine();tmp!=null;tmp = br.readLine()){
            builder.append(tmp);
        }
        return builder.toString();
    }



}
