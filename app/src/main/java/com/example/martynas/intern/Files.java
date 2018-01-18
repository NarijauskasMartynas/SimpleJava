package com.example.martynas.intern;

import java.io.File;

/**
 * Created by Martynas on 1/16/2018.
 */

public class Files {
    File folder = new File("D:\\Projects\\raw");
    public File[] filesList = folder.listFiles();
}
