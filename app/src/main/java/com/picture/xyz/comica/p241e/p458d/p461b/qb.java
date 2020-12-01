package com.picture.xyz.comica.p241e.p458d.p461b;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.b.a */
public class qb extends GroupFilter {

    /* renamed from: C */
    th f39503C;

    /* renamed from: D */
    dl f39504D;

    public qb(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 20.0f, 0.03f);
        this.f39503C = new th(context, 2.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        dl aVar2 = new dl();
        this.f39504D = aVar2;
        aVar2.mo51904H(1.5f);
        this.f39504D.mo51905I(1.1f);
        hb bVar = new hb();
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39503C);
        this.f39503C.mo24187w(this.f39504D);
        this.f39504D.mo24187w(bVar);
        bVar.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39503C);
        mo53644G(dVar);
        mo53644G(this.f39504D);
        mo53646I(bVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39503C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39504D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39504D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39504D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39503C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39504D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39504D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39504D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39503C.mo24182F(str, fArr);
    }
}
