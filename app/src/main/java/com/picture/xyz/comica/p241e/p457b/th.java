package com.picture.xyz.comica.p241e.p457b;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p488g.g;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.NoFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p503k.KuwaharaFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;

/* renamed from: e.b.b */
public class th extends GroupFilter {

    /* renamed from: C */
    em f39481C;

    public th(Context context, float f, float f2) {
        if (g.f39812a) {
            fg hVar = new fg();
            vn aVar = new vn(f);
            fi gVar = new fi();
            NoFilter eVar = new NoFilter();
            em fVar = new em();
            this.f39481C = fVar;
            fVar.mo51910J(f2);
            hVar.mo24187w(aVar);
            aVar.mo24187w(gVar);
            eVar.mo24187w(this.f39481C);
            gVar.mo24187w(this.f39481C);
            this.f39481C.mo53648H(eVar, 0);
            this.f39481C.mo53648H(gVar, 1);
            this.f39481C.mo24187w(this);
            mo53645H(hVar);
            mo53645H(eVar);
            mo53644G(aVar);
            mo53644G(gVar);
            mo53646I(this.f39481C);
            return;
        }
        BilateralCotrastFilter aVar2 = new BilateralCotrastFilter(-1.8f, 2);
        KuwaharaFilter aVar3 = new KuwaharaFilter(2, 1.0f);
        aVar2.mo24187w(aVar3);
        aVar3.mo24187w(this);
        mo53645H(aVar2);
        mo53646I(aVar3);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        em fVar = this.f39481C;
        if (fVar != null) {
            return fVar.mo51909I();
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        em fVar;
        if (str.equals(jh.f39467b) && (fVar = this.f39481C) != null) {
            fVar.mo51910J(f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        em fVar = this.f39481C;
        if (fVar != null) {
            fVar.mo24182F(str, fArr);
        }
    }
}
