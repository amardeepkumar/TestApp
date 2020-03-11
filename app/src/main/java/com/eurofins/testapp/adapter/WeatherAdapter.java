package com.eurofins.testapp.adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.eurofins.testapp.R;
import com.eurofins.testapp.dto.Weather;
import com.eurofins.testapp.dto.WeatherForecast;
import com.eurofins.testapp.holder.WeatherHolder;
import com.eurofins.testapp.utils.DateUtil;
import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherHolder> {

    List<WeatherForecast> list = Collections.emptyList();
    Context context;

    public WeatherAdapter(List<WeatherForecast> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public WeatherHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_contact_row_layout, parent, false);

        return new WeatherHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(WeatherHolder holder, int position) {

        // Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.date.setText(DateUtil.getDate(list.get(position).getDate()));
        holder.weatherSummary.setText(list.get(position).getSummary());
        holder.temperature.setText("Temperature: " + list.get(position).getTemperatureC() + (char) 0x00B0 + "C " + list.get(position).getTemperatureF() + (char) 0x00B0 + "F");
        Picasso.get().load(list.get(position).getSummary()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.imgContact);

        // animate(holder);
    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
