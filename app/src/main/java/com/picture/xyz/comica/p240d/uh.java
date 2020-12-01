package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p458d.p481u.bb;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.l0 */
public class uh extends jm {

    /* renamed from: c */
    private static String f39409c = "glam";

    public uh(Context context) {
        this.f39361b = f39409c;
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        bb bVar = new bb(context);
        this.f39360a = bVar;
        return bVar;
    }

    /* renamed from: e */
    public void mo51862e(LinearLayout linearLayout, Activity activity) {
        linearLayout.addView(super.mo51863a(jh.f39467b, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39476k, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(super.mo51863a(jh.f39474i, activity, this.f39360a), linearLayout.getChildCount());
    }
}
