package com.picture.xyz.comica.p240d;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import com.picture.xyz.comica.p243f.p244a.p245a.s;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;

import com.picture.xyz.comica.comica.q;

/* renamed from: d.i */
/* compiled from: r */
public class C4228i {

    /* renamed from: a */
    ArrayList<jm> f15486a = new ArrayList<>();

    /* renamed from: b */
    Typeface f15487b;

    /* renamed from: c */
    C11182e f15488c;

    /* renamed from: d */
    Context f15489d;

    /* renamed from: e */
    ImageView f15490e;

    /* renamed from: f */
    private LayoutInflater f15491f;

    /* renamed from: d.i$a */
    /* compiled from: r */
    class C4229a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ jm f15493b;

        C4229a(jm cVar) {
            this.f15493b = cVar;
        }

        public void onClick(View view) {
            ImageView imageView = C4228i.this.f15490e;
            if (imageView != null) {
                imageView.setBackgroundColor(0);
            }
            C4228i iVar = C4228i.this;
            if (iVar.f15490e == view) {
                iVar.f15488c.mo51896b(new rn(C4228i.this.f15489d));
                C4228i.this.f15490e = null;
                return;
            }
            try {
                iVar.f15488c.mo51896b(this.f15493b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C4228i.this.f15490e = (ImageView) view;
            //view.setBackgroundResource(R.drawable.selected);
        }
    }

    public C4228i(Context context, boolean z) {
        new HashMap();
        this.f15490e = null;
        new PorterDuffColorFilter(-256, PorterDuff.Mode.DST_ATOP);
        this.f15489d = context;
        this.f15487b = Typeface.createFromAsset(context.getAssets(), q.m48751b("9(13,h\u0014(2.4&p\f\u0010\n\u0016\f\u001e\u000f\u001di+39"));
    }

    /* renamed from: a */
    public static String m21095a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ '9');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ ']');
        }
        return new String(cArr);
    }

    /* renamed from: d */
    private /* synthetic */ void m21096d(jm cVar) {
        this.f15486a.add(cVar);
    }

    /* renamed from: b */
    public void mo24137b(LinearLayout linearLayout) {
        m21096d(new ad(this.f15489d));
        m21096d(new gh(this.f15489d));
        m21096d(new ao(this.f15489d));
        m21096d(new mo(this.f15489d));
        m21096d(new nf(this.f15489d));
        m21096d(new jd(this.f15489d));
        m21096d(new qe(this.f15489d));
        m21096d(new cl(this.f15489d));
        m21096d(new uh(this.f15489d));
        m21096d(new ge(this.f15489d));
        m21096d(new of(this.f15489d));
        if (true) {
            m21096d(new ke(this.f15489d));
            m21096d(new dk(this.f15489d));
            m21096d(new qj(this.f15489d));
            m21096d(new kj(this.f15489d));
            m21096d(new ld(this.f15489d));
            m21096d(new co(this.f15489d));
            m21096d(new cj(this.f15489d));
            m21096d(new ef(this.f15489d));
            m21096d(new wf(this.f15489d));
            m21096d(new tn(this.f15489d));
            m21096d(new oe(this.f15489d));
            m21096d(new zl(this.f15489d));
            m21096d(new rm(this.f15489d));
            m21096d(new xj(this.f15489d));
            m21096d(new ri(this.f15489d));
            m21096d(new qf(this.f15489d));
            m21096d(new zm(this.f15489d));
            m21096d(new mf(this.f15489d));
            m21096d(new yd(this.f15489d));
            m21096d(new ei(this.f15489d));
            m21096d(new ml(this.f15489d));
        }
        ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).gravity = 8388611;
        Context context = this.f15489d;
        this.f15488c = (C11182e) context;
        this.f15491f = (LayoutInflater) context.getSystemService(s.m48664a("'\u00132\u001d>\u0006\u0014\u001b%\u0014'\u0013?\u00179"));
        int i = 0;
        while (i < this.f15486a.size()) {
            i++;
            mo24138c(linearLayout, this.f15486a.get(i));
        }
    }

    /* renamed from: c */
    public void mo24138c(LinearLayout linearLayout, jm cVar) {
        View inflate = this.f15491f.inflate(R.layout.action_layout, linearLayout, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.menuImage);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.selected);
        imageView2.setClickable(true);
        imageView2.setOnClickListener(new C4229a(cVar));
        TextView textView = (TextView) inflate.findViewById(R.id.textfilter);
        textView.setText(cVar.mo51864b().toUpperCase());
        textView.setTypeface(this.f15487b);
        linearLayout.addView(inflate, linearLayout.getChildCount());
    }
}
