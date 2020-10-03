package de.volzo.despat.detector;

import android.content.Context;
import android.graphics.RectF;
import android.util.Size;

import java.io.File;
import java.util.List;

import de.volzo.despat.preferences.DetectorConfig;
import de.volzo.despat.userinterface.DrawSurface;

public class DetectorTensorFlowLite extends Detector {

    public DetectorTensorFlowLite(Context context, DetectorConfig config) {
        super(context, config);
    }

    @Override
    public void init() throws Exception {

    }

    @Override
    public void load(File fullFilename) {

    }

    @Override
    public List<Recognition> run() throws Exception {
        return null;
    }

    @Override
    public void save() throws Exception {

    }

    @Override
    public void runBenchmark() {

    }

    @Override
    public void display(DrawSurface surface, Size imageSize, List<RectF> rectangles, DetectorConfig detectorConfig) {

    }
}
