package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p458d.p478r.oc;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.y */
public class ge extends jm {

    /* renamed from: c */
    private static String f39438c = "cmarker";

    public ge(Context context) {
        this.f39361b = f39438c;
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        oc aVar = new oc(context);
        this.f39360a = aVar;
        return aVar;
    }

    /* renamed from: e */
    public void mo51862e(LinearLayout linearLayout, Activity activity) {
        linearLayout.addView(super.mo51863a(jh.f39467b, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39476k, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39474i, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39473h, activity, this.f39360a), linearLayout.getChildCount());
    }
}