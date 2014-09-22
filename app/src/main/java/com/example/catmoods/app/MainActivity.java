package com.example.catmoods.app;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.first_project.app.R;


public class MainActivity extends ActionBarActivity {

    private String moods(String mood){
        String[][] list={
                {"HAPPY","http://cathospitalofbrampton.com/wp-content/uploads/2013/04/happy-cat1.jpg"},
                {"SAD","http://kittentoob.com/wp-content/uploads/sites/4/2012/02/sad-cat.jpg"},
                {"GRUMPY","http://rack.0.mshcdn.com/media/ZgkyMDEzLzA5LzE4LzU1L2dydW1weWNhdC5kZmM3MC5wbmcKcAl0aHVtYgkxMjAweDYyNyMKZQlqcGc/23ab625d/c84/grumpycat.jpg"},
                {"ANGRY","http://www.99hdwallpaper.com/tiger/wallpapers/angry-tiger-wallpaper.jpg"},
                {"AFRAID","http://kity.org/wp-content/kitty/2009/03/kittens-3.jpg"},
                {"FACEPALM","http://th08.deviantart.net/fs71/PRE/i/2012/241/a/3/cat_facepalm_by_yurakaprosh-d5cx5e6.jpg"},
                {"NERVOUS","http://promoreports.in/MIS/scared-cat-gif-i15.gif"},
                {"DISGUST","http://www.tomstockton.us/pictures/051/disgusted_cat.jpg"},
                {"POOP","http://playtimepetcare.com/wp-content/themes/ptpc/images/dirty%20litter%20box.jpg"},
                {"EMBARRASSED","http://www.furallover.com/%5Cphoto%5COliver%20plays%20peek-a-boo.JPG"},
                {"DEPRESSED","http://symidream.com/wp/wp-content/uploads/2011/06/alarm-cat-symi-dream-003.jpg"},
                {"BORED","http://data3.whicdn.com/images/21529766/thumb.gif"},
                {"EXCITED","http://www.officeinferno.com/wp-content/uploads/2014/03/excited-cat.jpg"},
                {"SURPRISED","http://images.boomsbeat.com/data/images/full/24382/cat_2-png.png"},
                {"HATE","http://2.bp.blogspot.com/_5aRdIoThFIk/TQlRrqecHkI/AAAAAAAAA1E/PTChCvpSpWI/s1600/ihateeverything.jpg"},
                {"I HATE EVERYTHING", "http://2.bp.blogspot.com/_5aRdIoThFIk/TQlRrqecHkI/AAAAAAAAA1E/PTChCvpSpWI/s1600/ihateeverything.jpg"},
                {"PARTY","http://www.kulfoto.com/pic/0001/0031/b/F4s9R30330.jpg"}

        };
        for( int x=0;x<list.length;x++){
            if(list[x][0].equals(mood.toUpperCase()))
                return list[x][1];
        } return "https://i.chzbgr.com/maxW500/5078268672/h9CA51DAA/";
    }

    public void buttonOnClick(View v) {
        Button button=(Button) v;
        button.setText("Mood Gotten!");
        EditText editText=(EditText)
                findViewById(R.id.editText);
        String url = moods(editText.getText().toString());
        WebView webView=(WebView)
                findViewById(R.id.webView);
        webView.setInitialScale(65);
        WebSettings webSettings = webView.getSettings();
        webSettings.setUseWideViewPort(true);
        webView.loadUrl(url);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
