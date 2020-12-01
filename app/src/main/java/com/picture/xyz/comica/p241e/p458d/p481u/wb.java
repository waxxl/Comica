package com.picture.xyz.comica.p241e.p458d.p481u;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p241e.p458d.p474n.rb;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p503k.KuwaharaFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.u.d */
public class wb extends GroupFilter {

    /* renamed from: C */
    th f39611C;

    /* renamed from: D */
    dl f39612D;

    public wb(Context context) {
        dl aVar = new dl();
        this.f39612D = aVar;
        aVar.mo51903G(0.1f);
        KuwaharaFilter aVar2 = new KuwaharaFilter(2, 2.0f);
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 6.0f, 0.04f);
        th bVar = new th(context, 2.0f, 6.0f);
        rb bVar2 = new rb(context, R.drawable.fabric, 3.0f, 6.0f, 0.6f);
        fe bVar3 = new fe(context, R.drawable.retro);
        this.f39611C = new th(context, 2.0f, 12.0f);
        this.f39612D.mo24187w(aVar2);
        aVar2.mo24187w(dVar);
        dVar.mo24187w(bVar);
        bVar.mo24187w(bVar2);
        bVar2.mo24187w(bVar3);
        bVar3.mo24187w(this.f39611C);
        this.f39611C.mo24187w(this);
        mo53645H(this.f39612D);
        mo53644G(aVar2);
        mo53644G(dVar);
        mo53644G(bVar);
        mo53644G(bVar3);
        mo53644G(bVar2);
        mo53646I(this.f39611C);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39611C.mo24144D(str);
        }
        return this.f39612D.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39611C.mo24145E(str, f);
        } else {
            this.f39612D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39611C.mo24182F(str, fArr);
    }
}
