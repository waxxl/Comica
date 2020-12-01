package com.picture.xyz.comica.p241e.p458d.p479s;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p503k.KuwaharaFilter;

/* renamed from: e.d.s.a */
public class mc extends GroupFilter {

    /* renamed from: C */
    gb f39590C;

    /* renamed from: D */
    fe f39591D;

    public mc(Context context) {
        this.f39591D = new fe(context, R.drawable.park);
        KuwaharaFilter aVar = new KuwaharaFilter(4, 1.5f);
        this.f39590C = new gb(context);
        this.f39591D.mo24187w(aVar);
        aVar.mo24187w(this.f39590C);
        this.f39590C.mo24187w(this);
        mo53645H(this.f39591D);
        mo53644G(aVar);
        mo53646I(this.f39590C);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39590C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39591D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39591D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39591D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39590C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39591D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39591D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39591D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39590C.mo24182F(str, fArr);
    }
}
