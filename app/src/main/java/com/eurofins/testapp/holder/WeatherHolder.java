package com.eurofins.testapp.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.eurofins.testapp.R;


public class WeatherHolder extends RecyclerView.ViewHolder {

    public CardView cardContact;
    public TextView date;
    public TextView weatherSummary;
    public TextView temperature;
    public ImageView imgContact;

    public WeatherHolder(View itemView) {
        super(itemView);
        cardContact = (CardView) itemView.findViewById(R.id.cardContact);
        date = (TextView) itemView.findViewById(R.id.date);
        weatherSummary = (TextView) itemView.findViewById(R.id.weatherSummary);
        temperature = (TextView) itemView.findViewById(R.id.temperature);
        imgContact = (ImageView) itemView.findViewById(R.id.imgContact);
    }
}
