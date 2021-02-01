public class Question {

    private long questionID;
    private String gameName;
    private String category;
    private int startingPoints;
    private int currentPoints;
    private String scrambledGameName;
    private String hiddenGameName;
    private int hintCount;

    public Question(long questionID, String gameName, String category) {
        this.questionID = questionID;
        this.gameName = gameName.toUpperCase();
        this.category = category;
        this.startingPoints = this.gameName.replaceAll("\\s", "").length();
        this.currentPoints = this.startingPoints;
        this.scrambledGameName = ScrambleStringUtilities.scrambleGameName(this.gameName);
        this.hiddenGameName = ScrambleStringUtilities.getHyphenedString(this.gameName);
        this.hintCount = 0;
    }

    public long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(long questionID) {
        this.questionID = questionID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStartingPoints() {
        return startingPoints;
    }

    public void setStartingPoints(int startingPoints) {
        this.startingPoints = startingPoints;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public String getScrambledGameName() {
        return scrambledGameName;
    }

    public void setScrambledGameName(String scrambledGameName) {
        this.scrambledGameName = scrambledGameName;
    }

    public String getHiddenGameName() {
        return hiddenGameName;
    }

    public void setHiddenGameName(String getHyphenedWord) {
        this.hiddenGameName = getHyphenedWord;
    }
}
