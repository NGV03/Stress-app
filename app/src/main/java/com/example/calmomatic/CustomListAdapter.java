package com.example.calmomatic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private  final Activity context;

    private final Integer[] imageIDarray;

    private final String[] nameArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, Integer[] imageIDarrayParam)
    {
        super(context,R.layout.listview_row, nameArrayParam);

        this.context=context;
        this.imageIDarray = imageIDarrayParam;
        this.nameArray = nameArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null,true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);

        nameTextField.setText(nameArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;
    };
}
