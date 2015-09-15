package appewtc.masterung.krutraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 9/15/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int[] iconAnInt;
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context objContext, int[] iconAnInt, String[] titleStrings, String[] detailStrings) {
        this.objContext = objContext;
        this.iconAnInt = iconAnInt;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        //Insert Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconAnInt[i]);

        //Insert Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(titleStrings[i]);

        //Insert Detail
        TextView detailTextView = (TextView) objView1.findViewById(R.id.txtShowDetail);
        detailTextView.setText(detailStrings[i]);

        return objView1;
    }
}   // Main Class
