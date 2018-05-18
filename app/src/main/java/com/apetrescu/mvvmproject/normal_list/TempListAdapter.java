package com.apetrescu.mvvmproject.normal_list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.apetrescu.mvvmproject.R;
import com.apetrescu.mvvmproject.model.TemperatureData;

import java.util.List;

/**
 * Created by apetrescu on 10/25/2017.
 */

public class TempListAdapter extends RecyclerView.Adapter<TempViewHolder>{

    private List<TemperatureData> mTemperatures;

    public TempListAdapter(List<TemperatureData> mTemperatures) {
        this.mTemperatures = mTemperatures;
    }

    @Override
    public TempViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TempViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(TempViewHolder holder, int position) {
        TemperatureData temp = mTemperatures.get(position);
        holder.setTemp(temp);
    }

    @Override
    public int getItemCount() {
        return mTemperatures.size();
    }
}
