package com.DSI31G4.testconcoure;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter_exercice_sport extends ArrayAdapter
{
    private ArrayList imageList;
    private ArrayList textList;

    public adapter_exercice_sport(Context context, ArrayList imageList, ArrayList textList)
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

      /*  TextView question = convertView.findViewById(R.id.quiz_question);
        TextView reponse1 = convertView.findViewById(R.id.quiz_reponse1);
        TextView reponse2 = convertView.findViewById(R.id.quiz_reponse2);
        TextView reponse3 = convertView.findViewById(R.id.quiz_reponse3);

        int nombreAleatoire;
        question.setText((String)imageList.get(position));
      */

        return convertView;
    }
}
