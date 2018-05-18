package com.apetrescu.mvvmproject.home;

import android.content.Intent;
import android.view.View;

import com.apetrescu.mvvmproject.settings.SettingsActivity;

/**
 * Created by apetrescu on 10/25/2017.
 */

public class MyHandlers {
    public void onClickFriend(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), SettingsActivity.class));
    }
}
