package com.picture.xyz.comica.imageprocessing.p253c;

import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;
import com.picture.xyz.comica.imageprocessing.p255f.GLTextureInputRenderer;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.d */
public abstract class GroupFilter extends BasicFilter {

    /* renamed from: A */
    private List<BasicFilter> f41104A = new ArrayList();

    /* renamed from: B */
    private List<BasicFilter> f41105B = new ArrayList();

    /* renamed from: z */
    private List<BasicFilter> f41106z = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo53644G(BasicFilter aVar) {
        if (!this.f41104A.contains(aVar)) {
            this.f41104A.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo53645H(BasicFilter aVar) {
        this.f41106z.add(aVar);
        mo53644G(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo53646I(BasicFilter aVar) {
        this.f41105B.add(aVar);
        mo53644G(aVar);
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41105B.contains(aVar)) {
            mo24181v(aVar.mo24173l());
            mo24178s(aVar.mo24171j());
            synchronized (mo24188x()) {
                for (GLTextureInputRenderer a : mo24189y()) {
                    a.mo24183a(i, this, z);
                }
            }
            return;
        }
        for (BasicFilter a2 : this.f41106z) {
            a2.mo24183a(i, aVar, z);
        }
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        for (BasicFilter c : this.f41104A) {
            c.mo24165c();
        }
    }

    /* renamed from: t */
    public void mo24179t(int i, int i2) {
        for (BasicFilter t : this.f41104A) {
            t.mo24179t(i, i2);
        }
    }
}
