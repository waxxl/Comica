package com.picture.xyz.comica.p241e.p458d.p481u;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jc;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p241e.p457b.ze;
import com.picture.xyz.comica.p241e.p458d.p463d.ja;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;

/* renamed from: e.d.u.b */
public class bb extends GroupFilter {

    /* renamed from: C */
    dl f39607C;

    /* renamed from: D */
    th f39608D;

    public bb(Context context) {
        dl aVar = new dl();
        this.f39607C = aVar;
        aVar.mo51903G(0.0f);
        ze eVar = new ze();
        ja aVar2 = new ja(1, 130.0f, 0.04f);
        th bVar = new th(context, 2.0f, 6.0f);
        jc cVar = new jc(context, R.drawable.matte, 9);
        fe bVar2 = new fe(context, R.drawable.glamour);
        this.f39608D = new th(context, 2.0f, 12.0f);
        this.f39607C.mo24187w(eVar);
        eVar.mo24187w(aVar2);
        aVar2.mo24187w(bVar);
        bVar.mo24187w(cVar);
        cVar.mo24187w(bVar2);
        bVar2.mo24187w(this.f39608D);
        this.f39608D.mo24187w(this);
        mo53645H(this.f39607C);
        mo53644G(eVar);
        mo53644G(aVar2);
        mo53644G(bVar);
        mo53644G(bVar2);
        mo53644G(cVar);
        mo53646I(this.f39608D);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39608D.mo24144D(str);
        }
        return this.f39607C.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39608D.mo24145E(str, f);
        } else {
            this.f39607C.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39608D.mo24182F(str, fArr);
    }
}
