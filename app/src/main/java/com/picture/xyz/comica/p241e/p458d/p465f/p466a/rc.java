package com.picture.xyz.comica.p241e.p458d.p465f.p466a;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.f.a.a */
public class rc extends GroupFilter {

    /* renamed from: C */
    fe f39521C;

    /* renamed from: D */
    th f39522D;

    public rc(Context context) {
        fe bVar = new fe(context, R.drawable.fairy_tale);
        this.f39521C = bVar;
        bVar.mo51907J(1.4f);
        this.f39521C.mo51906I(-0.2f);
        C11185c cVar = new C11185c(1, 10.0f, 0.02f);
        this.f39522D = new th(context, 2.0f, 12.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.2f, 2);
        cb bVar2 = new cb(context, R.drawable.a2, 3);
        lc dVar = new lc(0.5f);
        UnsharpMaskFilter dVar2 = new UnsharpMaskFilter(1, 3.0f, 0.02f);
        aVar.mo24187w(cVar);
        cVar.mo24187w(this.f39521C);
        this.f39521C.mo24187w(bVar2);
        bVar2.mo24187w(dVar2);
        dVar2.mo24187w(this.f39522D);
        this.f39522D.mo24187w(dVar);
        dVar.mo24187w(this);
        mo53645H(aVar);
        mo53644G(cVar);
        mo53644G(dVar2);
        mo53644G(this.f39522D);
        mo53644G(this.f39521C);
        mo53644G(bVar2);
        mo53646I(dVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39522D.mo24144D(str);
        }
        return this.f39521C.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39522D.mo24145E(str, f);
        } else {
            this.f39521C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39522D.mo24182F(str, fArr);
    }
}
