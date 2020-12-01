package com.picture.xyz.comica.p241e.p458d.p486z;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p503k.KuwaharaFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.z.a */
public class ai extends GroupFilter {

    /* renamed from: C */
    dl f39628C = new dl();

    /* renamed from: D */
    th f39629D;

    public ai(Context context) {
        KuwaharaFilter aVar = new KuwaharaFilter(4, 2.0f);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 5.0f, 0.03f);
        th bVar = new th(context, 2.0f, 6.0f);
        uc bVar2 = new uc(context, R.drawable.fabric, 2.0f, 14.0f, 0.6f);
        fe bVar3 = new fe(context, R.drawable.airy);
        this.f39629D = new th(context, 2.0f, 12.0f);
        this.f39628C.mo24187w(aVar);
        aVar.mo24187w(dVar);
        dVar.mo24187w(bVar);
        bVar.mo24187w(bVar2);
        bVar2.mo24187w(bVar3);
        bVar3.mo24187w(this.f39629D);
        this.f39629D.mo24187w(this);
        mo53645H(this.f39628C);
        mo53644G(aVar);
        mo53644G(dVar);
        mo53644G(bVar);
        mo53644G(bVar3);
        mo53644G(bVar2);
        mo53646I(this.f39629D);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39629D.mo24144D(str);
        }
        return this.f39628C.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39629D.mo24145E(str, f);
        } else {
            this.f39628C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39629D.mo24182F(str, fArr);
    }
}
