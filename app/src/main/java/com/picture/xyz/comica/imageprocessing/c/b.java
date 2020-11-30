package com.picture.xyz.comica.imageprocessing.c;

import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.e.a;

/* compiled from: CompositeFilter */
public abstract class b extends e {
    private List<BasicFilter> E = new ArrayList();
    private List<BasicFilter> F = new ArrayList();
    private List<BasicFilter> G = new ArrayList();
    private List<BasicFilter> H = new ArrayList();

    public b(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public void I(BasicFilter aVar) {
        if (!this.H.contains(aVar)) {
            this.H.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void J(BasicFilter aVar) {
        this.E.add(aVar);
        I(aVar);
    }

    /* access modifiers changed from: protected */
    public void K(BasicFilter aVar) {
        this.F.add(aVar);
        I(aVar);
    }

    public void a(int i, a aVar, boolean z) {
        if (this.G.contains(aVar)) {
            if (!this.C.contains(aVar)) {
                super.a(i, aVar, z);
                for (BasicFilter a2 : this.E) {
                    a2.a(i, aVar, z);
                }
            }
        } else if (this.F.contains(aVar)) {
            super.a(i, aVar, z);
        } else {
            for (BasicFilter a3 : this.E) {
                a3.a(i, aVar, z);
            }
        }
    }

    public void c() {
        super.c();
        for (a c2 : this.H) {
            c2.c();
        }
    }

    public void t(int i, int i2) {
        for (a t : this.H) {
            t.t(i, i2);
        }
        super.t(i, i2);
    }
}
