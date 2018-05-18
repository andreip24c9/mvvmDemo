package com.apetrescu.mvvmproject.data_binding_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apetrescu.mvvmproject.R;
import com.apetrescu.mvvmproject.databinding.ListItemBindingBinding;
import com.apetrescu.mvvmproject.model.TemperatureData;

/**
 * Created by apetrescu on 10/25/2017.
 */

public class TempViewHolderBinding extends RecyclerView.ViewHolder {
    ListItemBindingBinding binding;

    public TempViewHolderBinding(View itemView) {
        super(itemView);
    }

    public TempViewHolderBinding(ListItemBindingBinding bindingItem) {
        this(bindingItem.getRoot());
        this.binding = bindingItem;
    }
}
