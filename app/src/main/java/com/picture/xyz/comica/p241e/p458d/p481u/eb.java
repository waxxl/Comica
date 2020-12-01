package com.picture.xyz.comica.p241e.p458d.p481u;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.cf;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.LuminanceThresholdFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.u.a */
public class eb extends GroupFilter {

    /* renamed from: C */
    dl f39605C;

    /* renamed from: D */
    th f39606D;

    public eb(Context context) {
        dl aVar = new dl();
        this.f39605C = aVar;
        aVar.mo51903G(0.1f);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 145.0f, 0.02f);
        th bVar = new th(context, 2.0f, 6.0f);
        cf fVar = new cf(context, R.drawable.paper, 3);
        LuminanceThresholdFilter dVar2 = new LuminanceThresholdFilter(0.4f);
        this.f39606D = new th(context, 2.0f, 12.0f);
        this.f39605C.mo24187w(dVar);
        dVar.mo24187w(bVar);
        bVar.mo24187w(fVar);
        fVar.mo24187w(this.f39606D);
        this.f39606D.mo24187w(dVar2);
        dVar2.mo24187w(this);
        mo53645H(this.f39605C);
        mo53644G(dVar);
        mo53644G(bVar);
        mo53644G(fVar);
        mo53644G(this.f39606D);
        mo53646I(dVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39606D.mo24144D(str);
        }
        return this.f39605C.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39606D.mo24145E(str, f);
        } else {
            this.f39605C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39606D.mo24182F(str, fArr);
    }
}
