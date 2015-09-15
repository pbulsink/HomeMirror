package com.morristaedt.mirror.modules;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by HannahMitt on 8/23/15.
 */
public class BirthdayModule {

    private static HashMap<String, String> mBirthdayMap;

    static {
        mBirthdayMap = new HashMap<>();
        mBirthdayMap.put("1/14","John Depooter");
        mBirthdayMap.put("1/27","Benjamin Cassell");
        mBirthdayMap.put("2/3","Tim Annan");
        mBirthdayMap.put("2/7","Amanda Brouwer");
        mBirthdayMap.put("2/7","Sean Dineley");
        mBirthdayMap.put("2/18","Dirk-Jan Bulsink");
        mBirthdayMap.put("4/8","Colin Van Dyk");
        mBirthdayMap.put("4/8","David Bellamy");
        mBirthdayMap.put("4/16","Michael Nyman");
        mBirthdayMap.put("5/15","Leanne Bulsink");
        mBirthdayMap.put("5/16","Derek Bulsink");
        mBirthdayMap.put("5/26","Brian Malecki");
        mBirthdayMap.put("5/27","Jedidiah I");
        mBirthdayMap.put("6/1","Sean Robertson");
        mBirthdayMap.put("6/8","Bernd-Jan Bulsink");
        mBirthdayMap.put("6/9","Erin Oudyk");
        mBirthdayMap.put("6/10","Danielle Brouwer");
        mBirthdayMap.put("6/20","Yvonne Westra");
        mBirthdayMap.put("6/27","Meghan Murphy");
        mBirthdayMap.put("6/30","Cathy VanArragon");
        mBirthdayMap.put("7/3","Andrew Noble");
        mBirthdayMap.put("7/8","Christina Schipper");
        mBirthdayMap.put("7/15","Jon Mak");
        mBirthdayMap.put("7/22","Eric Duivesteyn");
        mBirthdayMap.put("7/28","Arlene VanReenen");
        mBirthdayMap.put("8/1","Philip Bulsink");
        mBirthdayMap.put("8/4","Graham Dow");
        mBirthdayMap.put("8/15","Anke Bulsink");
        mBirthdayMap.put("8/22","Sonny Ford");
        mBirthdayMap.put("8/24","Laura Keck");
        mBirthdayMap.put("8/24","Bryan Rayner");
        mBirthdayMap.put("8/27","Rose Noble");
        mBirthdayMap.put("9/11","Mouy Bos");
        mBirthdayMap.put("9/19","Tianna Burke");
        mBirthdayMap.put("9/21","David Beking");
        mBirthdayMap.put("9/28","Kenneth Gehrels");
        mBirthdayMap.put("9/30","Naim Hilal");
        mBirthdayMap.put("9/30","Simon VanReenen");
        mBirthdayMap.put("10/28","Gerrit Dykhouse");
        mBirthdayMap.put("11/11","Kurtis Baute");
        mBirthdayMap.put("11/11","Robert Brodie");
        mBirthdayMap.put("11/17","Katie Elliott");
        mBirthdayMap.put("11/23","Casey Devet");
        mBirthdayMap.put("11/23","Brian Devet");
        mBirthdayMap.put("12/2","Kris Beking");
        mBirthdayMap.put("12/3","Martin Stuart");
        mBirthdayMap.put("12/15","John Beking");
        mBirthdayMap.put("12/16","Bill Szolga");
        mBirthdayMap.put("12/18","Harmen Bulsink");
        mBirthdayMap.put("12/18","Ron Hosmar");
    }

    public static String getBirthday() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/d", Locale.US);
        return mBirthdayMap.get(simpleDateFormat.format(new Date()));
    }
}
