package com.picture.xyz.comica.p241e.p458d.p463d;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.comica.q;
import com.picture.xyz.comica.imageprocessing.p253c.GenericFilter;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;

/* renamed from: e.d.d.b */
public class aa extends GroupFilter {

    /* renamed from: C */
    th f39517C;

    /* renamed from: D */
    dl f39518D;

    public aa(Context context) {
        dl aVar = new dl();
        this.f39518D = aVar;
        aVar.mo51904H(1.3f);
        this.f39518D.mo51903G(0.1f);
        BilateralCotrastFilter aVar2 = new BilateralCotrastFilter(-2.0f, 1);
        this.f39517C = new th(context, 2.0f, 12.0f);
        ja aVar3 = new ja(1, 5.0f, 0.05f);
        GenericFilter cVar = new GenericFilter();
        cVar.mo53642G(q.m48750a(context, R.raw.comics));
        this.f39518D.mo24187w(aVar2);
        aVar2.mo24187w(aVar3);
        aVar3.mo24187w(this.f39517C);
        this.f39517C.mo24187w(cVar);
        cVar.mo24187w(this);
        mo53645H(this.f39518D);
        mo53644G(aVar2);
        mo53644G(aVar3);
        mo53644G(this.f39517C);
        mo53646I(cVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39517C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39518D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39518D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39518D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39517C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39518D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39518D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39518D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39517C.mo24182F(str, fArr);
    }
}
