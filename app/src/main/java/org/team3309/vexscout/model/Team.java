package org.team3309.vexscout.model;

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
    public ArrayList<Competition> competitions = new ArrayList<Competition>(();
    var awards: NSMutableArray! = NSMutableArray()

    // Specific for TEam Profiles
    var highestScore: NSInteger = 0
    var lostMatchCount: NSInteger = 0
    var lostMatchScoreSum: NSInteger = 0
    var winMatchScoreSum: NSInteger = 0
    var tieMatchScoreSum: NSInteger = 0
    var tieMatchCount: NSInteger = 0

    var lostMatchQualsCount: NSInteger = 0
    var lostMatchQualsSum: NSInteger = 0
    var winMatchQualsCount: NSInteger = 0
    var winMatchQualsSum: NSInteger = 0
    var tieMatchQualsSum: NSInteger = 0
    var tieMatchQualsCount: NSInteger = 0


    var winMatchCount: NSInteger = 0
    var matchCount: NSInteger = 0
    var sumOfMatches: NSInteger = 0
    var lowestScore: NSInteger = NSInteger.max
    var spPointsSum: NSInteger = 0
    var compCount: NSInteger = 0
    var awardCount: NSInteger = 0
    var qualCount: NSInteger = 0



    // For use with comp overview
    var matches:NSMutableArray! = NSMutableArray()
    var statArray: NSMutableArray = NSMutableArray()

    var wp: NSInteger = 0

    public Team(String name) {
        this.name = name;
    }
}