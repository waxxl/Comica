package com.picture.xyz.comica.p240d.p455l;

import android.content.Context;
import com.picture.xyz.comica.p241e.p242c.tm;
import com.picture.xyz.comica.comica.Face2;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.l.c */
public class wd extends en {

    /* renamed from: d */
    Face2[] f39408d;

    public wd(Context context, Face2[] hVarArr, int i) {
        this.f39408d = hVarArr;
        this.f39407c = i;
        this.f39360a = mo51861d(context);
        StringBuilder insert = new StringBuilder().insert(0, "");
        insert.append(i);
        this.f39361b = insert.toString();
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        tm hVar = new tm(this.f39408d, this.f39407c);
        this.f39360a = hVar;
        return hVar;
    }
}
