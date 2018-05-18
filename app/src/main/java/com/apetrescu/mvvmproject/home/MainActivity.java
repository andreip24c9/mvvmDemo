package com.apetrescu.mvvmproject.home;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.apetrescu.mvvmproject.R;
import com.apetrescu.mvvmproject.data_binding_list.TempListAdapterBinding;
import com.apetrescu.mvvmproject.databinding.ActivityMainBinding;
import com.apetrescu.mvvmproject.settings.SettingsActivity;
import com.apetrescu.mvvmproject.model.TemperatureData;
import com.apetrescu.mvvmproject.normal_list.TempListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = /*ActivityMainBinding.inflate(getLayoutInflater());*/
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());

        TemperatureData temperatureData = new TemperatureData("10", "Bucuresti", ContextCompat.getDrawable(this, R.drawable.w1));
        binding.setTemp(temperatureData);
        binding.setPresenter(mainActivityPresenter);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        TempListAdapter adapter = new TempListAdapter(getMockList());
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);

        RecyclerView listBinding = binding.listBinding;
        TempListAdapterBinding adapterB = new TempListAdapterBinding(getMockList());
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        listBinding.setAdapter(adapterB);
        listBinding.setLayoutManager(llManager);
    }

    public List<TemperatureData> getMockList() {
        List<TemperatureData> temp = new ArrayList<>();
        temp.add(new TemperatureData("10", "Bucharest", ContextCompat.getDrawable(this, R.drawable.w1)));
        temp.add(new TemperatureData("6", "London", ContextCompat.getDrawable(this, R.drawable.w1)));
        temp.add(new TemperatureData("8", "Tilburg", ContextCompat.getDrawable(this, R.drawable.w1)));
        temp.add(new TemperatureData("9", "Amsterdam", ContextCompat.getDrawable(this, R.drawable.w1)));
        temp.add(new TemperatureData("12", "Berlin", ContextCompat.getDrawable(this, R.drawable.w1)));
        temp.add(new TemperatureData("14", "Bruxelles", ContextCompat.getDrawable(this, R.drawable.w1)));
        temp.add(new TemperatureData("16", "Bruges", ContextCompat.getDrawable(this, R.drawable.w1)));
        return temp;
    }

    @Override
    public void showData(TemperatureData temperatureData) {
//        String celsius = temperatureData.getTemperature();
        Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void openSettings() {
        startActivity(new Intent(this, SettingsActivity.class));
    }
}
