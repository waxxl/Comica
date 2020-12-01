package com.picture.xyz.comica.p241e.p458d.p460a0;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.a0.a */
public class dc extends GroupFilter {

    /* renamed from: C */
    th f39501C;

    /* renamed from: D */
    dl f39502D;

    public dc(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 20.0f, 0.03f);
        this.f39501C = new th(context, 2.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        dl aVar2 = new dl();
        this.f39502D = aVar2;
        aVar2.mo51904H(1.5f);
        this.f39502D.mo51905I(1.1f);
        gc bVar = new gc();
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39501C);
        this.f39501C.mo24187w(this.f39502D);
        this.f39502D.mo24187w(bVar);
        bVar.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39501C);
        mo53644G(dVar);
        mo53644G(this.f39502D);
        mo53646I(bVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39501C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39502D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39502D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39502D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39501C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39502D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39502D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39502D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39501C.mo24182F(str, fArr);
    }
}
