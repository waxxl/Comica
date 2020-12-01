package com.picture.xyz.comica.p241e.p458d.p474n;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.SharpenFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.n.c */
public class ub extends GroupFilter {

    /* renamed from: C */
    th f39572C;

    /* renamed from: D */
    BasicFilter f39573D;

    /* renamed from: E */
    float f39574E = 13.0f;

    public ub(Context context) {
        fe bVar = new fe(context, R.drawable.airy);
        this.f39573D = bVar;
        bVar.mo51906I(-0.05f);
        zb aVar = new zb(context, R.drawable.tan);
        SharpenFilter cVar = new SharpenFilter(1.5f);
        this.f39572C = new th(context, 2.0f, this.f39574E);
        BilateralCotrastFilter aVar2 = new BilateralCotrastFilter(-2.0f, 1);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 2.0f, 0.02f);
        aVar2.mo24187w(this.f39573D);
        this.f39573D.mo24187w(dVar);
        dVar.mo24187w(aVar);
        aVar.mo24187w(this.f39572C);
        this.f39572C.mo24187w(cVar);
        cVar.mo24187w(this);
        mo53645H(aVar2);
        mo53644G(this.f39573D);
        mo53644G(aVar);
        mo53644G(this.f39572C);
        mo53644G(dVar);
        mo53646I(cVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39574E;
        }
        return this.f39573D.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39574E = f;
            this.f39572C.mo24145E(str, f);
            return;
        }
        this.f39573D.mo24145E(str, f);
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39572C.mo24182F(str, fArr);
    }
}
