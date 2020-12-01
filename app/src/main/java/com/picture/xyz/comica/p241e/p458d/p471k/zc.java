package com.picture.xyz.comica.p241e.p458d.p471k;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dg;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.k.a */
public class zc extends GroupFilter {

    /* renamed from: C */
    th f39553C;

    /* renamed from: D */
    dl f39554D;

    public zc(Context context, int i) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 4.0f, 0.03f);
        this.f39553C = new th(context, 2.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        dl aVar2 = new dl();
        this.f39554D = aVar2;
        aVar2.mo51904H(1.3f);
        this.f39554D.mo51903G(-0.05f);
        dg eVar = new dg(context, i, 1);
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39554D);
        this.f39554D.mo24187w(eVar);
        eVar.mo24187w(this.f39553C);
        this.f39553C.mo24187w(this);
        mo53645H(aVar);
        mo53644G(eVar);
        mo53644G(dVar);
        mo53644G(this.f39554D);
        mo53646I(this.f39553C);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39553C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39554D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39554D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39554D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39553C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39554D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39554D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39554D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39553C.mo24182F(str, fArr);
    }
}
