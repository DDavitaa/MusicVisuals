package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class RotatingAudioBands extends Visual {


    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
 
    }

    public void setup()
    {
        colorMode(RGB);
        noCursor();
        
        setFrameSize(256);

        startMinim();
<<<<<<< HEAD
        loadAudio("mula.mp3");
=======
        loadAudio("chemicalbond.mp3");
>>>>>>> 3e987da02da50bf475fd3929657ea52384748dd3
        getAudioPlayer().play();
        //startListening(); 
        
    }

    float radius = 200;

    float smoothedBoxSize = 5;

    float rot = 0;

    public void draw()
    {
        calculateAverageAmplitude();
        try
        {
            calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();
        background(255);
        //noFill();
        fill(255, 0, 0);
        stroke(255);
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        camera(0, -500, 500, 0, 0, 0, 0, 1, 0);
        //translate(0, 0, -250);

        rot += getAmplitude() / 8.0f;

        rotateY(rot);
        float[] bands = getSmoothedBands();
        for(int i = 0 ; i < bands.length ; i ++)
        {
            float theta = map(i, 0, bands.length, 0, TWO_PI);

            stroke(map(i, 0, bands.length, 0, 255), 255, 255);
            float x = sin(theta) * radius;
            float z = cos(theta) * radius;
            float h = bands[i];
            pushMatrix();
            translate(x, - h / 2 , z);
            rotateY(theta);
            box(50, h, 50);
            popMatrix();
        }

    }
    float angle = 0;

}