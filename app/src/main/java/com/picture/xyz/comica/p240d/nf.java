package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p458d.p474n.ub;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.k */
public class nf extends jm {

    /* renamed from: c */
    private static String f39405c = "lucid";

    public nf(Context context) {
        this.f39361b = f39405c;
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        ub cVar = new ub(context);
        this.f39360a = cVar;
        return cVar;
    }

    /* renamed from: e */
    public void mo51862e(LinearLayout linearLayout, Activity activity) {
        linearLayout.addView(super.mo51863a(jh.f39467b, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39476k, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39474i, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39473h, activity, this.f39360a), linearLayout.getChildCount());
    }
}
