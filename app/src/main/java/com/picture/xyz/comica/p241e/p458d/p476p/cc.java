package com.picture.xyz.comica.p241e.p458d.p476p;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.p.a */
public class cc extends GroupFilter {

    /* renamed from: C */
    fe f39580C;

    /* renamed from: D */
    th f39581D;

    public cc(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 5.0f, 0.0f);
        this.f39581D = new th(context, 2.0f, 12.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 1);
        fe bVar = new fe(context, R.drawable.park);
        this.f39580C = bVar;
        bVar.mo51908K(1.6f);
        wc bVar2 = new wc(context, R.drawable.sketch1, 6);
        UnsharpMaskFilter dVar2 = new UnsharpMaskFilter(1, 0.5f, 0.03f);
        aVar.mo24187w(dVar);
        dVar.mo24187w(bVar2);
        bVar2.mo24187w(this.f39581D);
        this.f39581D.mo24187w(this.f39580C);
        this.f39580C.mo24187w(dVar2);
        dVar2.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39581D);
        mo53644G(dVar);
        mo53644G(bVar2);
        mo53644G(this.f39580C);
        mo53646I(dVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39581D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39580C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39580C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39580C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39581D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39580C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39580C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39580C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39581D.mo24182F(str, fArr);
    }
}
