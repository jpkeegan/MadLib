public class MadLib {
    String adj1;
    String adj2;
    String noun1;
    String noun2;
    String noun3;
    String prof;
    int num;

    public MadLib(String adj1, String adj2, String noun1, String noun2,
                  String noun3, String prof, int num){
        this.adj1 = adj1;
        this.adj2 = adj2;
        this.noun1 = noun1;
        this.noun2 = noun2;
        this.noun3 = noun3;
        this.prof = prof;
        this.num = num;
    }

    public String potterMadLib(){
        String madLib = "Bertie and Bott's every flavor beans! They mean" +
                "every flavor!\nSome of them are tasty but some are just " +
                adj1 + "! There's chocolate\nand "+ noun1 + ", and there's also" +
                " spinach and " +noun2+ ", George swears he got a " +noun3+
                "\nflavored one once! What about... These aren't real frogs"+
                " are they?\nOh, it's just a spell. Besides it's the cards you want!"+
                " Each pack's got a\n" + adj2 + " witch or "+prof+"! I've got about "+
                num+" myself.";
        return madLib;
    }

}
