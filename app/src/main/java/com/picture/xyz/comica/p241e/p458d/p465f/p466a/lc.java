package com.picture.xyz.comica.p241e.p458d.p465f.p466a;

import android.opengl.GLES20;
import com.picture.xyz.comica.p243f.p244a.p245a.j;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: e.d.f.a.d */
public class lc extends BasicFilter {

    /* renamed from: A */
    private int f39531A;

    /* renamed from: z */
    private float f39532z;

    public lc(float f) {
        this.f39532z = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return j.m48668a("\u0013A\u0006P\n@\n\\\r\u0013\u000eV\u0007Z\u0016^\u0013\u0013\u0005_\fR\u0017\biF\rZ\u0005\\\u0011^C@\u0002^\u0013_\u0006AQwCF<g\u0006K\u0017F\u0011VS\biE\u0002A\u001aZ\rTCE\u0006PQ\u0013\u0015l7V\u001bp\f\\\u0011WX9\u0016]\nU\fA\u000e\u0013\u0005_\fR\u0017\u0013\u0016l7[\u0011V\u0010[\f_\u0007\biE\u0006PP\u0013\u000fF\u000eZ\rR\rP\u0006d\u0006Z\u0004[\u0017Z\rTC\u000eCE\u0006PP\u001bS\u001dQ\u0002Q\u0006O\u0013S\u001dT\u0002V\u0007O\u0013S\u001dS\u0004Q\u0002J\biE\fZ\u0007\u0013\u000eR\n]K\u001a\u00189C\u0013CE\u0006PW\u0013\u0000\\\u000f\\\u0011\u0013^\u0013\u0017V\u001bG\u0016A\u0006\u0001'\u001b\u0016l7V\u001bG\u0016A\u0006\u0003OE<g\u0006K \\\fA\u0007\u001aX9C\u0013CU\u000f\\\u0002GC_\u0016^\n]\u0002]\u0000VC\u000eCW\fGKP\f_\fAMA\u0004QO\u0013\u000fF\u000eZ\rR\rP\u0006d\u0006Z\u0004[\u0017Z\rTJ\bi\u0013C\u0013\nUC\u001b\u000fF\u000eZ\rR\rP\u0006\u0013_\u0013\u0016l7[\u0011V\u0010[\f_\u0007\u001ai\u0013C\u0013\u0004_<u\u0011R\u0004p\f_\fAC\u000eCE\u0006PW\u001bP\u001dL\u0001V\u0006M\u001fC\u0002T\u001dL\u0001V\u0006M\u001fC\u0006Q\u001dL\u0001V\u0006M\u001fCP\f_\fAMRJ\bi\u0013C\u0013\u0006_\u0010Vi\u0013C\u0013\u0004_<u\u0011R\u0004p\f_\fAC\u000eCE\u0006PW\u001bQ\u0006P\u001dL\u0001V\u0006M\u001fC\u0001W\nM\u001cQ\u0006V\u001dO\u0013Q\u0001V\u001dL\u0001V\u0006M\u001fCP\f_\fAMRJ\biNi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39531A = GLES20.glGetUniformLocation(this.f15543d, "u_Threshold");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39531A, this.f39532z);
    }
}
