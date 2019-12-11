package com.DSI31G4.testconcoure;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter_examen extends ArrayAdapter
{
    private ArrayList imageList;
    private ArrayList textList;

    public adapter_examen(Context context, ArrayList imageList, ArrayList textList)
    {
        super(context, 0, textList);
        this.imageList = imageList;
        this.textList = textList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_examen, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image_examen);
        TextView textView1 = convertView.findViewById(R.id.text_examen);

        imageView.setImageResource((Integer)imageList.get(position));
        textView1.setText((String)textList.get(position));

        return convertView;
    }
}
