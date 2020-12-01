package com.picture.xyz.comica.p241e.p458d.p484x;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p503k.PosterizeFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.x.a */
public class jb extends GroupFilter {

    /* renamed from: C */
    dl f39624C;

    /* renamed from: D */
    th f39625D;

    public jb(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 10.0f, 0.03f);
        this.f39625D = new th(context, 2.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        dl aVar2 = new dl();
        this.f39624C = aVar2;
        aVar2.mo51904H(2.0f);
        this.f39624C.mo51903G(0.1f);
        this.f39624C.mo51905I(1.1f);
        PosterizeFilter bVar = new PosterizeFilter(3.0f);
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39625D);
        this.f39625D.mo24187w(this.f39624C);
        this.f39624C.mo24187w(bVar);
        bVar.mo24187w(this);
        mo53645H(aVar);
        mo53644G(this.f39625D);
        mo53644G(dVar);
        mo53644G(this.f39624C);
        mo53646I(bVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39625D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39624C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39624C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39624C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39625D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39624C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39624C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39624C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39625D.mo24182F(str, fArr);
    }
}
