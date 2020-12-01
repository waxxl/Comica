package com.picture.xyz.comica.p241e.p242c;

import java.util.ArrayList;
import java.util.Random;
import com.picture.xyz.comica.comica.Face2;
import com.picture.xyz.comica.imageprocessing.p253c.GroupFilter;
import com.picture.xyz.comica.imageprocessing.p253c.p502j.NoFilter;

/* renamed from: e.c.h */
public class tm extends GroupFilter {

    /* renamed from: C */
    tk f39493C;

    /* renamed from: D */
    ArrayList<sl> f39494D = new ArrayList<>();

    public tm(Face2[] hVarArr, int i) {
        tk bVar = null;
        if (hVarArr == null || hVarArr.length <= 0) {
            this.f39493C = hn.m21099a((Face2) null, i);
        } else {
            this.f39493C = hn.m21099a(hVarArr[0], i);
        }
        this.f39494D.add(this.f39493C);
        tk bVar2 = this.f39493C;
        Random random = new Random();
        if (hVarArr != null) {
            int i2 = 1;
            while (i2 < hVarArr.length) {
                if (bVar != null) {
                    mo53644G(bVar);
                }
                bVar = hn.m21099a(hVarArr[i2], random.nextInt(8));
                this.f39494D.add(bVar);
                i2++;
                bVar2.mo24187w(bVar);
                bVar2 = bVar;
            }
        }
        bVar = bVar == null ? this.f39493C : bVar;
        NoFilter eVar = new NoFilter();
        bVar.mo24187w(eVar);
        eVar.mo24187w(this);
        mo53645H(this.f39493C);
        mo53644G(bVar);
        mo53646I(eVar);
    }

    /* renamed from: D */
    public float mo24144D(String str) {
        return this.f39494D.get(0).mo24144D(str);
    }

    /* renamed from: E */
    public void mo24145E(String str, float f) {
        int i = 0;
        while (i < this.f39494D.size()) {
            i++;
            this.f39494D.get(i).mo24145E(str, f);
        }
    }
}
