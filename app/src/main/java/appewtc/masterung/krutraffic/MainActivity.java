package appewtc.masterung.krutraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        //Button Controller
        buttonController();

        //Create ListView
        createListView();


    }   // Main Method

    private void createListView() {

        //Setup Source of Image
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        //Setup of Title
        final String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลียวซ้าย";
        strTitle[1] = "ห้ามเลียวขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลียวขวา";
        strTitle[4] = "เลียวซ้าย";
        strTitle[5] = "หยุด";
        strTitle[6] = "ทางเข้า";
        strTitle[7] = "ทางออก";
        strTitle[8] = "หยุด";
        strTitle[9] = "จำกัดความสูง";
        strTitle[10] = "ทางแยก";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "ห้ามจอด";
        strTitle[13] = "รถสวน";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "ทางเข้า";
        strTitle[16] = "หยุดตรวจ";
        strTitle[17] = "จำกัดความเร็ว";
        strTitle[18] = "จำกัดความกว้าง";
        strTitle[19] = "จำกัดความสูง";

        //Setup Detail
        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);

        //Inebriate Adapter
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle, strDetail);
        trafficListView.setAdapter(objMyAdapter);


        //Active Click
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);

                objIntent.putExtra("Title", strTitle[i]);
                objIntent.putExtra("Image", intIcon[i]);
                objIntent.putExtra("Index", i);

                startActivity(objIntent);

            }   // event
        });



    }   // createListView


    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttonMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/K2BT1ZcYsMc"));
                startActivity(objIntent);

            }   // event
        });

    }   //buttonController

    private void initialWidget() {

        trafficListView = (ListView) findViewById(R.id.listTraffic);
        aboutMeButton = (Button) findViewById(R.id.btnAboutMe);

    }   // initialWidget


}   // Main Class นี่คือ คลาสหลัก เว้ยเห้ย
