package com.picture.xyz.comica.p241e.p458d.p479s;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.df;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.ColourBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.SaturationFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.s.b */
public class gb extends GroupFilter {

    /* renamed from: C */
    th f39592C;

    /* renamed from: D */
    dl f39593D = new dl();

    public gb(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(2, 1.0f, 0.05f);
        this.f39592C = new th(context, 1.0f, 9.0f);
        df dVar2 = new df(context, R.drawable.paper, 1);
        SaturationFilter fVar = new SaturationFilter(1.0f);
        ColourBlendFilter aVar = new ColourBlendFilter();
        dVar.mo24187w(this.f39592C);
        this.f39592C.mo24187w(this.f39593D);
        this.f39593D.mo24187w(dVar2);
        dVar2.mo24187w(aVar);
        fVar.mo24187w(aVar);
        aVar.mo24187w(this);
        aVar.mo53648H(dVar2, 0);
        aVar.mo53648H(fVar, 1);
        mo53645H(fVar);
        mo53645H(dVar);
        mo53644G(this.f39592C);
        mo53644G(this.f39593D);
        mo53644G(dVar2);
        mo53646I(aVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39592C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39593D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39593D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39593D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39592C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39593D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39593D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39593D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39592C.mo24182F(str, fArr);
    }
}
