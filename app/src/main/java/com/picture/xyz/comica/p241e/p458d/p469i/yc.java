package com.picture.xyz.comica.p241e.p458d.p469i;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jc;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.ColourBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.i.a */
public class yc extends GroupFilter {

    /* renamed from: C */
    th f39549C;

    /* renamed from: D */
    fe f39550D;

    public yc(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(2, 1.0f, 0.03f);
        this.f39549C = new th(context, 1.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        jc cVar = new jc(context, R.drawable.fabric, 4);
        this.f39550D = new fe(context, R.drawable.airy);
        ColourBlendFilter aVar2 = new ColourBlendFilter();
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39549C);
        this.f39549C.mo24187w(cVar);
        cVar.mo24187w(aVar2);
        this.f39550D.mo24187w(aVar2);
        aVar2.mo24187w(this);
        aVar2.mo53648H(cVar, 0);
        aVar2.mo53648H(this.f39550D, 1);
        mo53645H(aVar);
        mo53645H(this.f39550D);
        mo53644G(this.f39549C);
        mo53644G(dVar);
        mo53644G(this.f39550D);
        mo53644G(cVar);
        mo53646I(aVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39549C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39550D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39550D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39550D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39549C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39550D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39550D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39550D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39549C.mo24182F(str, fArr);
    }
}
