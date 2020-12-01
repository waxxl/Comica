package com.picture.xyz.comica.p241e.p458d.p483w;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p503k.KuwaharaFilter;

/* renamed from: e.d.w.b */
public class xb extends GroupFilter {

    /* renamed from: C */
    fe f39622C;

    /* renamed from: D */
    C11190a f39623D;

    public xb(Context context) {
        this.f39622C = new fe(context, R.drawable.retro);
        KuwaharaFilter aVar = new KuwaharaFilter(4, 1.0f);
        this.f39623D = new C11190a(context);
        this.f39622C.mo24187w(aVar);
        aVar.mo24187w(this.f39623D);
        this.f39623D.mo24187w(this);
        mo53645H(this.f39622C);
        mo53644G(aVar);
        mo53646I(this.f39623D);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39623D.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39622C.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39622C.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39622C.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39623D.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39622C.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39622C.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39622C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39623D.mo24182F(str, fArr);
    }
}
