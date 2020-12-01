package com.picture.xyz.comica.p241e.p458d.p470j;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.cf;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.j.a */
public class pb extends GroupFilter {

    /* renamed from: C */
    th f39551C;

    /* renamed from: D */
    dl f39552D;

    public pb(Context context, int i) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 3.0f, 0.03f);
        this.f39551C = new th(context, 1.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        dl aVar2 = new dl();
        this.f39552D = aVar2;
        aVar2.mo51904H(1.3f);
        this.f39552D.mo51903G(-0.05f);
        cf fVar = new cf(context, i, 1);
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39551C);
        this.f39551C.mo24187w(this.f39552D);
        this.f39552D.mo24187w(fVar);
        fVar.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39551C);
        mo53644G(dVar);
        mo53644G(this.f39552D);
        mo53646I(fVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39551C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39552D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39552D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39552D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39551C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39552D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39552D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39552D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39551C.mo24182F(str, fArr);
    }
}
