package com.picture.xyz.comica.p241e.p458d.p468h;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.wm;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.ColourBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.SaturationFilter;

/* renamed from: e.d.h.a */
public class qa extends GroupFilter {

    /* renamed from: C */
    dl f39540C;

    /* renamed from: D */
    wm f39541D;

    /* renamed from: E */
    SaturationFilter f39542E;

    /* renamed from: F */
    float f39543F = 1.2f;

    public qa(Context context, boolean z, int i) {
        dl aVar = new dl();
        this.f39540C = aVar;
        aVar.mo51904H(1.1f);
        da bVar = new da(context, i, 1.0f, 16.0f, 0.6f);
        this.f39542E = new SaturationFilter(this.f39543F);
        ColourBlendFilter aVar2 = new ColourBlendFilter();
        this.f39541D = new wm(context);
        this.f39540C.mo24187w(bVar);
        bVar.mo24187w(aVar2);
        this.f39542E.mo24187w(aVar2);
        aVar2.mo24187w(this.f39541D);
        this.f39541D.mo24187w(this);
        aVar2.mo53648H(bVar, 0);
        aVar2.mo53648H(this.f39542E, 1);
        mo53645H(this.f39540C);
        mo53644G(bVar);
        mo53644G(aVar2);
        mo53645H(this.f39542E);
        mo53646I(this.f39541D);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39541D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39543F * 10.0f;
        }
        return this.f39540C.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39541D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            float f2 = f / 10.0f;
            this.f39543F = f2;
            this.f39542E.mo53651H(f2);
        } else {
            this.f39540C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39541D.mo24182F(str, fArr);
    }
}
