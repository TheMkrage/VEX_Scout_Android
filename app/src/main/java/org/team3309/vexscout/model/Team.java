package org.team3309.vexscout.model;

import java.util.ArrayList;

/**
 * Created by TheMkrage on 10/5/2015.
 */
public static class Team {
    public String num =  "";
    public String loc  = "";
    public String org  = "";
    public String season  = "";
    public String name = "DEF";

    public String rs = "NA";
    public String ps = "NA";

    public ArrayList<String> competitionID = new ArrayList<String>();
    public ArrayList<Competition> competitions = new ArrayList<Competition>();
    public ArrayList<Award> awards = new ArrayList<Award>();

    // Specific for TEam Profiles
    private int highestScore = 0;
    private int  lostMatchCount = 0;
    private int  lostMatchScoreSum = 0;
    private int winMatchScoreSum = 0;
    private int tieMatchScoreSum = 0;
    private int tieMatchCount  = 0;

    private int lostMatchQualsCount = 0;
    private int lostMatchQualsSum = 0;
    private int  winMatchQualsCount = 0;
    private int winMatchQualsSum = 0;
    private int tieMatchQualsSum = 0;
    private int tieMatchQualsCount = 0;


    private int winMatchCount = 0;
    private int matchCount = 0;
    private int sumOfMatches = 0;
    private int lowestScore = Integer.MAX_VALUE;
    private int spPointsSum = 0;
    private int compCount = 0;
    private int awardCount = 0;
    private int qualCount = 0;



    // For use with comp overview
    public ArrayList<Match> matches = new ArrayList<Award>()
    var statArray: NSMutableArray = NSMutableArray()

    private int wp = 0;

    public Team(String name) {
        this.name = name;
    }
}