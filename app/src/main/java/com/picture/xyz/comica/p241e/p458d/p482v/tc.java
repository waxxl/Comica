package com.picture.xyz.comica.p241e.p458d.p482v;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.ColourBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.NoFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.v.c */
public class tc extends GroupFilter {

    /* renamed from: C */
    th f39618C;

    /* renamed from: D */
    float f39619D = 8.0f;

    public tc(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 8.0f, 0.04f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-1.0f, 1);
        NoFilter eVar = new NoFilter();
        C11189b bVar = new C11189b(context, R.drawable.ink, 1);
        ColourBlendFilter aVar2 = new ColourBlendFilter();
        aVar.mo24187w(dVar);
        dVar.mo24187w(bVar);
        eVar.mo24187w(aVar2);
        bVar.mo24187w(aVar2);
        aVar2.mo53648H(bVar, 0);
        aVar2.mo53648H(eVar, 1);
        th bVar2 = new th(context, 2.0f, 6.0f);
        this.f39618C = bVar2;
        aVar2.mo24187w(bVar2);
        this.f39618C.mo24187w(this);
        mo53645H(eVar);
        mo53645H(aVar);
        mo53644G(dVar);
        mo53644G(bVar);
        mo53644G(aVar2);
        mo53646I(this.f39618C);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39618C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39618C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39618C.mo24182F(str, fArr);
    }
}
