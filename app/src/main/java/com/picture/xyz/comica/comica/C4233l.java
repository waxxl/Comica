package com.picture.xyz.comica.comica;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;

/* renamed from: gr.gamebrain.comica.l */
/* compiled from: e */
public class C4233l extends OrientationEventListener {

    /* renamed from: a */
    final /* synthetic */ ComikaApplication f15538a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4233l(ComikaApplication comikaApplication, Context context) {
        super(context);
        this.f15538a = comikaApplication;
    }

    public void onOrientationChanged(int i) {
        int unused = this.f15538a.f15524c = i;
        Iterator it = this.f15538a.f15522a.iterator();
        while (it.hasNext()) {
            ((C11207c) it.next()).mo52014A(i);
        }
    }
}
