package com.apetrescu.mvvmproject.normal_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apetrescu.mvvmproject.R;
import com.apetrescu.mvvmproject.model.TemperatureData;

/**
 * Created by apetrescu on 10/25/2017.
 */

public class TempViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView cityLbl;
    private TextView temperatureLbl;

    TempViewHolder(View itemView) {
        super(itemView);
        cityLbl = itemView.findViewById(R.id.item_city_lb);
        temperatureLbl = itemView.findViewById(R.id.item_degrees_lb);
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public void setCityLbl(TextView cityLbl) {
        this.cityLbl = cityLbl;
    }

    public void setTemperatureLbl(TextView temperatureLbl) {
        this.temperatureLbl = temperatureLbl;
    }

    public void setTemp(TemperatureData temp) {
        if (temp != null) {
            this.temperatureLbl.setText(temp.getDegrees());
            this.cityLbl.setText(temp.getLocation());
        }
    }
}
