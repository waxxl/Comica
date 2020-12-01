package com.picture.xyz.comica.p241e.p458d.p480t;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.fe;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.p241e.p458d.p463d.ja;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.BilateralCotrastFilter;

/* renamed from: e.d.t.a */
public class qc extends GroupFilter {

    /* renamed from: C */
    th f39594C;

    /* renamed from: D */
    xc f39595D;

    public qc(Context context, int i) {
        ja aVar = new ja(1, 10.0f, 0.03f);
        this.f39594C = new th(context, 2.0f, 12.0f);
        BilateralCotrastFilter aVar2 = new BilateralCotrastFilter(-2.8f, 1);
        xc bVar = new xc(context, R.drawable.grad_greek);
        this.f39595D = bVar;
        bVar.mo51912J(1.4f);
        this.f39595D.mo51911I(0.1f);
        fe bVar2 = new fe(context, R.drawable.airy);
        aVar2.mo24187w(aVar);
        aVar.mo24187w(this.f39594C);
        this.f39594C.mo24187w(this.f39595D);
        this.f39595D.mo24187w(bVar2);
        bVar2.mo24187w(this);
        mo53645H(aVar2);
        mo53644G(this.f39594C);
        mo53644G(aVar);
        mo53644G(this.f39595D);
        mo53646I(bVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39594C.mo24144D(str);
        }
        return this.f39595D.mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39594C.mo24145E(str, f);
        } else {
            this.f39595D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39594C.mo24182F(str, fArr);
    }
}
