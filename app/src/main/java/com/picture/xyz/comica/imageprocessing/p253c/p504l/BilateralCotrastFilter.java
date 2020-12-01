package com.picture.xyz.comica.imageprocessing.p253c.p504l;

import android.opengl.GLES20;
import com.picture.xyz.comica.imageprocessing.p253c.BasicFilter;

/* renamed from: com.picture.xyz.comica.imageprocessing.c.l.a */
public class BilateralCotrastFilter extends BasicFilter {

    /* renamed from: A */
    private float f41142A;

    /* renamed from: B */
    private float f41143B = 0.5f;

    /* renamed from: z */
    private int f41144z;

    public BilateralCotrastFilter(float f, int i) {
        this.f41143B = f;
        this.f41142A = (float) i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24141i() {
        return "precision highp float;\nuniform sampler2D u_Texture0;\nvarying vec2 v_TexCoord;\nuniform float u_Radius;\n#define BLENDCOEFF  (" + this.f41143B + ") // negative => cartoon effect\n#define BLENDCMIN   (-2.)\n#define BLENCCMAX   (1.)\n#define SPACESMOOTH (2./1.41)\n#define INTENSITYSMOOTH (0.12) // 0.12\n#define EPSILON \t(1e-15)\n#define LUMWEIGHT   (vec4(0.2126,0.7152,0.0722,0.))\n#define UNMIX(t,a,b) ( clamp( (t-a)/(b-a) , 0. , 1.) )\nvoid main()\n{\n    vec4 pixelColor = texture2D(" + "u_Texture0" + "," + "v_TexCoord" + ");\n    vec4 fragColor = vec4(0.);\n    vec2 space = vec2(1./256.);\n    float sum = 0.;\n    float coeff;\n    vec4 diff;\n    vec4 color = vec4(0.);\n    int RADIUS = int(" + "u_Radius" + ");\n    int DIAMETER = 2*RADIUS+1;\n    float IntensitySmooth2 = INTENSITYSMOOTH*INTENSITYSMOOTH;\n    float SpaceSmooth2 = float(RADIUS*RADIUS)*SPACESMOOTH*SPACESMOOTH;\n    for( int i = -RADIUS ; i <= RADIUS ; i++ ){\n        for( int j = -RADIUS ; j <= RADIUS ; j++ ){\n            color = texture2D(" + "u_Texture0" + "," + "v_TexCoord" + "+space*vec2(i,j));\n            diff = color - pixelColor;\n            coeff = exp( -(\n                  dot(diff*diff,LUMWEIGHT)/IntensitySmooth2\n                + float(i*i+j*j)/SpaceSmooth2 ) );\n            //color = log(color+EPSILON);\n            if( i == -RADIUS && j == -RADIUS ){\n            \tfragColor = color*coeff;\n            } else {\n            \tfragColor += color*coeff;\n            }\n            sum += coeff;\n            \n        }\n    }\n\tfragColor = fragColor/sum;\n    diff = pixelColor - fragColor;\n    // uncertainty : http://people.csail.mit.edu/fredo/PUBLI/Siggraph2002/DurandBilateral.pdf\n    // if sum is too low we don't want to increases local contrast\n    coeff = 1.;\n    coeff = UNMIX( log(sum/float(DIAMETER*DIAMETER)) , BLENDCMIN , BLENCCMAX );\n    gl_FragColor = pixelColor + coeff*BLENDCOEFF*diff;\n}\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24142n() {
        super.mo24142n();
        this.f41144z = GLES20.glGetUniformLocation(this.f15543d, "u_Radius");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24143q() {
        super.mo24143q();
        GLES20.glUniform1f(this.f41144z, this.f41142A);
    }
}
