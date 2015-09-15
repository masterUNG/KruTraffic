package appewtc.masterung.krutraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView titleTextView, detailTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    }   // Main Method

    @Override
    public void onBackPressed() {

        Toast.makeText(DetailActivity.this, "กดปุ่ม Back ดีกว่า", Toast.LENGTH_SHORT).show();

        //super.onBackPressed();
    }

    public void clickBack(View view) {
        finish();
    }


    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        imageView.setImageResource(intImage);

    }   // showView

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.txtShowTitleDetail);
        detailTextView = (TextView) findViewById(R.id.txtShowDetail);
        imageView = (ImageView) findViewById(R.id.imvShowImage);

    }   // bindWidget

}   // Main Class
