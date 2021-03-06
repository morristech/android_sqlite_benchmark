package com.techyourchance.sqlitebenchmark.dependencyinjection.controller;

import android.content.Context;
import android.view.LayoutInflater;

import com.techyourchance.sqlitebenchmark.screens.common.mvcviews.ViewMvcFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewMvcModule {

    @Provides
    LayoutInflater layoutInflater(Context context) {
        return LayoutInflater.from(context);
    }

    @Provides
    ViewMvcFactory viewMvcFactory(LayoutInflater layoutInflater) {
        return new ViewMvcFactory(layoutInflater);
    }

}
