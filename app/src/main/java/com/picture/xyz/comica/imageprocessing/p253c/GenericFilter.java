package com.picture.xyz.comica.imageprocessing.p253c;

import android.graphics.PointF;
import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.c */
public class GenericFilter extends BasicFilter {

    /* renamed from: A */
    private String f41093A;

    /* renamed from: B */
    private Map<String, Integer> f41094B = new HashMap();

    /* renamed from: C */
    private Map<String, Integer> f41095C = new HashMap();

    /* renamed from: D */
    private Map<String, Float> f41096D = new HashMap();

    /* renamed from: E */
    private Map<String, PointF> f41097E = new HashMap();

    /* renamed from: F */
    private Map<String, float[]> f41098F = new HashMap();

    /* renamed from: G */
    private Map<String, float[]> f41099G = new HashMap();

    /* renamed from: H */
    private Map<String, float[]> f41100H = new HashMap();

    /* renamed from: I */
    private Map<String, float[]> f41101I = new HashMap();

    /* renamed from: J */
    private Map<String, float[]> f41102J = new HashMap();

    /* renamed from: z */
    private String f41103z;

    public GenericFilter() {
        mo53642G(super.mo24141i());
        mo53643H(super.mo24172k());
    }

    /* renamed from: G */
    public void mo53642G(String str) {
        this.f41103z = str;
        mo24177r();
    }

    /* renamed from: H */
    public void mo53643H(String str) {
        this.f41093A = str;
        mo24177r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return this.f41103z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo24172k() {
        return this.f41093A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        for (String next : this.f41095C.keySet()) {
            this.f41094B.put(next, Integer.valueOf(GLES20.glGetUniformLocation(this.f15543d, next)));
        }
        for (String next2 : this.f41096D.keySet()) {
            this.f41094B.put(next2, Integer.valueOf(GLES20.glGetUniformLocation(this.f15543d, next2)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        for (String next : this.f41095C.keySet()) {
            GLES20.glUniform1f(this.f41094B.get(next).intValue(), (float) this.f41095C.get(next).intValue());
        }
        for (String next2 : this.f41096D.keySet()) {
            GLES20.glUniform1f(this.f41094B.get(next2).intValue(), this.f41096D.get(next2).floatValue());
        }
        for (String next3 : this.f41097E.keySet()) {
            GLES20.glUniform2f(this.f41094B.get(next3).intValue(), this.f41097E.get(next3).x, this.f41097E.get(next3).y);
        }
        for (String next4 : this.f41098F.keySet()) {
            GLES20.glUniform3f(this.f41094B.get(next4).intValue(), this.f41098F.get(next4)[0], this.f41098F.get(next4)[1], this.f41098F.get(next4)[2]);
        }
        for (String next5 : this.f41099G.keySet()) {
            GLES20.glUniform4f(this.f41094B.get(next5).intValue(), this.f41099G.get(next5)[0], this.f41099G.get(next5)[1], this.f41099G.get(next5)[2], this.f41099G.get(next5)[3]);
        }
        for (String next6 : this.f41100H.keySet()) {
            GLES20.glUniformMatrix3fv(this.f41094B.get(next6).intValue(), 1, false, this.f41100H.get(next6), 0);
        }
        for (String next7 : this.f41101I.keySet()) {
            GLES20.glUniformMatrix4fv(this.f41094B.get(next7).intValue(), 1, false, this.f41101I.get(next7), 0);
        }
        for (String next8 : this.f41102J.keySet()) {
            GLES20.glUniform1fv(this.f41094B.get(next8).intValue(), this.f41102J.get(next8).length, this.f41102J.get(next8), 0);
        }
    }
}
