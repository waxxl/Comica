package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.NoFilter;

/* renamed from: d.v */
public class rn extends jm {

    /* renamed from: c */
    private static String f39419c = "no filter";

    public rn(Context context) {
        this.f39361b = f39419c;
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        return new NoFilter();
    }

    /* renamed from: e */
    public void mo51862e(LinearLayout linearLayout, Activity activity) {
    }
}
