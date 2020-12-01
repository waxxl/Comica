package com.picture.xyz.comica.imageprocessing.p253c;

import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.p254e.GLTextureOutputRenderer;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.b */
public abstract class CompositeFilter extends MultiInputFilter {

    /* renamed from: E */
    private List<BasicFilter> f41089E = new ArrayList();

    /* renamed from: F */
    private List<GLTextureOutputRenderer> f41090F = new ArrayList();

    /* renamed from: G */
    private List<GLTextureOutputRenderer> f41091G = new ArrayList();

    /* renamed from: H */
    private List<GLTextureOutputRenderer> f41092H = new ArrayList();

    public CompositeFilter(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo53639I(GLTextureOutputRenderer aVar) {
        if (!this.f41092H.contains(aVar)) {
            this.f41092H.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo53640J(BasicFilter aVar) {
        this.f41089E.add(aVar);
        mo53639I(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo53641K(GLTextureOutputRenderer aVar) {
        this.f41090F.add(aVar);
        mo53639I(aVar);
    }

    /* renamed from: a */
    public void mo24183a(int i, GLTextureOutputRenderer aVar, boolean z) {
        if (this.f41091G.contains(aVar)) {
            if (!this.f41109C.contains(aVar)) {
                super.mo24183a(i, aVar, z);
                for (BasicFilter a : this.f41089E) {
                    a.mo24183a(i, aVar, z);
                }
            }
        } else if (this.f41090F.contains(aVar)) {
            super.mo24183a(i, aVar, z);
        } else {
            for (BasicFilter a2 : this.f41089E) {
                a2.mo24183a(i, aVar, z);
            }
        }
    }

    /* renamed from: c */
    public void mo24165c() {
        super.mo24165c();
        for (GLTextureOutputRenderer c : this.f41092H) {
            c.mo24165c();
        }
    }

    /* renamed from: t */
    public void mo24179t(int i, int i2) {
        for (GLTextureOutputRenderer t : this.f41092H) {
            t.mo24179t(i, i2);
        }
        super.mo24179t(i, i2);
    }
}
