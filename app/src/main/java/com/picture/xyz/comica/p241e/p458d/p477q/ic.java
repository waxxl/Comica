package com.picture.xyz.comica.p241e.p458d.p477q;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.q.a */
public class ic extends GroupFilter {

    /* renamed from: C */
    fe f39585C;

    /* renamed from: D */
    th f39586D;

    public ic(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 10.0f, 0.01f);
        this.f39586D = new th(context, 1.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        fe bVar = new fe(context, R.drawable.fairy_tale);
        this.f39585C = bVar;
        bVar.mo51907J(1.3f);
        this.f39585C.mo51908K(1.1f);
        C11188b bVar2 = new C11188b();
        th bVar3 = new th(context, 2.0f, 9.0f);
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39586D);
        this.f39586D.mo24187w(this.f39585C);
        this.f39585C.mo24187w(bVar2);
        bVar2.mo24187w(bVar3);
        bVar3.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39586D);
        mo53644G(dVar);
        mo53644G(this.f39585C);
        mo53644G(bVar2);
        mo53646I(bVar3);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39586D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39585C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39585C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39585C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39586D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39585C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39585C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39585C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39586D.mo24182F(str, fArr);
    }
}
