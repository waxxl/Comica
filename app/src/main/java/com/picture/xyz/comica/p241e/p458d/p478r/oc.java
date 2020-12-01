package com.picture.xyz.comica.p241e.p458d.p478r;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.cf;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jc;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.ColourBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.SaturationFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.r.a */
public class oc extends GroupFilter {

    /* renamed from: C */
    dl f39587C;

    /* renamed from: D */
    SaturationFilter f39588D = new SaturationFilter(1.0f);

    /* renamed from: E */
    th f39589E;

    public oc(Context context) {
        dl aVar = new dl();
        this.f39587C = aVar;
        aVar.mo51903G(0.1f);
        this.f39587C.mo51904H(1.5f);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 45.0f, 0.02f);
        BilateralCotrastFilter aVar2 = new BilateralCotrastFilter(-2.0f, 1);
        cf fVar = new cf(context, R.drawable.fabric, 6);
        jc cVar = new jc(context, R.drawable.matte, 18);
        this.f39589E = new th(context, 2.0f, 12.0f);
        ColourBlendFilter aVar3 = new ColourBlendFilter();
        this.f39587C.mo24187w(aVar2);
        aVar2.mo24187w(dVar);
        dVar.mo24187w(fVar);
        fVar.mo24187w(this.f39589E);
        this.f39589E.mo24187w(cVar);
        cVar.mo24187w(aVar3);
        this.f39588D.mo24187w(aVar3);
        aVar3.mo53648H(cVar, 0);
        aVar3.mo53648H(this.f39588D, 1);
        aVar3.mo24187w(this);
        mo53645H(this.f39587C);
        mo53645H(this.f39588D);
        mo53644G(aVar2);
        mo53644G(dVar);
        mo53644G(fVar);
        mo53644G(this.f39589E);
        mo53644G(cVar);
        mo53646I(aVar3);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39589E.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39587C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39587C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39588D.mo53650G() * 10.0f;
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39589E.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39587C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39587C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39588D.mo53651H(f / 10.0f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39589E.mo24182F(str, fArr);
    }
}
