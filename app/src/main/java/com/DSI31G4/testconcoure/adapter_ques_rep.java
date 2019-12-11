package com.DSI31G4.testconcoure;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter_ques_rep extends ArrayAdapter
{
    private ArrayList questionsList;
    private ArrayList reponsesList;

    public adapter_ques_rep(Context context, ArrayList questionsList, ArrayList reponsesList)
    {
        super(context, 0, questionsList);
        this.questionsList = questionsList;
        this.reponsesList = reponsesList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_ques_rep_cours, parent, false);
        }

        TextView question = convertView.findViewById(R.id.cours_question);
        TextView reponse = convertView.findViewById(R.id.cours_reponse);

        question.setText((String)questionsList.get(position));
        reponse.setText((String)reponsesList.get(position));

        return convertView;
    }
}
