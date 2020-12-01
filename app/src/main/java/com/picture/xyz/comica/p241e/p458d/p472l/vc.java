package com.picture.xyz.comica.p241e.p458d.p472l;

import android.content.Context;
import com.picture.xyz.comica.p241e.p456a.dl;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.p241e.p457b.th;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.LuminanceThresholdFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p504l.UnsharpMaskFilter;

/* renamed from: e.d.l.a */
public class vc extends GroupFilter {

    /* renamed from: C */
    float f39555C = 1.4f;

    /* renamed from: D */
    dl f39556D;

    /* renamed from: E */
    th f39557E;

    /* renamed from: F */
    float f39558F = 10.0f;

    public vc(Context context) {
        UnsharpMaskFilter dVar = new UnsharpMaskFilter(1, 7.0f, 0.03f);
        dl aVar = new dl();
        this.f39556D = aVar;
        aVar.mo51904H(this.f39555C);
        this.f39556D.mo51903G(0.0f);
        this.f39557E = new th(context, 2.0f, this.f39558F);
        LuminanceThresholdFilter dVar2 = new LuminanceThresholdFilter(0.4f);
        dVar.mo24187w(this.f39556D);
        this.f39556D.mo24187w(this.f39557E);
        this.f39557E.mo24187w(dVar2);
        dVar2.mo24187w(this);
        mo53645H(dVar);
        mo53644G(this.f39556D);
        mo53644G(this.f39557E);
        mo53646I(dVar2);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        if (str.equals(jh.f39467b)) {
            return this.f39558F;
        }
        if (str.equals(jh.f39476k)) {
            return this.f39556D.mo24144D(str);
        }
        if (str.equals(jh.f39474i)) {
            return this.f39556D.mo24144D(str);
        }
        return 0.0f;
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        if (str.equals(jh.f39467b)) {
            this.f39558F = f;
            this.f39557E.mo24145E(str, f);
        } else if (str.equals(jh.f39476k)) {
            this.f39555C = f;
            this.f39556D.mo24145E(str, f);
        } else if (str.equals(jh.f39474i)) {
            this.f39556D.mo24145E(str, f);
        }
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        this.f39557E.mo24182F(str, fArr);
    }
}
