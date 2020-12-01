package com.picture.xyz.comica.p241e.p458d.p462c;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jc;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;

/* renamed from: e.d.c.a */
public class fc extends GroupFilter {

    /* renamed from: C */
    dl f39505C;

    /* renamed from: D */
    th f39506D;

    public fc(Context context) {
        ab bVar = new ab(1, 20.0f, 0.03f);
        this.f39506D = new th(context, 1.0f, 15.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-1.0f, 2);
        dl aVar2 = new dl();
        this.f39505C = aVar2;
        aVar2.mo51904H(1.3f);
        this.f39505C.mo51903G(-0.1f);
        jc cVar = new jc(context, R.drawable.ink, 1);
        th bVar2 = new th(context, 2.0f, 8.0f);
        aVar.mo24187w(bVar);
        bVar.mo24187w(this.f39506D);
        this.f39506D.mo24187w(this.f39505C);
        this.f39505C.mo24187w(cVar);
        cVar.mo24187w(bVar2);
        bVar2.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39506D);
        mo53644G(bVar);
        mo53644G(this.f39505C);
        mo53644G(cVar);
        mo53646I(bVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39506D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39505C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39505C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39505C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39506D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39505C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39505C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39505C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39506D.mo24182F(str, fArr);
    }
}
