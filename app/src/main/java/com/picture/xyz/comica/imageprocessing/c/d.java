package com.picture.xyz.comica.imageprocessing.c;

import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.e.a;
import com.picture.xyz.comica.imageprocessing.f.GLTextureInputRenderer;

/* compiled from: GroupFilter */
public abstract class d extends a {
    private List<BasicFilter> A = new ArrayList();
    private List<BasicFilter> B = new ArrayList();
    private List<BasicFilter> z = new ArrayList();

    /* access modifiers changed from: protected */
    public void G(BasicFilter aVar) {
        if (!this.A.contains(aVar)) {
            this.A.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void H(BasicFilter aVar) {
        this.z.add(aVar);
        G(aVar);
    }

    /* access modifiers changed from: protected */
    public void I(BasicFilter aVar) {
        this.B.add(aVar);
        G(aVar);
    }

    public void a(int i, a aVar, boolean z2) {
        if (this.B.contains(aVar)) {
            v(aVar.l());
            s(aVar.j());
            synchronized (x()) {
                for (GLTextureInputRenderer a2 : y()) {
                    a2.a(i, this, z2);
                }
            }
            return;
        }
        for (BasicFilter a3 : this.z) {
            a3.a(i, aVar, z2);
        }
    }

    public void c() {
        super.c();
        for (a c2 : this.A) {
            c2.c();
        }
    }

    public void t(int i, int i2) {
        for (a t : this.A) {
            t.t(i, i2);
        }
    }
}
