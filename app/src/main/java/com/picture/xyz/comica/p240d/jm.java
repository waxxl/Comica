package com.picture.xyz.comica.p240d;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.picture.xyz.comica.p241e.p456a.jh;
import com.picture.xyz.comica.comica.CaricatureActivity;
import com.picture.xyz.comica.comica.ImageviewActivity;
import com.picture.xyz.comica.p246gr.gamebrain.comica.R;
import com.picture.xyz.comica.comica.na;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: d.c */
public abstract class jm {

    /* renamed from: a */
    protected BasicFilter f39360a;

    /* renamed from: b */
    protected String f39361b;

    /* renamed from: d.c$a */
    /* compiled from: jm */
    class C11172a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f39362a;

        /* renamed from: b */
        final /* synthetic */ BasicFilter f39363b;

        /* renamed from: c */
        final /* synthetic */ Activity f39364c;

        C11172a(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39363b = aVar;
            this.f39362a = str;
            this.f39364c = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39363b.mo24145E(this.f39362a, (float) i);
            Activity activity = this.f39364c;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$b */
    /* compiled from: jm */
    class C11173b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f39365a;

        /* renamed from: b */
        final /* synthetic */ Activity f39366b;

        /* renamed from: c */
        final /* synthetic */ BasicFilter f39367c;

        C11173b(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39367c = aVar;
            this.f39365a = str;
            this.f39366b = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39367c.mo24145E(this.f39365a, (float) i);
            Activity activity = this.f39366b;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$c */
    /* compiled from: jm */
    class C11174c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ BasicFilter f39368a;

        /* renamed from: b */
        final /* synthetic */ String f39369b;

        /* renamed from: c */
        final /* synthetic */ Activity f39370c;

        C11174c(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39368a = aVar;
            this.f39369b = str;
            this.f39370c = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39368a.mo24145E(this.f39369b, (float) i);
            Activity activity = this.f39370c;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$d */
    /* compiled from: jm */
    class C11175d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ Activity f39371a;

        /* renamed from: b */
        final /* synthetic */ String f39372b;

        /* renamed from: c */
        final /* synthetic */ BasicFilter f39373c;

        C11175d(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39373c = aVar;
            this.f39372b = str;
            this.f39371a = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39373c.mo24145E(this.f39372b, (float) i);
            Activity activity = this.f39371a;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$e */
    /* compiled from: jm */
    class C11176e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ BasicFilter f39374a;

        /* renamed from: b */
        final /* synthetic */ String f39375b;

        /* renamed from: c */
        final /* synthetic */ Activity f39376c;

        C11176e(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39374a = aVar;
            this.f39375b = str;
            this.f39376c = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39374a.mo24145E(this.f39375b, (float) i);
            Activity activity = this.f39376c;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$f */
    /* compiled from: jm */
    class C11177f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f39377a;

        /* renamed from: b */
        final /* synthetic */ BasicFilter f39378b;

        /* renamed from: c */
        final /* synthetic */ Activity f39379c;

        C11177f(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39378b = aVar;
            this.f39377a = str;
            this.f39379c = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39378b.mo24145E(this.f39377a, (float) i);
            Activity activity = this.f39379c;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$g */
    /* compiled from: jm */
    class C11178g implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ Activity f39380a;

        /* renamed from: b */
        final /* synthetic */ BasicFilter f39381b;

        /* renamed from: c */
        final /* synthetic */ String f39382c;

        C11178g(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39381b = aVar;
            this.f39382c = str;
            this.f39380a = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39381b.mo24145E(this.f39382c, (float) i);
            Activity activity = this.f39380a;
            if (activity instanceof CaricatureActivity) {
                ((CaricatureActivity) activity).mo51941c();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$h */
    /* compiled from: jm */
    class C11179h implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ Activity f39383a;

        /* renamed from: b */
        final /* synthetic */ BasicFilter f39384b;

        /* renamed from: c */
        final /* synthetic */ String f39385c;

        C11179h(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39384b = aVar;
            this.f39385c = str;
            this.f39383a = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39384b.mo24145E(this.f39385c, (float) i);
            Activity activity = this.f39383a;
            if (activity instanceof CaricatureActivity) {
                ((CaricatureActivity) activity).mo51941c();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$i */
    /* compiled from: jm */
    class C11180i implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ BasicFilter f39386a;

        /* renamed from: b */
        final /* synthetic */ String f39387b;

        /* renamed from: c */
        final /* synthetic */ Activity f39388c;

        C11180i(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39386a = aVar;
            this.f39387b = str;
            this.f39388c = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39386a.mo24145E(this.f39387b, (float) i);
            Activity activity = this.f39388c;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: d.c$j */
    /* compiled from: jm */
    class C11181j implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f39389a;

        /* renamed from: b */
        final /* synthetic */ BasicFilter f39390b;

        /* renamed from: c */
        final /* synthetic */ Activity f39391c;

        C11181j(jm cVar, BasicFilter aVar, String str, Activity activity) {
            this.f39390b = aVar;
            this.f39389a = str;
            this.f39391c = activity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f39390b.mo24145E(this.f39389a, (float) i);
            Activity activity = this.f39391c;
            if (activity instanceof ImageviewActivity) {
                ((ImageviewActivity) activity).mo51972h();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: c */
    public static String m48372c(Object obj) {
        String str = (String) obj;
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ 's');
            if (i2 < 0) {
                break;
            }
            i = i2 - 1;
            cArr[i2] = (char) (str.charAt(i2) ^ ';');
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public View mo51863a(String str, Activity activity, BasicFilter aVar) {
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) activity.getSystemService(na.m48766a("\u0007?\u00121\u001e*47\u00058\u0007?\u001f;\u0019"))).inflate(R.layout.seekbar, (ViewGroup) null, false);
        SeekBar seekBar = (SeekBar) linearLayout.findViewById(R.id.seekLine);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.seekleft);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.seekright);
        if (str.equals(jh.f39473h)) {
            imageView.setImageResource(R.drawable.saturation);
            imageView2.setImageResource(R.drawable.saturation);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(20);
            seekBar.setOnSeekBarChangeListener(new C11173b(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39478m)) {
            imageView.setImageResource(R.drawable.syn);
            imageView2.setImageResource(R.drawable.syn);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(10);
            seekBar.setOnSeekBarChangeListener(new C11178g(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39477l)) {
            imageView.setImageResource(R.drawable.small);
            imageView2.setImageResource(R.drawable.big);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(10);
            seekBar.setOnSeekBarChangeListener(new C11179h(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39476k)) {
            imageView.setImageResource(R.drawable.shadow);
            imageView2.setImageResource(R.drawable.shadow);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(20);
            seekBar.setOnSeekBarChangeListener(new C11175d(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39468c)) {
            imageView.setImageResource(R.drawable.br);
            imageView2.setImageResource(R.drawable.br);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(10);
            seekBar.setOnSeekBarChangeListener(new C11174c(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39474i)) {
            imageView.setImageResource(R.drawable.br);
            imageView2.setImageResource(R.drawable.br);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(20);
            seekBar.setOnSeekBarChangeListener(new C11177f(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39467b)) {
            imageView.setImageResource(R.drawable.fuzzy);
            imageView2.setImageResource(R.drawable.fuzzy);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(20);
            seekBar.setOnSeekBarChangeListener(new C11172a(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39470e)) {
            imageView.setImageResource(R.drawable.br);
            imageView2.setImageResource(R.drawable.br);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(10);
            seekBar.setOnSeekBarChangeListener(new C11181j(this, aVar, str, activity));
            return linearLayout;
        } else if (str.equals(jh.f39471f)) {
            imageView.setImageResource(R.drawable.br);
            imageView2.setImageResource(R.drawable.br);
            seekBar.setProgress((int) aVar.mo24144D(str));
            seekBar.setMax(20);
            seekBar.setOnSeekBarChangeListener(new C11176e(this, aVar, str, activity));
            return linearLayout;
        } else {
            if (str.equals(jh.f39469d)) {
                imageView.setImageResource(R.drawable.shadow);
                imageView2.setImageResource(R.drawable.shadow);
                seekBar.setProgress((int) aVar.mo24144D(str));
                seekBar.setMax(10);
                seekBar.setOnSeekBarChangeListener(new C11180i(this, aVar, str, activity));
            }
            return linearLayout;
        }
    }

    /* renamed from: b */
    public String mo51864b() {
        return this.f39361b;
    }

    /* renamed from: d */
    public BasicFilter mo51861d(Context context) {
        return null;
    }

    /* renamed from: e */
    public abstract void mo51862e(LinearLayout linearLayout, Activity activity);

    /* renamed from: f */
    public BasicFilter mo51865f(Context context) {
        BasicFilter aVar = this.f39360a;
        if (aVar != null) {
            return aVar;
        }
        return mo51861d(context);
    }
}
