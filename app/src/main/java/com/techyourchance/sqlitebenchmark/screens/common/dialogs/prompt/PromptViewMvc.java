package com.techyourchance.sqlitebenchmark.screens.common.dialogs.prompt;

import com.techyourchance.sqlitebenchmark.screens.common.mvcviews.ObservableViewMvc;

public interface PromptViewMvc extends ObservableViewMvc<PromptViewMvc.PromptViewMvcListener> {

    public interface PromptViewMvcListener {
        void onPositiveButtonClicked();
        void onNegativeButtonClicked();
    }

    void setTitle(String title);
    void setMessage(String message);
    void setPositiveButtonCaption(String positiveButtonCaption);
    void setNegativeButtonCaption(String negativeButtonCaption);

}
