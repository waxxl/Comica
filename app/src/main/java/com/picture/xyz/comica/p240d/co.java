package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p458d.p468h.qa;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.e0 */
public class co extends jm {

    /* renamed from: c */
    private static String f39395c = "plain";

    public co(Context context) {
        this.f39361b = f39395c;
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        qa aVar = new qa(context, false, R.drawable.water);
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
