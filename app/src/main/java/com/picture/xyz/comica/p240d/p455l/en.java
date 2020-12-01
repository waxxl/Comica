package com.picture.xyz.comica.p240d.p455l;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.picture.xyz.comica.p240d.jm;
import com.picture.xyz.comica.p241e.p242c.hn;
import com.picture.xyz.comica.p241e.p242c.tk;
import com.picture.xyz.comica.p241e.p242c.tm;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.comica.Face2;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.l.b */
public class en extends jm {

    /* renamed from: c */
    int f39407c;

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        tk a = hn.m21099a((Face2) null, this.f39407c);
        this.f39360a = a;
        return a;
    }

    /* renamed from: e */
    public void mo51862e(LinearLayout linearLayout, Activity activity) {
        linearLayout.addView(mo51863a(jh.f39478m, activity, this.f39360a), linearLayout.getChildCount());
        linearLayout.addView(mo51863a(jh.f39477l, activity, this.f39360a), linearLayout.getChildCount());
    }

    /* renamed from: g */
    public BasicFilter mo51897g(Face2[] hVarArr) {
        tm hVar = new tm(hVarArr, this.f39407c);
        this.f39360a = hVar;
        return hVar;
    }
}
