package com.picture.xyz.comica.imageprocessing.c;

import android.graphics.PointF;
import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GenericFilter */
public class c extends BasicFilter {
    private String A;
    private Map<String, Integer> B = new HashMap();
    private Map<String, Integer> C = new HashMap();
    private Map<String, Float> D = new HashMap();
    private Map<String, PointF> E = new HashMap();
    private Map<String, float[]> F = new HashMap();
    private Map<String, float[]> G = new HashMap();
    private Map<String, float[]> H = new HashMap();
    private Map<String, float[]> I = new HashMap();
    private Map<String, float[]> J = new HashMap();
    private String z;

    public c() {
        G(super.i());
        H(super.k());
    }

    public void G(String str) {
        this.z = str;
        r();
    }

    public void H(String str) {
        this.A = str;
        r();
    }

    /* access modifiers changed from: protected */
    public String i() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public String k() {
        return this.A;
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        for (String next : this.C.keySet()) {
            this.B.put(next, Integer.valueOf(GLES20.glGetUniformLocation(this.f11439d, next)));
        }
        for (String next2 : this.D.keySet()) {
            this.B.put(next2, Integer.valueOf(GLES20.glGetUniformLocation(this.f11439d, next2)));
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        for (String next : this.C.keySet()) {
            GLES20.glUniform1f(this.B.get(next).intValue(), (float) this.C.get(next).intValue());
        }
        for (String next2 : this.D.keySet()) {
            GLES20.glUniform1f(this.B.get(next2).intValue(), this.D.get(next2).floatValue());
        }
        for (String next3 : this.E.keySet()) {
            GLES20.glUniform2f(this.B.get(next3).intValue(), this.E.get(next3).x, this.E.get(next3).y);
        }
        for (String next4 : this.F.keySet()) {
            GLES20.glUniform3f(this.B.get(next4).intValue(), this.F.get(next4)[0], this.F.get(next4)[1], this.F.get(next4)[2]);
        }
        for (String next5 : this.G.keySet()) {
            GLES20.glUniform4f(this.B.get(next5).intValue(), this.G.get(next5)[0], this.G.get(next5)[1], this.G.get(next5)[2], this.G.get(next5)[3]);
        }
        for (String next6 : this.H.keySet()) {
            GLES20.glUniformMatrix3fv(this.B.get(next6).intValue(), 1, false, this.H.get(next6), 0);
        }
        for (String next7 : this.I.keySet()) {
            GLES20.glUniformMatrix4fv(this.B.get(next7).intValue(), 1, false, this.I.get(next7), 0);
        }
        for (String next8 : this.J.keySet()) {
            GLES20.glUniform1fv(this.B.get(next8).intValue(), this.J.get(next8).length, this.J.get(next8), 0);
        }
    }
}
