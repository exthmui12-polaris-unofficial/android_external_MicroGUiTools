package com.takisoft.fix.support.v7.preference;

import android.os.Bundle;
import android.support.annotation.Nullable;

/** Compatibility adapter for microG UI code using the old Takisoft callback. */
public abstract class PreferenceFragmentCompat
        extends android.support.v7.preference.PreferenceFragmentCompat {
    @Override
    public final void onCreatePreferences(@Nullable Bundle savedInstanceState, String rootKey) {
        onCreatePreferencesFix(savedInstanceState, rootKey);
    }

    public abstract void onCreatePreferencesFix(@Nullable Bundle savedInstanceState, String rootKey);
}
