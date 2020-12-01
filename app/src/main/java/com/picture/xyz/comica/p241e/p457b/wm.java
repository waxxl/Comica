package com.picture.xyz.comica.p241e.p457b;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.b.c */
public class wm extends GroupFilter {

    /* renamed from: C */
    th f39482C;

    /* renamed from: D */
    BilateralCotrastFilter f39483D = new BilateralCotrastFilter(-1.0f, 2);

    /* renamed from: E */
    float f39484E = 13.0f;

    public wm(Context context) {
        this.f39482C = new th(context, 1.0f, this.f39484E);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 2.0f, 0.03f);
        this.f39483D.mo24187w(dVar);
        dVar.mo24187w(this.f39482C);
        this.f39482C.mo24187w(this);
        mo53645H(this.f39483D);
        mo53644G(dVar);
        mo53646I(this.f39482C);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39484E;
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39484E = f;
            this.f39482C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39482C.mo24182F(str, fArr);
    }
}
