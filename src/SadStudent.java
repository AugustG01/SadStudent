public class SadStudent {
    private String name;
    private int levelOfEngagement = 0;
    private int expectedExamGrade = 0;

    /*Jeg har kommenteret koden ud fordi jeg fandt ud af at det slet ikke
    var nødvendigt at lave "setter" og "getter", men det var en god indøvelse af dem :D
    */

    public void setName(String name) {
        this.name = name;
    }
   /* public void setLevelOfEngagement(int levelOfEngagement) {
        this.levelOfEngagement = levelOfEngagement;
    }
    public void setExpectedExamGrade(int expectedExamGrade){
        this.expectedExamGrade = expectedExamGrade;
    }*/
    public String getName() {return name;}

   /* public int getLevelOfEngagement()  {return levelOfEngagement;}

    public int getExpectedExamGrade() {return expectedExamGrade;}*/

    public void danceLikeCrazy() {
        levelOfEngagement = levelOfEngagement + 10;
        expectedExamGrade = expectedExamGrade + 1;
        System.out.println("Dit engagement niveau er: " + levelOfEngagement+" "+
                "\nDin forventede karakter: "+expectedExamGrade);
    }
    public void shoutLikeCrazy() {

        levelOfEngagement = levelOfEngagement + 10;
        expectedExamGrade = expectedExamGrade + 10;
        System.out.println("Dit engagement niveau er: " + levelOfEngagement+" "+
                "\nDin forventede karakter: "+expectedExamGrade);
    }
    public void lookLikeAZombie() {

        levelOfEngagement = levelOfEngagement - 10;
        expectedExamGrade = expectedExamGrade - 1;
        System.out.println("Dit engagement niveau er: " + levelOfEngagement+" "+
                "\nDin forventede karakter: "+expectedExamGrade);
    }
    public void ignoreTeacherInspirationalMoves() {

        levelOfEngagement = levelOfEngagement - 10;
        expectedExamGrade = expectedExamGrade - 1;
        System.out.println("Dit engagement niveau er: " + levelOfEngagement+" "+
                "\nDin forventede karakter: "+expectedExamGrade);
    }

}
