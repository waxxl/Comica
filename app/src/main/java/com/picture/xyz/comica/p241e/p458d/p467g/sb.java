package com.picture.xyz.comica.p241e.p458d.p467g;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.SepiaFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.g.a */
public class sb extends GroupFilter {

    /* renamed from: C */
    dl f39533C;

    /* renamed from: D */
    th f39534D;

    public sb(Context context) {
        dl aVar = new dl();
        this.f39533C = aVar;
        aVar.mo51904H(1.2f);
        this.f39533C.mo51903G(-0.04f);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 10.0f, 0.02f);
        UnsharpMaskFilter dVar2 = new UnsharpMaskFilter(3, 1.0f, 0.0f);
        this.f39534D = new th(context, 2.0f, 12.0f);
        BilateralCotrastFilter aVar2 = new BilateralCotrastFilter(-2.2f, 2);
        C11186c cVar = new C11186c(context, R.drawable.sketch1, 2);
        SepiaFilter gVar = new SepiaFilter();
        aVar2.mo24187w(dVar);
        dVar.mo24187w(dVar2);
        dVar2.mo24187w(this.f39534D);
        this.f39534D.mo24187w(this.f39533C);
        this.f39533C.mo24187w(cVar);
        cVar.mo24187w(gVar);
        gVar.mo24187w(this);
        mo53645H(aVar2);
        mo53644G(dVar);
        mo53644G(dVar2);
        mo53644G(this.f39534D);
        mo53644G(this.f39533C);
        mo53644G(cVar);
        mo53646I(gVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39534D.mo24144D(str);
        }
        return this.f39533C.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39534D.mo24145E(str, f);
        } else {
            this.f39533C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39534D.mo24182F(str, fArr);
    }
}
