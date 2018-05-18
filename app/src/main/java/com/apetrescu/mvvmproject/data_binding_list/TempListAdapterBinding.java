package com.apetrescu.mvvmproject.data_binding_list;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.apetrescu.mvvmproject.R;
import com.apetrescu.mvvmproject.databinding.ListItemBindingBinding;
import com.apetrescu.mvvmproject.model.TemperatureData;

import java.util.List;

/**
 * Created by apetrescu on 10/25/2017.
 */

public class TempListAdapterBinding extends RecyclerView.Adapter<TempViewHolderBinding> {

    private List<TemperatureData> mTemperatures;

    public TempListAdapterBinding(List<TemperatureData> mTemperatures) {
        this.mTemperatures = mTemperatures;
    }

    @Override
    public TempViewHolderBinding onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListItemBindingBinding bindingItem =
                DataBindingUtil.inflate(layoutInflater, R.layout.list_item_binding, parent, false);
        return new TempViewHolderBinding(bindingItem);
    }

    @Override
    public void onBindViewHolder(TempViewHolderBinding holder, int position) {
        TemperatureData temp = mTemperatures.get(position);
        holder.binding.setTempData(temp);
    }

    @Override
    public int getItemCount() {
        return mTemperatures.size();
    }
}
