package com.picture.xyz.comica.p241e.p458d.p473m;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.m.b */
public class ha extends GroupFilter {

    /* renamed from: C */
    dl f39561C;

    /* renamed from: D */
    th f39562D;

    /* renamed from: E */
    UnsharpMaskFilter f39563E;

    /* renamed from: F */
    float f39564F = 8.0f;

    public ha(Context context) {
        dl aVar = new dl();
        this.f39561C = aVar;
        aVar.mo51904H(1.5f);
        this.f39561C.mo51903G(-0.05f);
        this.f39563E = new UnsharpMaskFilter(1, this.f39564F, 0.05f);
        C11187a aVar2 = new C11187a(context, R.drawable.sketch1);
        this.f39561C.mo24187w(this.f39563E);
        this.f39562D = new th(context, 2.0f, 13.0f);
        this.f39563E.mo24187w(aVar2);
        aVar2.mo24187w(this.f39562D);
        this.f39562D.mo24187w(this);
        mo53645H(this.f39561C);
        mo53644G(this.f39563E);
        mo53644G(aVar2);
        mo53646I(this.f39562D);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39562D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39561C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39561C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39561C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39562D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39561C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39561C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39561C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39562D.mo24182F(str, fArr);
    }
}
