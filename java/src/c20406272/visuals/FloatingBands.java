package c20406272.visuals;

import processing.core.*;

public class FloatingBands
{
    Mula mula;
    float rot = 0;
    float rot2 = 0;
    

    public FloatingBands(Mula mula)
    {
        this.mula = mula; 
    }

    public void drawCircles()
    {
        for(int i=0; i <=5; i++)
        {
            mula.pushMatrix();
            mula.noFill();
            mula.translate(mula.width/4+i*mula.width/13,mula.height/3+i*mula.width/15,i*-mula.width/14.2f-mula.width/256);
            mula.rotateY(PApplet.radians(-35));
            mula.rotateX(PApplet.radians(35));
            mula.circle(0,0, mula.width/5 + mula.getSmoothedBands()[i] * 0.2f);
            mula.popMatrix();
        }

        for(int i=0; i <=5; i++)
        {
            mula.pushMatrix();
            mula.noFill();

            mula.translate(mula.width-mula.width/11-i*mula.width/20,mula.height/3+i*mula.width/200,i*-mula.width/6.4f-mula.width/256);
            mula.rotateX(PApplet.radians(10));
            mula.rotateY(PApplet.radians(15));
           
            mula.circle(0,0, mula.width/5 + mula.getSmoothedBands()[i] * 0.2f);
            mula.popMatrix();
        }
    }

    public void drawBands(float gap)
    {
        for(int i = 0 ; i < mula.getBands().length ; i ++)
        {
            mula.fill(PApplet.map(i, 0, mula.getBands().length, 255, 0), 200, 255);

            mula.strokeWeight(2);

            mula.pushMatrix();
            mula.translate(mula.width/4,mula.height/4,0);
            mula.rotateY(PApplet.radians(85));
            mula.rotateX(PApplet.radians(45));
            mula.rotateZ(PApplet.radians(45));

            mula.translate(i * gap, 0, -100);
            mula.rotateX(PApplet.radians(rot));
            
            
            mula.box(gap, mula.width/80+mula.getSmoothedBands()[i] * 0.2f, mula.width/80+mula.getSmoothedBands()[i] * 0.2f);
            mula.popMatrix();
        }

        for(int i = 0 ; i < mula.getBands().length ; i ++)
        {
            mula.fill(PApplet.map(i, 0, mula.getBands().length, 255, 0), 200, 255);

            mula.strokeWeight(2);

            mula.pushMatrix();
            mula.translate(mula.width-mula.width/10,mula.height/4,0);
            mula.rotateY(PApplet.radians(160));
            mula.rotateX(PApplet.radians(90));
            mula.rotateZ(PApplet.radians(55));

            mula.translate(i * gap, 0, -100);
            mula.rotateX(PApplet.radians(-rot));
            
            
            mula.box(gap, mula.width/80+mula.getSmoothedBands()[i] * 0.2f, mula.width/80+mula.getSmoothedBands()[i] * 0.2f);
            mula.popMatrix();
        }
    }

    public void drawCubes()
    {
        mula.noFill();
        mula.stroke(127,255,255);

        mula.pushMatrix();
        mula.translate(mula.width-mula.width/5,mula.height-mula.height/7,-mula.width/10);
        mula.rotateX(rot2);
        mula.rotateY(rot2);
        mula.rotateZ(-rot2);
        mula.box(mula.width/15+mula.getSmoothedBands()[1] * 0.3f, mula.width/15+mula.getSmoothedBands()[4] * 0.3f, mula.width/15+mula.getSmoothedBands()[6] * 0.3f);
        mula.popMatrix();

        mula.fill(0,0,255);
        mula.pushMatrix();
        mula.translate(mula.width-mula.width/5,mula.height-mula.height/7,-mula.width/10);
        mula.rotateX(rot2);
        mula.rotateY(rot2);
        mula.rotateZ(-rot2);
        mula.box(mula.width/50+mula.getSmoothedBands()[1] * 0.3f, mula.width/50+mula.getSmoothedBands()[4] * 0.3f, mula.width/50+mula.getSmoothedBands()[6] * 0.3f);
        mula.popMatrix();


        mula.noFill();
        mula.stroke(127,255,255);

        mula.pushMatrix();
        mula.translate(mula.width/2,mula.height/5,-mula.width/6);
        mula.rotateX(-rot2);
        mula.rotateY(-rot2);
        mula.rotateZ(rot2);
        mula.box(mula.width/30+mula.getSmoothedBands()[1] * 0.3f, mula.width/30+mula.getSmoothedBands()[4] * 0.3f, mula.width/30+mula.getSmoothedBands()[6] * 0.3f);
        mula.popMatrix();

        mula.fill(0,0,255);
        mula.pushMatrix();
        mula.translate(mula.width/2,mula.height/5,-mula.width/6);
        mula.rotateX(-rot2);
        mula.rotateY(-rot2);
        mula.rotateZ(rot2);
        mula.box(mula.width/100+mula.getSmoothedBands()[1] * 0.3f, mula.width/100+mula.getSmoothedBands()[4] * 0.3f, mula.width/100+mula.getSmoothedBands()[6] * 0.3f);
        mula.popMatrix();


        mula.noFill();
        mula.stroke(127,255,255);

        mula.pushMatrix();
        mula.translate(mula.width/50,mula.height-mula.height/7,-mula.width/6);
        mula.rotateX(-rot2);
        mula.rotateY(rot2);
        mula.rotateZ(rot2);
        mula.box(mula.width/8+mula.getSmoothedBands()[1] * 0.3f, mula.width/8+mula.getSmoothedBands()[4] * 0.3f, mula.width/8+mula.getSmoothedBands()[6] * 0.3f);
        mula.popMatrix();

        mula.fill(0,0,255);
        mula.pushMatrix();
        mula.translate(mula.width/50,mula.height-mula.height/7,-mula.width/6);
        mula.rotateX(-rot2);
        mula.rotateY(rot2);
        mula.rotateZ(rot2);
        mula.box(mula.width/30+mula.getSmoothedBands()[1] * 0.3f, mula.width/30+mula.getSmoothedBands()[4] * 0.3f, mula.width/30+mula.getSmoothedBands()[6] * 0.3f);
        mula.popMatrix();
    }

    public void render()
    {
        mula.colorMode(PApplet.HSB);
        float gap = mula.width / (float) mula.getBands().length;

        rot += mula.getSmoothedBands()[1]*0.01f;
        mula.stroke(0,0,255);
        mula.strokeWeight(5);

        drawCircles();

        drawBands(gap);

        rot2 += 0.01f;

        drawCubes();
        

    }
}