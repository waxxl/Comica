package com.picture.xyz.comica.imageprocessing.c;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;
import com.picture.xyz.comica.imageprocessing.e.a;

/* compiled from: MultiInputFilter */
public abstract class e extends com.picture.xyz.comica.imageprocessing.c.BasicFilter {
    private int[] A;
    protected int[] B;
    protected List<a> C;
    protected List<a> D;
    private int z;

    public e(int i) {
        this.z = i;
        int i2 = i - 1;
        this.A = new int[i2];
        this.B = new int[i2];
        this.C = new ArrayList(i);
        this.D = new ArrayList(i);
    }

    public void G() {
        this.D.clear();
    }

    public void H(a aVar, int i) {
        this.D.remove(aVar);
        this.D.add(i, aVar);
    }

    public synchronized void a(int i, a aVar, boolean z2) {
        if (!this.C.contains(aVar)) {
            this.C.add(aVar);
            if (z2) {
                A();
            }
        }
        int lastIndexOf = this.D.lastIndexOf(aVar);
        if (lastIndexOf == 0) {
            this.j = i;
            v(aVar.l());
            s(aVar.j());
        } else {
            this.B[lastIndexOf - 1] = i;
        }
        if (this.C.size() == this.z) {
            p();
            this.C.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void n() {
        super.n();
        int i = 0;
        while (i < this.z - 1) {
            int[] iArr = this.A;
            int i2 = this.f11439d;
            StringBuilder sb = new StringBuilder();
            sb.append("u_Texture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        int i = 0;
        int i2 = 0;
        while (i < this.z - 1) {
            switch (i) {
                case 0:
                    i2 = 33985;
                    break;
                case 1:
                    i2 = 33986;
                    break;
                case 2:
                    i2 = 33987;
                    break;
                case 3:
                    i2 = 33988;
                    break;
                case 4:
                    i2 = 33989;
                    break;
                case 5:
                    i2 = 33990;
                    break;
                case 6:
                    i2 = 33991;
                    break;
                case 7:
                    i2 = 33992;
                    break;
                case 8:
                    i2 = 33993;
                    break;
            }
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, this.B[i]);
            int i3 = this.A[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }
}
