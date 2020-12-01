package com.picture.xyz.comica.p241e.p458d.p481u;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.cf;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jc;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.u.c */
public class vb extends GroupFilter {

    /* renamed from: C */
    th f39609C;

    /* renamed from: D */
    dl f39610D;

    public vb(Context context) {
        dl aVar = new dl();
        this.f39610D = aVar;
        aVar.mo51903G(0.1f);
        this.f39610D.mo51904H(1.3f);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 145.0f, 0.03f);
        th bVar = new th(context, 2.0f, 6.0f);
        cf fVar = new cf(context, R.drawable.fabric, 6);
        jc cVar = new jc(context, R.drawable.sketch1, 6);
        this.f39609C = new th(context, 2.0f, 12.0f);
        this.f39610D.mo24187w(dVar);
        dVar.mo24187w(bVar);
        bVar.mo24187w(fVar);
        fVar.mo24187w(this.f39609C);
        this.f39609C.mo24187w(cVar);
        cVar.mo24187w(this);
        mo53645H(this.f39610D);
        mo53644G(dVar);
        mo53644G(bVar);
        mo53644G(fVar);
        mo53644G(this.f39609C);
        mo53646I(cVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39609C.mo24144D(str);
        }
        return this.f39610D.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39609C.mo24145E(str, f);
        } else {
            this.f39610D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39609C.mo24182F(str, fArr);
    }
}
