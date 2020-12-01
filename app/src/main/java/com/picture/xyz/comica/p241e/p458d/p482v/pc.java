package com.picture.xyz.comica.p241e.p458d.p482v;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;

/* renamed from: e.d.v.a */
public class pc extends GroupFilter {

    /* renamed from: C */
    tc f39613C;

    /* renamed from: D */
    dl f39614D = new dl();

    public pc(Context context) {
        tc cVar = new tc(context);
        this.f39613C = cVar;
        this.f39614D.mo24187w(cVar);
        this.f39613C.mo24187w(this);
        mo53645H(this.f39614D);
        mo53646I(this.f39613C);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39613C.mo24144D(str);
        }
        if (str.equals(jh.f39476k)) {
            return this.f39614D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39614D.mo24144D(str);
        }
        if (str.equals(jh.f39473h)) {
            return this.f39614D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39613C.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39614D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39614D.mo24145E(str, f);
        } else if (str.equals(jh.f39473h)) {
            this.f39614D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39613C.mo24182F(str, fArr);
    }
}
