package appewtc.masterung.krutraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial Widget
        initialWidget();

    }   // Main Method

    private void initialWidget() {

        trafficListView = (ListView) findViewById(R.id.listTraffic);
        aboutMeButton = (Button) findViewById(R.id.btnAboutMe);

    }   // initialWidget


}   // Main Class นี่คือ คลาสหลัก เว้ยเห้ย
