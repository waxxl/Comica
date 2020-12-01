package com.picture.xyz.comica.p241e.p457b;

import android.opengl.GLES20;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.comica.Face2;
import com.picture.xyz.comica.imageprocessing.p253c.MultiInputFilter;

/* renamed from: e.b.f */
public class em extends MultiInputFilter {

    /* renamed from: E */
    private float[] f39485E = new float[4];

    /* renamed from: F */
    private float f39486F;

    /* renamed from: G */
    private float[] f39487G = new float[4];

    /* renamed from: H */
    private float[] f39488H = new float[4];

    /* renamed from: I */
    private int f39489I;

    /* renamed from: J */
    private int f39490J;

    /* renamed from: K */
    private int f39491K;

    /* renamed from: L */
    private int f39492L;

    public em() {
        super(2);
    }

    /* renamed from: F */
    public void mo24182F(String str, float[] fArr) {
        if (str.equals(jh.f39475j)) {
            this.f39485E = fArr;
        } else if (str.equals(jh.f39466a)) {
            this.f39488H = fArr;
        } else if (str.equals(jh.f39472g)) {
            this.f39487G = fArr;
        }
    }

    /* renamed from: I */
    public float mo51909I() {
        return this.f39486F;
    }

    /* renamed from: J */
    public void mo51910J(float f) {
        this.f39486F = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24166d() {
        System.currentTimeMillis();
        super.mo24166d();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return Face2.m21130d("s\u0000f\u0011j\u0001j\u001dmRk\u001bd\u001asRe\u001el\u0013wI\t\u0007m\u001be\u001dq\u001f#\u0001b\u001fs\u001ef\u000016#\u0007\\&f\nw\u0007q\u00173I\t\u0007m\u001be\u001dq\u001f#\u0001b\u001fs\u001ef\u000016#\u0007\\&f\nw\u0007q\u00172I\t\u0004b\u0000z\u001bm\u0015#\u0004f\u00111Ru-W\u0017{1l\u001dq\u00168xv\u001cj\u0014l\u0000nRu\u0017`@#\u0007\\!j\bfI\t\u0007m\u001be\u001dq\u001f#\u0014o\u001db\u0006#\u0007\\!j\u0015n\u00138xv\u001cj\u0014l\u0000nRu\u0017`F#\u0007\\4b\u0011fB8xv\u001cj\u0014l\u0000nRu\u0017`F#\u0007\\4b\u0011fC8xv\u001cj\u0014l\u0000nRu\u0017`F#\u0007\\4b\u0011f@8xp\u0006q\u0007`\u0006#\u001ej\u0011\\\u0006#\t\tR#R#\u0004f\u00111RsI\tR#R#\u0004f\u00111RwI\tR#R#\u0014o\u001db\u0006#\u00058x#R#Re\u001el\u0013wRg\u00058x~I\tR#R#\u0004f\u00111Rj\u001fd-p\u001by\u00178xu\u0017`@#\u001cl\u0000n\u0013o\u001by\u0017P\u001by\u0017+[\t{\n\t\t{\n{u\u0017`@#\u001bm\u0001j\bfR>Rv-P\u001by\u00178x\n{\n\u0004f\u00111Rl\u0007w\u0001j\bfI\t{\n{e\u001el\u0013wRn\u001bm\u0016j\u001f#O#\u001fj\u001c+\u001bm\u0001j\bf\\{^#\u001bm\u0001j\bf\\z[8x\n{\n\u0000f\u0006v\u0000mRj\u001cp\u001by\u0017)C3J3\\,\u001fj\u001cg\u001bnI\t{\n\u000f\t\u0004l\u001bgRp\u0006f\u0002+\u001bm\u001dv\u0006#\u001ej\u0011\\\u0006#\u0001*Rxx#R#Ru\u0017`@#\u0006#O#\u0006f\nw\u0007q\u001716+\u0007\\&f\nw\u0007q\u00172^#\u0001-\u0002*\\{\u000b8x#R#Rj\u0014#Zg\u001dwZw^#\u0001-\u0006*R?R3\\3[#\u0006#O#_wI\tR#R#\u0001-\u0006#O#\u00068x#R#Rp\\g\u0005#O#Zb\u0010pZw\\{[#L#\u0013a\u0001+\u0006-\u000b*[<x#R#R#R#Rb\u0010pZ+\u0014q\u0013`\u0006+\u0001-\u0002-\n*R.R3\\6R.Rp\u001bd\u001c+\u0006-\n*[#]#\u0006-\n*R9x#R#R#R#Rb\u0010pZ+\u0014q\u0013`\u0006+\u0001-\u0002-\u000b*R.R3\\6R.Rp\u001bd\u001c+\u0006-\u000b*[#]#\u0006-\u000b*I\tR#R#\u0001-\u0002#Y>R2\\3R)RwR)Rp\\g\u0005#]#\u001bn\u0015\\\u0001j\bfI\tR#R#\u0001-\u0005#Y>R2\\3R)\u0001-\u0016tI\t\u000f\t\u0004l\u001bgRn\u0013j\u001c#Zu\u001dj\u0016*Rxx\nR#\u0014o\u001db\u0006#\u0001j\u0015n\u0013#O#\u0007\\!j\u0015n\u00138x#R#Rj\u001fd-p\u001by\u0017#O#\u001cl\u0000n\u0013o\u001by\u0017P\u001by\u0017+[8x#R#Ru\u0017`@#\u0007uR>Ru-W\u0017{1l\u001dq\u00168x#R#Ru\u0017`F#\u0014b\u0011fI\t{#Re\u001el\u0013wRe\u0013`\u0006l\u00008x#R#Re\u0013`\u0017#O#\u0007\\4b\u0011fB8x#R#Rj\u0014#Z+\u0007u\\{R=Re\u0013`\u0017XB^[%T+\u0007u\\{R?Re\u0013`\u0017X@^[%T+\u0007u\\zR=Re\u0013`\u0017XC^[%T+\u0007u\\zR?Re\u0013`\u0017XA^[*x\nR#\t\tR#R#{\n\u0014b\u0011w\u001dqR>R+\u0014b\u0011f)1/.\u0014b\u0011f)3/*]3\\4I\tR#R#{\n\u0001j\u0015n\u0013#O#\u0001j\u0015n\u0013#X#\u0014b\u0011w\u001dqI\t{#R~x#R#Re\u0013`\u0017#O#\u0007\\4b\u0011fC8x#R#Rj\u0014#Z+\u0007u\\{R=Re\u0013`\u0017XB^[%T+\u0007u\\{R?Re\u0013`\u0017X@^[%T+\u0007u\\zR=Re\u0013`\u0017XC^[%T+\u0007u\\zR?Re\u0013`\u0017XA^[*x#R#R\n{p\u001bd\u001fbR>Rp\u001bd\u001fbR)R+\u0014b\u0011f)1/.\u0014b\u0011f)3/*]3\\4I\tR#R#\u0014b\u0011fR>Rv-E\u0013`\u00171I\tR#R#\u001beR+Zv\u0004-\n#L#\u0014b\u0011f)3/*T%Zv\u0004-\n#N#\u0014b\u0011f)1/*T%Zv\u0004-\u000b#L#\u0014b\u0011f)2/*T%Zv\u0004-\u000b#N#\u0014b\u0011f)0/*[\tR#R#{\n\u0001j\u0015n\u0013#O#\u0001j\u0015n\u0013#X#Ze\u0013`\u0017X@^_e\u0013`\u0017XB^[,B-E8x#R#Re\u001el\u0013wRk\u0013o\u0014T\u001bg\u0006kR>R1\\3R)Rp\u001bd\u001fbI\tR#R#\u0014o\u001db\u0006#\u0006t\u001dP\u001bd\u001fb@#O#@-B#X#\u0001j\u0015n\u0013#X#\u0001j\u0015n\u00138x#R#Ru\u0017`A#\u0011#O#\u0006f\nw\u0007q\u001716+Rv-W\u0017{\u0006v\u0000fB/Rv\u0004#[-\nz\b8x#R#Re\u001el\u0013wRtR>R2\\3I\tR#R#\u001ej\u0011\\\u0006#\u0013/RaI\tR#R#\u0013-\u0002#O#\u0010-\u0002#O#\u0007uI\tR#R#\u0013-\u0006#O#Rw\u0017{\u0006v\u0000f@GZv-W\u0017{\u0006v\u0000fC/Rv\u0004#[-\nzR,Rj\u001fd-p\u001by\u00178x#R#Ra\\wR>R.\u0013-\u00068x#R#Rb\\tR>Ra\\tR>R3\\3I\tR#R#\u0005k\u001bo\u0017#Zb\\tR?Rk\u0013o\u0014T\u001bg\u0006k[#\t\tR#R#R#R#\u0001w\u0017sZb[8x#R#R#R#Re\u001el\u0013wRhR>Rb\\g\u0005#X#\u0017{\u0002+_b\\tR)Rb\\tR,Rw\u0005l!j\u0015n\u00131[8x#R#R#R#R`R(O#\u0019#X#\u0006f\nw\u0007q\u001716+\u0007\\&f\nw\u0007q\u00173^#\u0013-\u0002*\\{\u000byI\tR#R#R#R#\u0005#Y>RhI\tR#R#\u000f\tR#R#\u0005k\u001bo\u0017#Za\\tR?Rk\u0013o\u0014T\u001bg\u0006k[#\t\tR#R#R#R#\u0001w\u0017sZa[8x#R#R#R#Re\u001el\u0013wRhR>Ra\\g\u0005#X#\u0017{\u0002+_a\\tR)Ra\\tR,Rw\u0005l!j\u0015n\u00131[8x#R#R#R#R`R(O#\u0019#X#\u0006f\nw\u0007q\u001716+\u0007\\&f\nw\u0007q\u00173^#\u0010-\u0002*\\{\u000byI\tR#R#R#R#\u0005#Y>RhI\tR#R#\u000f\tR#R#\u0011#]>RtI\tR#R#\u0015o-E\u0000b\u0015@\u001do\u001dqR>Ru\u0017`F+\u0011/R2\\3[8x~x");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f39492L = GLES20.glGetUniformLocation(this.f15543d, "u_Sigma");
        this.f39491K = GLES20.glGetUniformLocation(this.f15543d, "u_Face0");
        this.f39490J = GLES20.glGetUniformLocation(this.f15543d, "u_Face1");
        this.f39489I = GLES20.glGetUniformLocation(this.f15543d, "u_Face2");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f39492L, this.f39486F);
        int i = this.f39491K;
        float[] fArr = this.f39485E;
        GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], fArr[3]);
        int i2 = this.f39490J;
        float[] fArr2 = this.f39488H;
        GLES20.glUniform4f(i2, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        int i3 = this.f39489I;
        float[] fArr3 = this.f39487G;
        GLES20.glUniform4f(i3, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
    }
}
