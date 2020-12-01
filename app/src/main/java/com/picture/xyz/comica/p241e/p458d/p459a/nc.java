package com.picture.xyz.comica.p241e.p458d.p459a;

import android.content.Context;

import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.DarkenBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.AdaptiveThresholdFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
/* renamed from: e.d.a.b */
public class nc extends GroupFilter {

    /* renamed from: C */
    dl f39497C;

    /* renamed from: D */
    th f39498D;

    /* renamed from: E */
    UnsharpMaskFilter f39499E;

    /* renamed from: F */
    float f39500F = 8.0f;

    public nc(Context context) {
        dl aVar = new dl();
        this.f39497C = aVar;
        aVar.mo51904H(1.5f);
        this.f39497C.mo51903G(0.05f);
        this.f39499E = new UnsharpMaskFilter(1, this.f39500F, 0.03f);
        AdaptiveThresholdFilter aVar2 = new AdaptiveThresholdFilter();
        ka aVar3 = new ka(context, R.drawable.sketch1);
        DarkenBlendFilter bVar = new DarkenBlendFilter();
        this.f39497C.mo24187w(this.f39499E);
        this.f39499E.mo24187w(aVar3);
        aVar2.mo24187w(bVar);
        aVar3.mo24187w(bVar);
        bVar.mo53648H(aVar3, 0);
        bVar.mo53648H(aVar2, 1);
        th bVar2 = new th(context, 2.0f, 12.0f);
        this.f39498D = bVar2;
        bVar.mo24187w(bVar2);
        this.f39498D.mo24187w(this);
        mo53645H(this.f39497C);
        mo53645H(aVar2);
        mo53644G(this.f39499E);
        mo53644G(aVar3);
        mo53644G(bVar);
        mo53646I(this.f39498D);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39498D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39497C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39497C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39497C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39498D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39497C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39497C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39497C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39498D.mo24182F(str, fArr);
    }
}
