package com.picture.xyz.comica.p241e.p458d.p464e;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.DarkenBlendFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p501i.TextureFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.e.b */
public class ya extends GroupFilter {

    /* renamed from: C */
    th f39519C;

    /* renamed from: D */
    dl f39520D;

    public ya(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 20.0f, 0.03f);
        this.f39519C = new th(context, 2.0f, 9.0f);
        BilateralCotrastFilter aVar = new BilateralCotrastFilter(-2.0f, 2);
        dl aVar2 = new dl();
        this.f39520D = aVar2;
        aVar2.mo51904H(1.5f);
        this.f39520D.mo51905I(1.1f);
        tb aVar3 = new tb();
        aVar.mo24187w(dVar);
        dVar.mo24187w(this.f39519C);
        this.f39519C.mo24187w(this.f39520D);
        this.f39520D.mo24187w(aVar3);
        TextureFilter cVar = new TextureFilter(context, R.drawable.tan);
        DarkenBlendFilter bVar = new DarkenBlendFilter();
        cVar.mo24187w(bVar);
        aVar3.mo24187w(bVar);
        bVar.mo24187w(this);
        bVar.mo53648H(cVar, 0);
        bVar.mo53648H(aVar3, 1);
        mo53645H(cVar);
        mo53645H(aVar);
        mo53644G(this.f39519C);
        mo53644G(dVar);
        mo53644G(this.f39520D);
        mo53644G(aVar3);
        mo53646I(bVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39519C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39520D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39520D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39520D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39519C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39520D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39520D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39520D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39519C.mo24182F(str, fArr);
    }
}
