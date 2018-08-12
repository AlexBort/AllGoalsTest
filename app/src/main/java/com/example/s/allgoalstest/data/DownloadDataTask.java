package com.example.s.allgoalstest.data;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class DownloadDataTask {

    public String executeInBackGround() {
        String result = " ";
        try {
            result = new AsyncJson().execute().get();
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return result;
    }


    private static class AsyncJson extends AsyncTask<Object, Object, String> {

        public static final String nameFile = "file.json";
        private static final String TAG = "AsyncJson";

        String url = "https://97455d02-e6ab-42da-8ae7-bc5178f5c7c7.mock.pstmn.io/scores";


        @Override
        protected String doInBackground(Object[] objects) {

            try {
                String json = Jsoup.connect(url)/*.ignoreContentType(true)*/.execute().body();

                return parseJson(json);

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        private String parseJson(String jsonInString) {
            try {
                JSONObject object = new JSONObject(jsonInString);
                JSONObject response = object.getJSONObject("response");
                JSONObject items = response.getJSONObject("items");
                JSONObject overview = items.getJSONObject("Overview");
                String result = overview.getString("leagues");
                Log.e(TAG, "parseJsonUntilObject: " + result);
                return result;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jsonInString;
        }

        private String parseJsonUntilObject(String jsonInString) {
            try {
                JSONObject object = new JSONObject(jsonInString);
                JSONObject response = object.getJSONObject("response");
                JSONObject items = response.getJSONObject("items");
                String result = items.getString("Overview");
                Log.e(TAG, "parseJsonUntilObject: " + result);
                return result;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jsonInString;
        }



    }


}
