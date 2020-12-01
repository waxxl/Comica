package com.picture.xyz.comica.p241e.p458d.p485y;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.cf;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.y.b */
public class sc extends GroupFilter {

    /* renamed from: C */
    th f39626C;

    /* renamed from: D */
    dl f39627D;

    public sc(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 8.0f, 0.03f);
        this.f39626C = new th(context, 1.0f, 9.0f);
        dl aVar = new dl();
        this.f39627D = aVar;
        aVar.mo51904H(1.5f);
        this.f39627D.mo51905I(1.1f);
        cf fVar = new cf(context, R.drawable.popart2, 1);
        bc aVar2 = new bc();
        dVar.mo24187w(fVar);
        fVar.mo24187w(this.f39626C);
        this.f39626C.mo24187w(this.f39627D);
        this.f39627D.mo24187w(aVar2);
        aVar2.mo24187w(this);
        mo53645H(dVar);
        mo53644G(this.f39626C);
        mo53644G(fVar);
        mo53644G(this.f39627D);
        mo53646I(aVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39626C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39627D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39627D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39627D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39626C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39627D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39627D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39627D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39626C.mo24182F(str, fArr);
    }
}
